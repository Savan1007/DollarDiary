# Robust Boundary Value Analysis

## Test Requirements
**Number of test cases: 6n+1 = 19**


### **Year**
- Xmin = 2023
- Xmin + 1 = 2024
- Xmin – 1 = 2022
- Xnom = 2024
- Xmax = 2025
- Xmax – 1 = 2024
- Xmax + 1 = 2025

### **Month**
- Ymin = 1
- Ymin + 1 = 2
- Ymin – 1 = 0
- Ynom = 6
- Ymax = 12
- Ymax – 1 = 11
- Ymax + 1 = 13

### **Categories**
1. Grocery
2. Entertainment
3. Bills
4. Transport
5. Health
6. Others

### **Values**
- Zmin = 1
- Zmin + 1 = 2
- Zmin – 1 = 0
- Znom = 4
- Zmax - 1 = 5
- Zmax + 1 = 6

## Test Cases

| Test Case | Month | Year | Categories | Expected Output     |
|-----------|-------|------|------------|---------------------|
| 1         | 1     | 2023 | 4          | Report Generated    |
| 2         | 2     | 2024 | 4          | Report Generated    |
| 3         | 6     | 2024 | 4          | Report Generated    |
| 4         | 11    | 2024 | 4          | Report Generated    |
| 5         | 12    | 2025 | 4          | Report Generated    |
| 6         | 6     | 2023 | 4          | Report Generated    |
| 7         | 6     | 2024 | 4          | Report Generated    |
| 8         | 6     | 2024 | 4          | Report Generated    |
| 9         | 6     | 2025 | 4          | Report Generated    |
| 10        | 6     | 2023 | 1          | Report Generated    |
| 11        | 6     | 2024 | 2          | Report Generated    |
| 12        | 6     | 2024 | 5          | Report Generated    |
| 13        | 6     | 2025 | 6          | Report Generated    |
| 14        | 0     | 2023 | 4          | Report Not Generated|
| 15        | 13    | 2023 | 4          | Report Not Generated|
| 16        | 6     | 2022 | 4          | Report Not Generated|
| 17        | 6     | 2025 | 4          | Report Not Generated|
| 18        | 6     | 2024 | 0          | Report Not Generated|
| 19        | 6     | 2024 | 7          | Report Not Generated|
