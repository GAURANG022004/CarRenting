package carrentalservice;

import java.util.Scanner;

import carrentalDao.PaymentDao;
import util.InputValidator;

public class PaymentService {

    private final PaymentDao paymentDao;

    public PaymentService(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }

    public void paymentMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("----- Payment Menu -----");
            System.out.println("1. Record Payment");
            System.out.println("0. Back");
            System.out.print("Choose an option: ");

            int choice = readIntSafe(scanner);

            switch (choice) {
                case 1:
                    recordPayment(scanner);
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private void recordPayment(Scanner scanner) {
        System.out.print("Enter payment amount: ");
        int amount = readIntSafe(scanner);
        InputValidator.requirePositiveInt(amount, "Payment amount");
        System.out.println("Payment of " + amount + " recorded (DAO can be extended to persist).");
    }

    private int readIntSafe(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
