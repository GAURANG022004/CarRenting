package carrentalDao;

import carrentalmodel.Customer;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerDao {
    private List<Customer> customers = new ArrayList<>();
    
    //no need to manually add customers to the list, the customers will be added automatically when the customer is created using scanner class 
    //so we dont need to put customers in the list manually
    
    
    public void addCustomer(Customer customer) {           //addCustomer method to add a new customer to the database
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the customer id: ");
        int customerId = scanner.nextInt();
        
        System.out.println("Enter the customer name: ");
        String customerName = scanner.next();
        scanner.nextLine();  
        
        System.out.println("Enter the customer phone number: ");
        String customerPhoneNumber = scanner.next();
        scanner.nextLine();
        
        System.out.println("Enter the customer email : ");
    	String customerEmail = scanner.next();
    	scanner.nextLine();
    	
        System.out.println("Enter the customer addreses : ");
    	String customerAddress = scanner.next();
    	scanner.nextLine();
    	
        System.out.println("Enter the driving license number : ");
    	int drivingLicenseNumber = scanner.nextInt();
    	
        System.out.println("Enter the customer age : ");
    	int customerAge = scanner.nextInt();

    	
        
        customer = new Customer(customerId, customerName, customerPhoneNumber, customerEmail, customerAddress, drivingLicenseNumber, customerAge);
        customers.add(customer);
        
        
          
    }
    
    
    public void displayAllCustomers() {          //displayAllCustomers method to display all customers in the database
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
    
    
    public void updateCustomer(Customer customer) {      //updateCustomer method to update a customer in the database by its id
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the customer id to update: ");
        int customerId = scanner.nextInt();
        for (Customer c : customers) {
            if (c.getCustomerId() == customerId) {
                System.out.println("Enter the customer name: ");
                String customerName = scanner.nextLine();
                c.setCustomerName(customerName);
            }
        }
    }   
    public void deleteCustomer(Customer customer) {      //deleteCustomer method to delete a customer from the database by its id
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the customer id to delete: ");
        int customerId = scanner.nextInt();
        for (Customer c : customers) {
            if (c.getCustomerId() == customerId) {
                customers.remove(c);
                System.out.println("Customer deleted successfully");
                return;
            }   
        }
        System.out.println("Customer not found");
    }
    public void searchCustomer(Customer customer) {      //searchCustomer method to search a customer in the database by its id
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the customer id to search: ");
        int customerId = scanner.nextInt();
        for (Customer c : customers) {
            if (c.getCustomerId() == customerId) {  //searchCustomer method to search a customer in the database by its id
                System.out.println(c);
                return;
            }
        }
        System.out.println("Customer not found");
    }
    public void searchCustomerByName(String customerName) { //searchCustomerByName method to search a customer in the database by its name
        for (Customer c : customers) { //searchCustomerByName method to search a customer in the database by its name
            if (c.getCustomerName().equals(customerName)) { //searchCustomerByName method to search a customer in the database by its name  
                System.out.println(c);
                return;
            }
        }
        System.out.println("Customer not found");
    }

    
}