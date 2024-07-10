package com.example.expense.service;

import com.example.expense.helper.ExpenseToReportConvertor;
import com.example.expense.model.Expense;
import com.example.expense.model.request.ReportRequest;
import com.example.expense.model.response.MonthlyReport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.expense.constant.CategoryMappings.SUB_CATEGORIES;

@Service
public class SubCategoryReportService implements ICategoryReportService{
    private static final Logger logger = LoggerFactory.getLogger(SubCategoryReportService.class);

    @Override
    public List<MonthlyReport> prepareReport(ReportRequest reportRequest, List<Expense> expenseList) {
        expenseList = expenseList.stream().filter(expense -> SUB_CATEGORIES.contains(expense.getCategory())).toList();
        return ExpenseToReportConvertor.getInstance().prepareReportListFromExpenseList(expenseList, reportRequest);
    }
}
