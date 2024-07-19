# ENSE 375 – Software Testing and Validation

![UofR](Assests/UofRlogo1.png)

# DollarDiary

**Team Members:**

- Aliasgar Saifeebhai Mithawala – 200517808
- Savan Rameshbhai Pedhadiya – 200517532
- Jay Bharatkumar Panchal - 200518664

## Table of Contents

- **1. Introduction**
- **2. Design Problem**
   - 2.1 Problem Definition
   - 2.2 Design Requirements
      - 2.2.1 Functions
      - 2.2.2 Objectives
      - 2.2.3 Constraints
- **3. Solution**
   - 3.1 Solution
   - 3.2 Solution
   - 3.3 Final Solution
      - 3.3.1 Components
      - 3.3.2 Features
      - 3.3.3 Environmental, Societal, Safety, and Economic Considerations
      - 3.3. 5 Test cases and results
      - 3.3.4 Limitations
- **4. Team Work**
   - 4.1 Meeting
   - 4.2 Meeting
   - 4.3 Meeting
   - 4.4 Meeting
   - 4.5 Meeting
   - 4.6 Meeting
   - 4.7 Meeting
   - 4.8 Meeting
   - 4.9 Meeting
   - 4.10 Meeting
   - 4.11 Meeting
- **5. Project Management**
- **6. Conclusion and Future Work**
- **7. References**
- **8. Appendix**

## 1. Introduction

The DollarDiary is a comprehensive web application developed in Java using the Spring Boot framework. This application is designed to assist users in managing their personal finances by providing a detailed and organized way to track expenses. Users can log their expenses with relevant details such as the date, amount, category, and description, ensuring a thorough record of their spending habits.

In addition to tracking expenses, the application allows users to categorize their spending into categories. This categorization helps users to better understand their spending patterns and identify areas where they can save money. Users can also set budgets for different categories and receive notifications when they are approaching their budget limits, promoting more disciplined spending.

The application features a user-friendly dashboard that provides an overview of expenses and budgets.

Overall, DollarDiary aims to provide a seamless and efficient way for users to manage their finances, promoting better financial health and stability.

**Features:**

- User registration and login
- Logging expenses with date, amount, category, and description
- Categorizing expenses into categories
- Setting and managing budgets for different categories

**Technology Stack:**

- Frontend: HTML, CSS, JavaScript
- Backend: Java (Spring Boot)
- Database: MongoDB
- Authentication: Spring Security with JWT
- Build Tool: Maven or Gradle

## 2.Design Problem

### 2.1 Problem Definition

In today's fast-paced world, many individuals struggle to keep track of their personal finances, leading to overspending, poor financial planning, and stress. Traditional methods of expense tracking, such as pen-and-paper logs or basic spreadsheets, are often cumbersome, prone to errors, and lack the ability to provide meaningful insights into spending patterns. Without a systematic way to categorize expenses and monitor budgets, users find it challenging to identify areas where they can cut costs and save money. Additionally, the absence of timely notifications regarding budget limits further exacerbates financial mismanagement. There is a need for a comprehensive, user-friendly solution that not only simplifies the tracking of expenses but also helps users make informed financial decisions to achieve better financial stability and health.

### 2.2 Design Requirements

#### 2.2.1 Functions

- **Register users:** Allow users to create an account by providing necessary details such as username, password, and email address.
- **Authenticate users:** Verify user credentials during login using Spring Security with JWT to ensure secure access.
- **Log expenses:** Enable users to input expenses with details such as date, amount, category, and description.
- **Categorize expenses:** Allow users to assign expenses to predefined or custom categories for better organization.
- **Set budgets:** Permit users to set budget limits for different categories and track their spending against these budgets.

#### 2.2.2 Objectives

- **Provide a Comprehensive Financial Management Tool:**
  - Develop a system that allows users to log and track their daily expenses effectively.
  - Enable users to categorize their expenses to better understand their spending patterns.
- **Facilitate Budgeting and Financial Planning:**
  - Allow users to set budgets for different expense categories.
  - Notify users when they are approaching their budget limits to promote better financial discipline.
- **Enhance User Experience with Data Visualization:**
  - Provide interactive charts and graphs to help users visualize their financial data clearly.
  - Generate detailed monthly and yearly reports to help users analyze their spending over time.
- **Ensure Security and Compliance:**
  - Implement secure user authentication and authorization.
  - Protect sensitive user data through encryption and comply with relevant data protection regulations.
- **Promote Accessibility and Usability:**
  - Design an intuitive and user-friendly interface.
  - Ensure the application is accessible to users with disabilities.

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

