package com.example.expense.service;

import com.example.expense.model.Expense;
import com.example.expense.model.enums.Category;
import com.example.expense.model.enums.Month;
import com.example.expense.model.request.ReportRequest;
import com.example.expense.model.response.MonthlyReport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReportService {
    Logger logger = LoggerFactory.getLogger(ReportService.class);
    MainCategoryReportService mainCategoryReportService;
    SubCategoryReportService subCategoryReportService;
    ExpenseService expenseService;

    @Autowired
    public ReportService(MainCategoryReportService mainCategoryReportService, SubCategoryReportService subCategoryReportService, ExpenseService expenseService) {
        this.mainCategoryReportService = mainCategoryReportService;
        this.subCategoryReportService = subCategoryReportService;
        this.expenseService = expenseService;
    }

    public List<MonthlyReport> getReport(ReportRequest reportRequest) {
        List<Expense> expenseList;
        if (Month.ALL.equals(reportRequest.getMonth())) {
            expenseList = expenseService.getAllExpensesByYear((reportRequest.getYear() == 0) ? LocalDate.now().getYear() : reportRequest.getYear(), reportRequest);
        } else {
            // this call generally aims to get the specific month data of the current year
            expenseList = expenseService.getExpensesByMonthAndYear(reportRequest);
        }
        return prepareReportFromExpenses(reportRequest, expenseList);
    }

    private List<MonthlyReport> prepareReportFromExpenses(ReportRequest reportRequest, List<Expense> expenseList) {
        if (Category.MAIN.equals(reportRequest.getCategory())) {
            return mainCategoryReportService.prepareReport(reportRequest, expenseList);
        } else {
            return subCategoryReportService.prepareReport(reportRequest, expenseList);
        }
    }

}
