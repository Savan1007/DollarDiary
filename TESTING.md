# Test Plan

## Table of Contents
1. [Introduction](#introduction)
2. [Test Plan](#test-plan)
   - [Testing Methodologies](#testing-methodologies)
3. [Test Cases](#test-cases)
   - [User Registration and Login](#user-registration-and-login)
   - [Expense Logging](#expense-logging)
   - [Budget Setting and Management](#budget-setting-and-management)
   - [Report Generation](#report-generation)
4. [Test Execution](#test-execution)
5. [Testing Summary](#testing-summary)

## Introduction

This document outlines the test plan for the DollarDiary application. It includes a detailed description of test cases, methodologies, and their purpose to ensure comprehensive testing of the application.

## Test Plan

### Testing Methodologies

#### Path Testing
- **Objective**: To verify that all possible execution paths in each function are tested.
- **Approach**: Ensure every function, such as expense logging, is tested for all its execution paths to uncover any hidden bugs.

#### Data Flow Testing
- **Objective**: To ensure that data flows correctly through the application.
- **Approach**: Track data from initialization to final output, validating that all variables are correctly managed and used.

#### Logic Coverage
- **Objective**: To test all logical conditions within the application.
- **Approach**: Verify that all logical branches, such as if-else statements in budget setting, are tested for correctness.

#### Integration Testing
- **Objective**: To confirm that different components of the application interact correctly.
- **Approach**: Test the interactions between various components, such as expense logging and dashboard updates, to ensure they work seamlessly together.

#### [Boundary Value Testing](Test%20Planning/Boundary_Value_Analysis.md#robust-boundary-value-analysis)
- **Objective**: To ensure the application handles edge cases effectively.
- **Approach**: Test boundary values for inputs, such as minimum and maximum expense amounts, to ensure correct handling of edge cases.

#### [Equivalence Class Testing](Test%20Planning/Equivalence_Class_Testing.md#strong-robust-equivalence-class-testing)
- **Objective**: To validate the application's behavior for representative input values.
- **Approach**: Group inputs into equivalence classes and test representative values from each class to ensure correct application behavior.

#### [Decision Tables Testing](Test%20Planning/Decision_table.md#dicision-table-based-testing)
- **Objective**: To ensure the application's decision-making logic is accurate.
- **Approach**: Use decision tables to test features like report generation based on different input scenarios and conditions.

#### [State Transition Testing](Test%20Planning/State_Transition.md#state-transition)
- **Objective**: To verify correct state transitions within the application.
- **Approach**: Test transitions such as logging in, logging an expense, and logging out to ensure the application manages state transitions correctly.

#### [Use Case Testing](Test%20Planning/Use_case_diagram_testing.md#use-case-based-testing)
- **Objective**: To validate the application against various user scenarios.
- **Approach**: Create and test use cases based on expected user interactions and workflows to ensure the application performs as intended.

## Test Cases

### User Registration and Login

#### User Registration
- **Test Case 1**: **Successful Registration**
  - **Description**: Verify that a new user can register with valid data.
  - **Expected Result**: User is successfully registered and redirected to the login page.

- **Test Case 2**: **Login with Valid Credentials**
  - **Description**: Ensure that a user can log in with valid credentials.
  - **Expected Result**: User is successfully logged in and redirected to the dashboard.

- **Test Case 3**: **Login with Invalid Credentials**
  - **Description**: Verify that login fails with invalid credentials.
  - **Expected Result**: Login attempt fails with an error message indicating invalid credentials.

### Expense Logging

#### Adding an Expense
- **Test Case 1**: **Add Expense with All Required Fields**
  - **Description**: Ensure an expense can be added with date, amount, category, and description.
  - **Expected Result**: Expense is added successfully and visible in the expense list.

#### Updating an Expense
- **Test Case 2**: **Update Existing Expense**
  - **Description**: Verify that an existing expense can be updated.
  - **Expected Result**: Expense details are updated and displayed correctly.

#### Deleting an Expense
- **Test Case 3**: **Delete Expense**
  - **Description**: Ensure that an expense can be deleted.
  - **Expected Result**: Expense is removed from the list and no longer visible.

### Budget Setting and Management

#### Updating a Budget
- **Test Case 1**: **Update Budget**
  - **Description**: Verify that an existing budget can be updated.
  - **Expected Result**: Budget amount is updated and displayed correctly.

### Report Generation

#### Monthly Report
- **Test Case 1**: **Generate Monthly Report**
  - **Description**: Verify that a monthly report is generated correctly.
  - **Expected Result**: Monthly report is generated and includes accurate expense details.

## Test Execution

- **Tools**: Automated tests using JUnit.
- **Environment**: Testing performed in a development environment with the latest build of the application.

## Testing Summary

The outlined test cases ensure comprehensive coverage of the DollarDiary application, validating its functionality, data integrity, logic, and user interactions. Each test case is designed to uncover potential issues and ensure the application meets its requirements and provides a seamless user experience.

For detailed test results and execution logs, please refer to the test execution reports available in the project repository.
