package com.example.expense.service.main;

import com.example.expense.entity.ExpenseEntity;
import com.example.expense.model.enums.Month;
import com.example.expense.model.request.NewExpense;
import com.example.expense.model.request.ReportRequest;
import com.example.expense.model.response.MonthlyReport;
import com.example.expense.service.ExpenseService;
import com.example.expense.service.ReportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

import static java.util.Collections.reverseOrder;
import static java.util.Comparator.comparing;

@Service
public class ExpenseManagementService {
    Logger logger = LoggerFactory.getLogger(ExpenseManagementService.class);
    ReportService reportService;
    ExpenseService expenseService;

    @Autowired
    public ExpenseManagementService(ReportService reportService, ExpenseService expenseService) {
        this.reportService = reportService;
        this.expenseService = expenseService;
    }

    public List<MonthlyReport> getReport(ReportRequest reportRequest) {
        return reportService.getReport(reportRequest);
    }

    public boolean addExpense(NewExpense newExpense) {
        try {
            expenseService.saveExpense(newExpense);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    public List<ExpenseEntity> getExpenseByDateRange(LocalDate startDate, LocalDate endDate){
        return expenseService.getExpenseByDateRange(startDate, endDate);
    }

    public List<ExpenseEntity> getExpensesByMonth(Integer year, Month month, Integer page, Integer itemsPerPage, String sortField, String sortOrder){
        List<ExpenseEntity> sortedExpenses = expenseService.getExpenseEntitiesByMonthAndYear(year, month)
                .stream()
                .sorted(comparing(ExpenseEntity::getDate, reverseOrder())
                        .thenComparing(ExpenseEntity::getId, reverseOrder()))
                .toList();
        logger.info("sortedExpenses -> {}",sortedExpenses);

        if(page == null || itemsPerPage == null) return sortedExpenses;

        if(itemsPerPage > sortedExpenses.size()) itemsPerPage = sortedExpenses.size();

        int startIndex = (page-1) * itemsPerPage;
        int endIndex = startIndex+itemsPerPage;

        if(endIndex > sortedExpenses.size()) endIndex = sortedExpenses.size();

        if(startIndex > sortedExpenses.size() || endIndex > sortedExpenses.size()){
            throw new RuntimeException("No data available for pageNo: "+page);
        }
        return sortedExpenses.subList(startIndex, endIndex);

    }

}
