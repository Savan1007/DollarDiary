# Use Case Diagram

## Main Success Scenario
### Here S = System and A = Actor 
| Steps | Description                                         |
|-------|-----------------------------------------------------|
| 1.    | **A:** Open DollarDiary                             |
| 2.    | **A:** Choose Signup                                |
| 3.    | **S:** Validate Username email and ask to create password |
| 4.    | **S:** Signup Successful                            |
| 5.    | **A:** Choose Login                                 |
| 6.    | **S:** Validate Username and Password               |
| 7.    | **S:** Allow access to account                      |
| 8.    | **S:** Login Successful                             |
| 9.    | **A:** Read last expenses                           |
| 10.   | **A:** Choose Add Expenses                          |
| 11.   | **S:** Validate date and categories which are entered |
| 12.   | **S:** Expense Added                                |
| 13.   | **A:** Choose Update Expenses                       |
| 14.   | **S:** Validate date categories which are entered   |
| 15.   | **S:** Expense Updated                              |
| 17.   | **A:** Choose Delete Expenses                       |
| 18.   | **S:** Validate expenses                            |
| 19.   | **S:** Expense Updated                              |
| 20.   | **A:** Choose report                                |
| 21.   | **S:** Validate expense                             |
| 22.   | **S:** Report Generated                             |
| 23.   | **A:** Choose Logout                                |
| 24.   | **A:** Close Application                            |

## Extensions

| Steps | Description                                                                 |
|-------|-----------------------------------------------------------------------------|
| 3a.   | Username is not Valid - **S:** Display error message and ask to re-enter username. |
| 3b.   | Email is not Valid - **S:** Display error message and ask to re-enter email.       |
| 6a.   | Username is not Valid - **S:** Display error message and ask to check username.    |
| 6b.   | Password is not Valid - **S:** Display error message and ask to re-enter password. |
| 11a.  | Date is not Valid - **S:** Display error message and ask to check the date.        |
| 11b.  | Categories not Valid - **S:** Display error message and ask to re-enter Categories.|
| 14a.  | Date is not Valid - **S:** Display error message and ask to check the date.        |
| 14b.  | Categories not Valid - **S:** Display error message and ask to re-enter Categories.|
| 14c.  | Expense NOT found - **S:** Display error message and ask to enter expense to update it.|
| 18a.  | Expense NOT found - **S:** Display error message and ask to enter expense to delete it.|
| 21a.  | Expense NOT found - **S:** Display error message and ask to enter expense to generate report.|
