package com.fullstack.service;

import java.util.Scanner;

public class CustomerService {

    double custAccountBalance = 10000;

    int amount, otp, generatedOTP;

    Scanner scanner = new Scanner(System.in);

    public void deposit() {

        System.out.println("\n Before Deposit Cust Acc Bal: " + custAccountBalance);

        System.out.println("\n Please enter amount for deposit: ");

        amount = scanner.nextInt();

        custAccountBalance += amount;

        System.out.println("\n After Deposit Cust Acc Bal: " + custAccountBalance);

    }

    public void withdraw() {

        System.out.println("\n Before Withdraw Cust Acc Bal: " + custAccountBalance);

        System.out.println("\n Please enter amount for withdraw: ");

        amount = scanner.nextInt();

        if (custAccountBalance >= amount) {

            custAccountBalance -= amount;

            System.out.println("\n After Withdraw Cust Acc Bal: " + custAccountBalance);

        } else {
            System.out.println("Insufficient Fund");
        }

    }

    public void transfer() {

        System.out.println("\n Before Transfer Cust Acc Bal: " + custAccountBalance);

        System.out.println("\n Please enter amount for Transfer: ");

        amount = scanner.nextInt();

        if (custAccountBalance >= amount) {

            generatedOTP = generateOTP();

            System.out.println("\n Please enter OTP: " + generatedOTP);

            otp = scanner.nextInt();

            if (otp == generatedOTP) {

                custAccountBalance -= amount;

                System.out.println("\n After Transfer Cust Acc Bal: " + custAccountBalance);
            } else {
                System.out.println("Invalid OTP");
            }
        } else {
            System.out.println("\n Insufficient Fund");
        }
    }

    public void logout() {

        System.out.println("Logout Successfully");

        System.exit(0);

    }

    int generateOTP() {
        return (int) (Math.random() * 9000 + 1000);
    }

}
