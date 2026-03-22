package main;

import java.util.Scanner;

import carrentalDao.CarDao;
import carrentalDao.CustomerDao;
import carrentalDao.PaymentDao;
import carrentalDao.RentalDao;
import carrentalservice.CarService;
import carrentalservice.CustomerService;
import carrentalservice.PaymentService;
import carrentalservice.RentalService;
import exception.InvalidInputException;

public class CarRentalApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CarDao carDao = new CarDao();
        CustomerDao customerDao = new CustomerDao();
        RentalDao rentalDao = new RentalDao();
        PaymentDao paymentDao = new PaymentDao();

        CarService carService = new CarService(carDao);
        CustomerService customerService = new CustomerService(customerDao);
        RentalService rentalService = new RentalService(rentalDao);
        PaymentService paymentService = new PaymentService(paymentDao);

        boolean running = true;

        while (running) {
            System.out.println("===== Car Rental System =====");
            System.out.println("1. Manage Customers");
            System.out.println("2. Manage Cars");
            System.out.println("3. Manage Rentals");
            System.out.println("4. Manage Payments");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            int choice = readIntSafe(scanner);

            try {
                switch (choice) {
                    case 1:
                        customerService.customerMenu(scanner);
                        break;
                    case 2:
                        carService.carMenu(scanner);
                        break;
                    case 3:
                        rentalService.rentalMenu(scanner);
                        break;
                    case 4:
                        paymentService.paymentMenu(scanner);
                        break;
                    case 0:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            } catch (Exception e) {
            	System.out.println();
                System.err.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Exiting Car Rental System. Goodbye!");
        scanner.close();
    }

    private static int readIntSafe(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}