The second solution builds on the first by incorporating expense categorization and budget setting.

**Advantages over solution 1:**

- Enhanced Functionality: Including categorization and budget setting makes the application more useful for users trying to understand and manage their spending patterns.
- Better User Engagement: These additional features help users track their finances more effectively, leading to better retention.
- Partial Implementation of User Feedback: This solution addresses some of the key features requested by users, making it more attractive where many applications offer more comprehensive financial management tools.

**Reason for not selecting this solution:**

- Scalability Issues: Adding categorization and budget setting without considering scalability might lead to performance issues as the number of users grows.
- User Experience Complexity: While adding these features improves functionality, it may also complicate the user interface, making it less intuitive for users who prefer simplicity.
- Integration Challenges: Implementing these additional features might introduce complexities in integrating and maintaining the application, leading to potential technical debt and increased maintenance efforts.

### 3.3 Final Solution

This is the final solution. Explain why it is better than other solutions. You may use a table for comparison purposes. After providing the reason for selecting this solution, detail it below.

#### 3.3.1 Components

What components you used in the solution? What is the main purpose of using individual components? Provide a block diagram (with a numbered caption such as Fig. 1) representing the connectivity and interaction between all the components.


#### 3.3.2 Features

Give an account of all the features your solution has. These features may be tabulated (with a title) for improved comprehension.

#### 3.3.3 Environmental Societal Safety and Economic Considerations

Explain how your engineering design took into account environmental, societal, economic, and other constraints into consideration. It may include how your design has positive contributions to the environment and society. What type of economic decisions you made? How did you make sure that the design is reliable and safe to use?

#### 3.3.4 Test Cases and Results

What test suits did you design to test your prototype? How did you execute the test cases to test the prototype?

#### 3.3.5 Limitations

Every product has some limitations and so is the case with your design product. Highlight some of the limitations of your solution here.

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

### 4.6 Meeting 7

**Time:** Jun 28, 2024, 3: 00 pm to 4: 30 pm
**Agenda:** Development Progress and test planning

| Team Member        | Previous Task        | Completion State | Next Task                          |
|--------------------|----------------------|------------------|------------------------------------|
| Aliasgar Mithawala | Started working on Robust BVA, and Robust Equivalence class Testing for project   | Done          | Started making Decision table, state transition and Use case Testing for project.       |
| Savan Pedhadiya    | Stated working on Database Implementation.     | Ongoing       | Started Unit Testing for report feature      |
| Jay Panchal        | Started Documentation for the Project.   | Ongoing      | Started Unit Testing for report feature     |

### 4.6 Meeting 8

**Time:** July 5, 2024, 3: 00 pm to 4: 30 pm
**Agenda:** Unit testing and Integration testing

| Team Member        | Previous Task        | Completion State | Next Task                          |
|--------------------|----------------------|------------------|------------------------------------|
| Aliasgar Mithawala | Started making Decision table, state transition, and Use case Testing for the project.      | Done          | Integration Testing and Unit Testing  |
| Savan Pedhadiya    | Started Unit Testing for report feature     | Ongoing        | Integration Testing and Unit Testing  |
| Jay Panchal        | Started Unit Testing for report feature  | Ongoing        | Integration Testing and Unit Testing |

### 4.6 Meeting 9

**Time:** July 5, 2024, 3: 00 pm to 4: 30 pm
**Agenda:** Bug Fixing

| Team Member        | Previous Task        | Completion State | Next Task                          |
|--------------------|----------------------|------------------|------------------------------------|
| Aliasgar Mithawala | Integration Testing and Unit Testing  | Ongoing          | Bug Fixing   |
| Savan Pedhadiya    | Integration Testing and Unit Testing  | Ongoing        | Bug Fixing   |
| Jay Panchal        | Integration Testing and Unit Testing   | Ongoing       | Bug Fixing   |

### 4.6 Meeting 10

**Time:** July 12, 2024, 3: 00 pm to 4: 30 pm
**Agenda:** Documentation and Bug Fixing

| Team Member        | Previous Task        | Completion State | Next Task                          |
|--------------------|----------------------|------------------|------------------------------------|
| Aliasgar Mithawala | Bug Fixing | Done          | Whole Project documentation and submitting on GitHub  |
| Savan Pedhadiya    | Bug Fixing | Done         | Whole Project documentation and submitting on GitHub |
| Jay Panchal        | Bug Fixing  | Done         | Whole Project documentation and submitting on GitHub |

### 4.6 Meeting 11

**Time:** July 17, 2024, 3: 00 pm to 4: 30 pm
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

