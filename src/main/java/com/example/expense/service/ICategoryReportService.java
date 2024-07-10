package com.example.expense.service;

import com.example.expense.model.Expense;
import com.example.expense.model.request.ReportRequest;
import com.example.expense.model.response.MonthlyReport;

import java.util.List;

public interface ICategoryReportService {
    List<MonthlyReport> prepareReport(ReportRequest reportRequest, List<Expense> expenseList);
}
