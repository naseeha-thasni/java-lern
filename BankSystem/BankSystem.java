package BankSystem;

import java.util.Scanner;

public class BankSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Naseeha ";
        int accountNumber = 120;
        double balance = 1001.78;
        System.out.println("=== Welcome, " + name + " ===");
        System.out.println("Account Number :" + accountNumber);
        System.out.printf("Final Balance : %.2f%n" , balance);

        transaction: while (true) {

            System.out.println("Enter transaction type( 1-Withdrawal or 2-Deposit 3- exit) ");
            String type = sc.next();
            type = type.toLowerCase();
            type = type.trim();
            double amount;
            switch (type) {
                case "deposit":
                case "2":
                    System.out.println("Enter amount");
                    amount = sc.nextDouble();
                    if (amount > 0) {
                        balance = balance + amount;
                        System.out.println(" Deposit successful!.....");
                        System.out.printf("Current Balance: ₹ %.2f%n",  balance);

                    } else {
                        System.out.println("  Deposit failed (invalid amount entered).....");
                    }

                    break;
                case "withdrawal":
                case "1":
                    System.out.println("Enter amount");
                    amount = sc.nextDouble();
                    if (amount > 0 && amount <= balance) {
                        balance = balance - amount;
                        System.out.println(" Withdrawal successful!.....");
                        System.out.printf("Current Balance: ₹ %.2f%n" , balance);

                    } else if (amount < 0) {
                        System.out.println("  withdrawal failed (invalid amount entered).....");
                    } else {
                        System.out.printf(" Insufficient balance! (You have ₹ %.2f)%n" , balance );
                    }
                    break;
                case "exit":
                case "3":
                    System.out.println("You are Exiting from  transaction");
                    break transaction;

                default:
                    System.out.println("invalid choice");
                    break;
            }
        }

        System.out.println("Account Holder :" + name);
        System.out.println("Account Number :" + accountNumber);
        System.out.printf("Final Balance : %.2f%n" , balance);

    }

}
