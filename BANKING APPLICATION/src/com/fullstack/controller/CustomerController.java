package com.fullstack.controller;

import java.util.Scanner;

import com.fullstack.model.Customer;
import com.fullstack.service.CustomerService;

public class CustomerController {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CustomerService customerService = new CustomerService();

        Customer customer = new Customer(9322297379L, "GVD@4942");

        boolean flag = false;

        do {
            System.out.println("\n Please enter acc no & pwd: ");

            long accNumber = scanner.nextLong();

            String password = scanner.next();

            if (customer.getCustAccountNumber() == accNumber && customer.getCustPassword().equals(password)) {
                System.out.println("WELCOME TO INDIAN BANK");
                flag = false;

            } else {
                System.out.println("Invalid Credentials, Please try again!!!");
                flag = true;
            }

        } while (flag);

        do {
            System.out.println("\n Please enter your choice: \n 1. Deposit \n 2. Withdraw \n 3. Transfer \n 4. Logout");

            int ch = scanner.nextInt();

            switch (ch) {
                case 1: // Deposit
                    customerService.deposit();

                    break;
                case 2: // Withdraw

                    customerService.withdraw();

                    break;

                case 3: // Transfer
                    customerService.transfer();

                    break;

                case 4: // Logout
                    customerService.logout();

                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        } while (true);
    }
}
