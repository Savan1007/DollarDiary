package com.example.demo;

import com.example.demo.service.ExpenseService;
import com.example.demo.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;


//@SpringBootApplication
//@RestController
//@RequestMapping("/api")
public class DemoApplication {

	public static void main(String[] args) {

//		SpringApplication.run(DemoApplication.class, args);

		expense(new ScannerInputReader(new Scanner(System.in)));

	}

	public static void expense(InputReader inputReader){
		UserService userService = new UserService();
		ExpenseService expenseService = new ExpenseService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Dollar Diary");

		while(true) {
			System.out.println("1. Sign Up");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			System.out.println("Enter you choice: ");
			int choice = inputReader.nextInt();
			inputReader.nextLine();

			switch (choice) {
				case 1:
					System.out.println("In Sign Up");
					userService.signUp(inputReader);
					break;
				case 2:
					System.out.println("In Login");
					String userId = userService.login(inputReader);
					if (!userId.equals(null)) {
						boolean loggedIn = true;
						while (loggedIn) {
							System.out.println("1. Add Expense");
							System.out.println("2. Update Expense");
							System.out.println("3. Delete Expense");
							System.out.println("4. Read Expense");
							System.out.println("5. Report");
							System.out.println("6. Logout");
							int userChoice = inputReader.nextInt();
							inputReader.nextLine(); // consume newline

							switch (userChoice) {
								case 1:
									expenseService.addExpense(userId, inputReader);
									break;
								case 2:
									expenseService.updateExpense(userId, inputReader);
									break;
								case 3:
									expenseService.deleteExpense(userId, inputReader);
									break;
								case 4:
									expenseService.readExpenses(userId);
									break;
								case 5:
									expenseService.generateReport(userId, inputReader);
									break;
								case 6:
									loggedIn = false;
									System.out.println("Logged out.");
									break;
							}
						}
					}
					break;
				case 3:
					System.out.println("Goodbye!");
					return;
			}
		}
	}

//	@GetMapping("/")
//	public String checkingServer(){
//		return "Server is running ... ";
//	}

}

