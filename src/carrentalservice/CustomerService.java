package carrentalservice;

import java.util.Scanner;

import carrentalDao.CustomerDao;
import exception.CustomerNotFoundException;
import util.InputValidator;

public class CustomerService {

    private final CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void customerMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("----- Customer Menu -----");
            System.out.println("1. Add Customer");
            System.out.println("2. Display All Customers");
            System.out.println("3. Update Customer");
            System.out.println("4. Delete Customer");
            System.out.println("5. Search Customer by ID");
            System.out.println("6. Search Customer by Name");
            System.out.println("0. Back");
            System.out.print("Choose an option: ");

            int choice = readIntSafe(scanner);

            switch (choice) {
                case 1:
                    customerDao.addCustomer(null);
                    break;
                case 2:
                    customerDao.displayAllCustomers();
                    break;
                case 3:
                    customerDao.updateCustomer(null);
                    break;
                case 4:
                    customerDao.deleteCustomer(null);
                    break;
                case 5:
                    searchCustomerById(scanner);
                    break;
                case 6:
                    searchCustomerByName(scanner);
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private void searchCustomerById(Scanner scanner) {
        System.out.print("Enter customer id: ");
        int id = readIntSafe(scanner);
        InputValidator.requirePositiveInt(id, "Customer ID");
        // The DAO itself will perform scanning; here we just trigger search
        
        try {
            customerDao.searchCustomer(null);
        } catch (Exception e) {
            throw new CustomerNotFoundException("Customer with id " + id + " not found.");
        }
    }

    private void searchCustomerByName(Scanner scanner) {
        System.out.print("Enter customer name: ");
        String name = scanner.next();
        InputValidator.requireNonEmpty(name, "Customer name");
        customerDao.searchCustomerByName(name);
    }

    private int readIntSafe(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
