package carrentalservice;

import java.util.Scanner;

import carrentalDao.RentalDao;
import util.DateUtil;
import util.InputValidator;

public class RentalService {

    private final RentalDao rentalDao;

    public RentalService(RentalDao rentalDao) {
        this.rentalDao = rentalDao;
    }

    public void rentalMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("----- Rental Menu -----");
            System.out.println("1. Add Rental");
            System.out.println("2. Display All Rentals");
            System.out.println("3. Update Rental");
            System.out.println("4. Delete Rental");
            System.out.println("5. Search Rental by ID");
            System.out.println("6. Search Rental by Customer ID");
            System.out.println("7. Search Rental by Car ID");
            System.out.println("0. Back");
            System.out.print("Choose an option: ");

            int choice = readIntSafe(scanner);

            switch (choice) {
                case 1:
                    addRental(scanner);
                    break;
                case 2:
                    rentalDao.displayAllRentals();
                    break;
                case 3:
                    rentalDao.updateRental(null);
                    break;
                case 4:
                    rentalDao.deleteRental(null);
                    break;
                case 5:
                    System.out.println("Search by ID will be handled inside DAO.");
                    rentalDao.searchRental(null);
                    break;
                case 6:
                    System.out.print("Enter customer id: ");
                    int customerId = readIntSafe(scanner);
                    InputValidator.requirePositiveInt(customerId, "Customer ID");
                    rentalDao.searchRentalByCustomerId(customerId);
                    break;
                case 7:
                    System.out.print("Enter car id: ");
                    int carId = readIntSafe(scanner);
                    InputValidator.requirePositiveInt(carId, "Car ID");
                    rentalDao.searchRentalByCarId(carId);
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private void addRental(Scanner scanner) {
        System.out.print("Enter rental start date (yyyyMMdd): ");
        String startStr = scanner.next();
        System.out.print("Enter rental end date (yyyyMMdd): ");
        String endStr = scanner.next();

        int start = DateUtil.parseDateToInt(startStr);
        int end = DateUtil.parseDateToInt(endStr);
        int days = DateUtil.calculateDaysBetween(start, end);
        if (days <= 0) {
            throw new IllegalArgumentException("Return date must be after rental date.");
        }
        System.out.println("Rental duration (days): " + days);

        // Actual Rental object creation and persistence is handled inside DAO addRental
        rentalDao.addRental(null);
    }

    private int readIntSafe(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
