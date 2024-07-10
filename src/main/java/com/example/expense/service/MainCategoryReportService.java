package com.example.expense.service;

import com.example.expense.helper.ExpenseToReportConvertor;
import com.example.expense.model.Expense;
import com.example.expense.model.request.ReportRequest;
import com.example.expense.model.response.MonthlyReport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.expense.constant.CategoryMappings.MAIN_CATEGORIES;

@Service
public class MainCategoryReportService implements ICategoryReportService {
    private static final Logger logger = LoggerFactory.getLogger(MainCategoryReportService.class);

    @Override
    public List<MonthlyReport> prepareReport(ReportRequest reportRequest, List<Expense> expenseList) {
        expenseList = expenseList.stream().filter(expense -> MAIN_CATEGORIES.contains(expense.getCategory())).toList();
        return ExpenseToReportConvertor.getInstance().prepareReportListFromExpenseList(expenseList, reportRequest);
    }

}
