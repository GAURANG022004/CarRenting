package carrentalDao;

import carrentalmodel.Rental;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class RentalDao {
    private List<Rental> rentals = new ArrayList<>();
    //no need to manually add rentals to the list, the rentals will be added automatically when the rental is created using scanner class 
    //so we dont need to put rentals in the list manually
    public void addRental(Rental rental) {           //addRental method to add a new rental to the database
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rental id: ");
        int rentalId = scanner.nextInt();
    }
    public void displayAllRentals() {          //displayAllRentals method to display all rentals in the database
        for (Rental rental : rentals) {
            System.out.println(rental);
        }
    }
    public void updateRental(Rental rental) {      //updateRental method to update a rental in the database by its id
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rental id to update: ");
    }
    public void deleteRental(Rental rental) {      //deleteRental method to delete a rental from the database by its id
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rental id to delete: ");
        int rentalId = scanner.nextInt();
        for (Rental r : rentals) {
            if (r.getRentalId() == rentalId) {
                rentals.remove(r);
                System.out.println("Rental deleted successfully");
                return;
            }
        }
        System.out.println("Rental not found");
    }
    public void searchRental(Rental rental) {      //searchRental method to search a rental in the database by its id
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rental id to search: ");
        int rentalId = scanner.nextInt();
        for (Rental r : rentals) {
            if (r.getRentalId() == rentalId) {
                System.out.println(r);
                return;
            }
        }
        scanner.close();
        System.out.println("Rental not found");
    }
    public void searchRentalByCustomerId(int customerId) { //searchRentalByCustomerId method to search a rental in the database by its customer id
        for (Rental r : rentals) {
            if (r.getCustomerId() == customerId) {
                System.out.println(r);
                return;
            }
        }
        System.out.println("Rental not found");
    }
    public void searchRentalByCarId(int carId) { //searchRentalByCarId method to search a rental in the database by its car id
        for (Rental r : rentals) {
            if (r.getCarId() == carId) {
                System.out.println(r);
                return;
            }           
        }
        System.out.println("Rental not found");
    }   

                                                
}
