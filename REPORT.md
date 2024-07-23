# ENSE 375 – Software Testing and Validation

![UofR](Assests/UofRlogo1.png)

# DollarDiary

**Team Members:**

- Aliasgar Saifeebhai Mithawala – 200517808
- Savan Rameshbhai Pedhadiya – 200517532
- Jay Bharatkumar Panchal - 200518664

## Table of Contents

- [1. Introduction](#1-introduction)
- [2. Design Problem](#2design-problem)
  - [2.1 Problem Definition](#21-problem-definition)
  - [2.2 Design Requirements](#22-design-requirements)
    - [2.2.1 Functions](#221-functions)
    - [2.2.2 Objectives](#222-objectives)
    - [2.2.3 Constraints](#223-constraints)
- [3. Solution](#3-solution)
  - [3.1 Solution 1](#31-solution-1)
  - [3.2 Solution 2](#32-solution-2)
  - [3.3 Final Solution](#33-final-solution)
    - [3.3.1 Components](#331-components)
    - [3.3.2 Features](#332-features)
    - [3.3.3 Environmental, Societal, Safety, and Economic Considerations](#333-environmental-societal-safety-and-economic-considerations)
    - [3.3.4 Test Cases and Results](#334-test-cases-and-results)
    - [3.3.5 Limitations](#335-limitations)
- [4. Team Work](#4-team-work)
  - [4.1 Meeting 1](#41-meeting-1)
  - [4.2 Meeting 2](#42-meeting-2)
  - [4.3 Meeting 3](#43-meeting-3)
  - [4.4 Meeting 4](#44-meeting-4)
  - [4.5 Meeting 5](#45-meeting-5)
  - [4.6 Meeting 6](#46-meeting-6)
  - [4.7 Meeting 7](#47-meeting-7)
  - [4.8 Meeting 8](#48-meeting-8)
  - [4.9 Meeting 9](#49-meeting-9)
  - [4.10 Meeting 10](#410-meeting-10)
  - [4.11 Meeting 11](#411-meeting-11)
- [5. Project Management](#5-project-management)
- [6. Conclusion and Future Work](#6-conclusion-and-future-work)
- [7. References](#7-references)
- [8. Appendix](#8-appendix)


## 1. Introduction

The DollarDiary is a comprehensive application developed in Java. This application is designed to assist users in managing their personal finances by providing a detailed and organized way to track expenses. Users can log their expenses with relevant details such as the date, amount, category, and description, ensuring a thorough record of their spending habits.

In addition to tracking expenses, the application allows users to categorize their spending into categories. This categorization helps users to better understand their spending patterns and identify areas where they can save money. Users can also set budgets and receive reports.

The application features a dashboard that provides an overview of expenses and budgets.

Overall, DollarDiary aims to provide a seamless and efficient way for users to manage their finances, promoting better financial health and stability.

**Features:**

- User registration and login
- Logging expenses with date, amount, category, and description
- Categorizing expenses into categories
- Setting and managing budgets for different categories
- Report generation of the current and past expenses

**Technology Stack:**

- **Backend:** Java
- **Database:** MongoDB
- **Authentication:** Basic Security
- **Build Tool:** Maven 

## 2.Design Problem

### 2.1 Problem Definition

In today's fast-paced world, many individuals struggle to keep track of their personal finances, leading to overspending, poor financial planning, and stress. Traditional methods of expense tracking, such as pen-and-paper logs or basic spreadsheets, are often cumbersome, prone to errors, and lack the ability to provide meaningful insights into spending patterns. Without a systematic way to categorize expenses and monitor budgets, users find it challenging to identify areas where they can cut costs and save money. Additionally, the absence of report generation regarding budget further exacerbates financial mismanagement. There is a need for a comprehensive, user-friendly solution that not only simplifies the tracking of expenses but also helps users make informed financial decisions to achieve better financial stability and health.

### 2.2 Design Requirements

#### 2.2.1 Functions

- **Register users:** Allow users to create an account by providing necessary details such as username, password, and email address.
- **Authenticate users:** Verify user credentials during login to ensure secure access.
- **Log expenses:** Enable users to Add, Delete, and Update expenses with details such as date, amount, category, and description.
- **Categorize expenses:** Allow users to assign expenses to predefined categories for better organization.
- **Set budgets:** Permit users to set budget limits and track their spending against these budgets.

#### 2.2.2 Objectives

- **Provide a Comprehensive Financial Management Tool:**
  - Develop a system that allows users to log and track their daily expenses effectively.
  - Enable users to categorize their expenses to better understand their spending patterns.
- **Facilitate Budgeting and Financial Planning:**
  - Allow users to set budgets.
- **Enhance User Experience with Data Visualization:**
  - Generate detailed monthly and yearly reports to help users analyze their spending over time.
- **Ensure Security and Compliance:**
  - Implement secure user authentication.

#### 2.2.3 Constraints

- **Economic Factors - Budget Constraints**
  - Scalability: Design the system to be scalable without incurring excessive costs. This might involve choosing a database and hosting solution that can grow with the user base without significant cost increases.
- **Regulatory Compliance (Security and Access) - Data Protection and Privacy**
  - User Authentication: Implement secure authentication mechanisms using Spring Security with JWT to protect user data.
  - Access Controls: Implement role-based access controls to restrict access to sensitive information and administrative functions.
- **Reliability - System availability and performance**
  - Testing: Conduct thorough testing including unit tests, integration tests, and user acceptance testing to ensure the system functions reliably under various conditions.
  - Backup and Recovery: Implement regular data backup processes and ensure a robust recovery plan is in place to restore data in case of corruption or loss.
- **Societal Impacts - User Experience and Accessibility**
  - User-Friendly Design: Ensure the user interface is intuitive and easy to use, enabling users from diverse backgrounds to manage their finances effectively.

## 3. Solution

### 3.1 Solution 1

The first solution involves developing the DollarDiary application using Java with the Spring Boot framework, with basic CRUD (Create, Read, Update, Delete) functionality for expenses.

**Reason for not selecting this solution:**

- Limited Functionality: This solution only provides basic expense tracking without additional features such as categorization or budgeting, which limits its usefulness.
- User Engagement: Users might not find the application useful for long-term financial planning without the ability to categorize expenses or set budgets.
- Market Competitiveness: The lack of advanced features means this solution would not stand out in a market where many applications offer more comprehensive financial management tools.

### 3.2 Solution 2

The second solution builds on the first by incorporating expense categorization.

**Advantages over solution 1:**

- Enhanced Functionality: Including categorization makes the application more useful for users trying to understand and manage their spending patterns.
- Better User Engagement: These additional features help users track their finances more effectively, leading to better retention.
- Partial Implementation of User Feedback through Error Messages: This solution addresses some of the key features requested by users, making it more effective.

**Reason for not selecting this solution:**

- Scalability Issues: Adding categorization without considering scalability might lead to performance issues as the number of users grows.
- User Experience Complexity: While adding these features improves functionality, it may also complicate the user, making it less intuitive for users who prefer simplicity.
- Integration Challenges: Implementing these additional features might introduce complexities in integrating and maintaining the application, leading to potential technical debt and increased maintenance efforts.

### 3.3 Final Solution

The final solution is superior to the previous ones because it incorporates comprehensive features that enhance user engagement and functionality without compromising scalability or user experience. Including Report generation ensures users maintain disciplined spending habits, by using authentication one can make their spending private and the interface offers a clear overview of their finances.

### Table 1: Comparison of Solutions

| Feature                         | Solution 1                                | Solution 2                                 | Final Solution                                          |
|---------------------------------|-------------------------------------------|--------------------------------------------|---------------------------------------------------------|
| Expense Tracking                | Basic CRUD functionality                  | CRUD + Categorization and Budget Setting   | CRUD + Categorization, Budget Setting, Report Generation |
| User Engagement                 | Low                                       | Moderate                                   | High                                                    |
| Scalability                     | High                                      | Moderate                                   | High                                                    |
| Market Competitiveness          | Low                                       | Moderate                                   | High                                                    |

The final solution is superior to the previous ones because it incorporates comprehensive features that enhance user engagement and functionality without compromising on scalability or user experience. The inclusion of a report generation feature ensures users can analyze their spending habits in detail, and the interface simplifies usage for tech-savvy users.

### 3.3.1 Components

**Components Used:**

- **Login Command:** Secure user authentication.
- **Add Expense Command:** Allows users to log their expenses with date, amount, category, and description.
- **Dashboard Command:** Provides an overview of expenses and budgets.
- **Report Generation Command:** Enables users to generate and view detailed reports of their expenses and budgets.
- **Backend Services:** Java.
- **Database:** MongoDB for storing user data and expense records.
- **Build Tool:** Maven for project management and dependency handling.

**Purpose of Each Component:**

- **Login Command:** Ensures secure access to the application by authenticating users.
- **Add Expense Command:** Facilitates logging of expenses with all necessary details.
- **Dashboard Command:** Provides a clear and concise overview of financial data.
- **Report Generation Command:** Allows users to generate detailed financial reports for better analysis and planning.
- **Backend Services:** Manages application logic and interactions between components.
- **Database:** Efficiently stores and retrieves user and expense data.
- **Build Tool:** Manages project dependencies and builds the application.

**Block Diagram:**


### 3.3.2 Features

**Table 2: Features of DollarDiary**

| Feature                          | Description                                                                   |
|----------------------------------|-------------------------------------------------------------------------------|
| User Registration and Login      | Secure user authentication.                    |
| Logging Expenses                 | Users can log their expenses with date, amount, category, and description.    |
| Categorizing Expenses            | Expenses can be categorized for better tracking and analysis.                 |
| Setting and Managing Budgets     | Users can set budgets for different categories.                               |
| Dashboard                        | Overview of expenses and budgets for easy tracking and management.            |
| Report Generation                | Users can generate detailed reports of their expenses and budgets.            |

### 3.3.3 Environmental, Societal, Safety, and Economic Considerations

- **Environmental:** The digital nature of the application reduces paper use, contributing to environmental sustainability.
- **Societal:** Promotes financial literacy and responsible spending habits among users, contributing to societal financial health.
- **Economic:** Free or low-cost access to personal finance management tools helps users save money and plan better financially.
- **Safety:** Secure authentication.

### 3.3.4 Test Cases and Results

**Test Suites Designed:**

1. **Path Testing:**
   - Choose a function, such as logging an expense, and verify all possible execution paths are tested.
   - *Summary:* These tests ensure that all possible execution paths for a chosen function are tested to uncover any hidden bugs.

2. **Data Flow Testing:**
   - Track the flow of data within the application to ensure variables are properly initialized, used, and finalized.
   - *Summary:* These tests validate the data flow within the application to ensure variables are used correctly throughout their lifecycle.

3. **Logic Coverage:**
   - Ensure all logical conditions within functions, such as if-else statements in the budget setting functionality, are tested.
   - *Summary:* These tests ensure that all logical conditions and branches in the code are tested for correctness.

4. **[Integration Testing:](Integration_testing.md)**
   - Test the interaction between components, such as logging an expense and updating the dashboard.
   - *Summary:* These tests verify that different components of the application interact correctly and work seamlessly together.

5. **[Boundary Value Testing:](Test%20Planning/Boundary_Value_Analysis.md#robust-boundary-value-analysis)**
    - Test edge cases, such as the maximum and minimum values for expense amounts.
    - *Summary:* These tests ensure the application handles edge cases and boundary values correctly.

6. **[Equivalence Class Testing:](Test%20Planning/Equivalence_Class_Testing.md#strong-robust-equivalence-class-testing)**
    - Group inputs into classes and test representative values from each class.
    - *Summary:* These tests validate that the application behaves correctly for representative values from different input classes.

7. **[Decision Tables Testing:](Test%20Planning/Decision_table.md#dicision-table-based-testing)**
    - Define and test decision tables for various features, such as Report Generation.
    - *Summary:* These tests ensure that the application's decision-making logic is correct by using decision tables.

8. **[State Transition Testing:](Test%20Planning/State_Transition.md#state-transition)**
    - Validate state transitions, such as logging in, logging an expense, and logging out.
    - *Summary:* These tests ensure that the application transitions correctly between different states based on user actions.

9. **[Use Case Testing:](Test%20Planning/Use_case_diagram_testing.md#use-case-based-testing)**
    - Create and test use cases based on user interactions with the application.
    - *Summary:* These tests validate that the application performs correctly for various user scenarios and interactions.

**Execution of Test Cases:**
- Automated tests using JUnit.


### 3.3.5 Limitations

- **Scalability Challenges:** As the user base grows, database performance may need optimization.
- **User Interface Learning Curve:** Some users might find the command line interface complex initially.
- **Integration Issues:** Future integration with third-party services might introduce challenges.

Overall, the final solution for DollarDiary provides a robust and comprehensive expense tracking system that is user-friendly, secure, and scalable, addressing the limitations of previous solutions.

## 4. Team Work

### 4.1 Meeting 1

**Time:** May 27, 2024, 12:00 pm to 2:00 pm
**Agenda:** Distribution of Project Tasks

| Team Member        | Previous Task | Completion State | Next Task                      |
|--------------------|---------------|------------------|--------------------------------|
| Aliasgar Mithawala | N/A           | N/A              | Collect Design Constraints       |
| Savan Pedhadiya    | N/A           | N/A              | Collect Functional Requirements         |
| Jay Panchal        | N/A           | N/A              | Collect Objectives  |

### 4.2 Meeting 2

**Time:** May 31, 2024, 3: 00 pm to 4: 30 pm
**Agenda:** Progress Check and Discussion

| Team Member        | Previous Task               | Completion State | Next Task                      |
|--------------------|-----------------------------|------------------|--------------------------------|
| Aliasgar Mithawala | Collect Design Constraints     | Done         | Documentation for 4th week submission   |
| Savan Pedhadiya    | Collect Functional Requirements | Done        | Review of document and gathering project constraints    |
| Jay Panchal        | Collect Objectives          | Done         | Review of document and gathering project constraints |

### 4.3 Meeting 3

**Time:** Jun 7, 2024, 3: 00 pm to 4: 30 pm
**Agenda:** Progress Check and Discussion

| Team Member        | Previous Task                  | Completion State | Next Task                      |
|--------------------|--------------------------------|------------------|--------------------------------|
| Aliasgar Mithawala | Documentation for 4th week submission   | Done          | Finding solutions for project definition.   |
| Savan Pedhadiya    | Review of document and gathering project constraints         | Done         | Finding solutions for project definition  |
| Jay Panchal        | Review of document and gathering project constraints       | Done          | Finding solutions for project definition |

### 4.4 Meeting 4

**Time:** Jun 14, 2024, 3: 00 pm to 4: 30 pm
**Agenda:** Distribution of Project Tasks

| Team Member        | Previous Task                 | Completion State | Next Task                      |
|--------------------|-------------------------------|------------------|--------------------------------|
| Aliasgar Mithawala | Finding solutions for project definition.  | Done        | Start Backend Implementation.           |
| Savan Pedhadiya    | Finding solutions for project definition. | Done         | Start Backend Implementation.           |
| Jay Panchal        | Finding solutions for project definition. | Done          | Start Backend Implementation.           |

### 4.5 Meeting 5

**Time:** Jun 17, 2024, 3: 00 pm to 4: 30 pm
**Agenda:** Development Progress

| Team Member        | Previous Task            | Completion State | Next Task                    |
|--------------------|--------------------------|------------------|------------------------------|
| Aliasgar Mithawala | Start Backend Implementation.      | Ongoing          | Gathering response and documentation of week – 7 submissions.                |
| Savan Pedhadiya    | Start Backend Implementation.      | Ongoing          | Continue Implementation of project              |
| Jay Panchal        | Start Backend Implementation.      | Ongoing          | Continue Implementation of project              |

### 4.6 Meeting 6

**Time:** Jun 21, 2024, 3: 00 pm to 4: 30 pm
**Agenda:** Development Progress

| Team Member        | Previous Task        | Completion State | Next Task                          |
|--------------------|----------------------|------------------|------------------------------------|
| Aliasgar Mithawala | Gathering response and documentation of week – 7 submissions.         | Done          | Started working on Robust BVA, and Robust Equivalence class Testing for project  |
| Savan Pedhadiya    | Continue Implementation of project        | Done         | Stated working on Database Implementation.   |
| Jay Panchal        | Continue Implementation of project         | Done         | Started Documentation for Project.    |

### 4.7 Meeting 7

**Time:** Jun 28, 2024, 3: 00 pm to 4: 30 pm
**Agenda:** Development Progress and test planning

| Team Member        | Previous Task        | Completion State | Next Task                          |
|--------------------|----------------------|------------------|------------------------------------|
| Aliasgar Mithawala | Started working on Robust BVA, and Robust Equivalence class Testing for project   | Done          | Started making Decision table, state transition and Use case Testing for project.       |
| Savan Pedhadiya    | Stated working on Database Implementation.     | Ongoing       | Started Unit Testing for report feature      |
| Jay Panchal        | Started Documentation for the Project.   | Ongoing      | Started Unit Testing for report feature     |

### 4.8 Meeting 8

**Time:** July 5, 2024, 3: 00 pm to 4: 30 pm
**Agenda:** Unit testing and Integration testing

| Team Member        | Previous Task        | Completion State | Next Task                          |
|--------------------|----------------------|------------------|------------------------------------|
| Aliasgar Mithawala | Started making Decision table, state transition, and Use case Testing for the project.      | Done          | Integration Testing and Unit Testing  |
| Savan Pedhadiya    | Started Unit Testing for report feature     | Ongoing        | Integration Testing and Unit Testing  |
| Jay Panchal        | Started Unit Testing for report feature  | Ongoing        | Integration Testing and Unit Testing |

### 4.9 Meeting 9

**Time:** July 5, 2024, 3: 00 pm to 4: 30 pm
**Agenda:** Bug Fixing

| Team Member        | Previous Task        | Completion State | Next Task                          |
|--------------------|----------------------|------------------|------------------------------------|
| Aliasgar Mithawala | Integration Testing and Unit Testing  | Ongoing          | Bug Fixing   |
| Savan Pedhadiya    | Integration Testing and Unit Testing  | Ongoing        | Bug Fixing   |
| Jay Panchal        | Integration Testing and Unit Testing   | Ongoing       | Bug Fixing   |

### 4.10 Meeting 10

**Time:** July 12, 2024, 3: 00 pm to 4: 30 pm
**Agenda:** Documentation and Bug Fixing

| Team Member        | Previous Task        | Completion State | Next Task                          |
|--------------------|----------------------|------------------|------------------------------------|
| Aliasgar Mithawala | Bug Fixing | Done          | Whole Project documentation and submitting on GitHub  |
| Savan Pedhadiya    | Bug Fixing | Done         | Whole Project documentation and submitting on GitHub |
| Jay Panchal        | Bug Fixing  | Done         | Whole Project documentation and submitting on GitHub |

### 4.11 Meeting 11

**Time:** July 19, 2024, 3: 00 pm to 4: 30 pm
**Agenda:** Final Review and Presentation Preparation

| Team Member        | Previous Task        | Completion State | Next Task                          |
|--------------------|----------------------|------------------|------------------------------------|
| Aliasgar Mithawala | Whole Project documentation and submitting on GitHub  | Done          | Project Submission and presentation  |
| Savan Pedhadiya    | Whole Project documentation and submitting on GitHub | Done         | Project Submission and presentation  |
| Jay Panchal        | Whole Project documentation and submitting on GitHub  | Done         | Project Submission and presentation |


## 5. Project Management

Describe how you managed your project. What are the different roles you assigned? How did you track the progress of the project? Which project management tools did you use?

## 6. Conclusion and Future Work

Summarize the overall experience and outcomes of your project. What were the key takeaways? What future work is planned to further improve or expand your project?

## 7. References

List any references used in your project. Make sure to format them correctly according to your course guidelines.

## 8. Appendix

Include any additional material that supports your project but does not fit within the main body of the report.

