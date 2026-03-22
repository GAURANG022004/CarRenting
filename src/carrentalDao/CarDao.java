package carrentalDao;

import carrentalmodel.Car;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class CarDao {
    private List<Car> cars = new ArrayList<>();
    //no need to manually add cars to the list, the cars will be added automatically when the car is created using scanner class 
    //so we dont need to put cars in the list manually

    public void addCar(Car car) {           //addCar method to add a new car to the database
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the car id: ");
        int carId = scanner.nextInt();

        System.out.println("Enter the car name: ");
        String carName = scanner.next();
        scanner.nextLine();
        
        System.out.println("Enter the car brand: ");
        String carBrand = scanner.next();
        scanner.nextLine();

        System.out.println("Enter the car model: ");
        String carModel = scanner.next();
        scanner.nextLine();

        System.out.println("Enter the car year: ");
        int carYear = scanner.nextInt();

        System.out.println("Enter the car color: ");
        String carColor = scanner.next();
        scanner.nextLine();

        System.out.println("Enter the car fuel type: ");
        String carFuelType = scanner.next();
        scanner.nextLine();

        System.out.println("Enter the car transmission type: ");
        String carTransmissionType = scanner.next();
        scanner.nextLine();

        System.out.println("Enter the car seating capacity: ");
        int carSeatingCapacity = scanner.nextInt();

        System.out.println("Enter the car price: ");
        int carPrice = scanner.nextInt();

        System.out.println("Enter the car mileage: ");
        int carMileage = scanner.nextInt();

        System.out.println("Enter the car registration number: ");
        String carRegistrationNumber = scanner.next();
        scanner.nextLine();

        System.out.println("Enter the car is available: ");
        boolean carIsAvailable = scanner.nextBoolean();


        car = new Car(carId, carName, carBrand, carModel, carYear, carColor, carFuelType, carTransmissionType, carSeatingCapacity, carPrice, carMileage, carRegistrationNumber, carIsAvailable);
        cars.add(car);

        System.out.println("Car added successfully");
    }
    
    

    public void displayAllCars() {          //displayAllCars method to display all cars in the database
        
        for (Car car : cars) {
            System.out.println(car);
        }
    }
    
    
    public void updateCar(Car car) {     
           //updateCar method to update a car in the database by its id
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the car id to update: ");
        int carId = scanner.nextInt();
        
        for (Car c : cars) {
            if (c.getCarId() == carId) {
            	
                System.out.println("Enter the car name: ");
                String carName = scanner.nextLine();
                c.setCarName(carName);

                System.out.println("Enter the car brand: ");
                String carBrand = scanner.nextLine();
                c.setCarBrand(carBrand);

                System.out.println("Enter the car model: ");
                String carModel = scanner.nextLine();
                c.setCarModel(carModel);
                
                System.out.println("Enter the car year: ");
                int carYear = scanner.nextInt();
                c.setCarYear(carYear);
                
                System.out.println("Enter the car color: ");
                String carColor = scanner.nextLine();
                c.setCarColor(carColor);
                
                System.out.println("Enter the car fuel type: ");
                String carFuelType = scanner.nextLine();
                c.setCarFuelType(carFuelType);
                
                System.out.println("Enter the car transmission type: ");
                String carTransmissionType = scanner.nextLine();
                c.setCarTransmissionType(carTransmissionType);
                
                System.out.println("Enter the car seating capacity: ");
                int carSeatingCapacity = scanner.nextInt();
                c.setCarSeatingCapacity(carSeatingCapacity);
                
                System.out.println("Enter the car price: ");
                int carPrice = scanner.nextInt();
                c.setCarPrice(carPrice);
                
                System.out.println("Enter the car mileage: ");
                int carMileage = scanner.nextInt();
                c.setCarMileage(carMileage);
                
                System.out.println("Enter the car registration number: ");
                String carRegistrationNumber = scanner.nextLine();
                c.setCarRegistrationNumber(carRegistrationNumber);
                
                System.out.println("Enter the car is available: ");
                boolean carIsAvailable = scanner.nextBoolean();
                
                
                System.out.println("Car updated successfully");
                
                
                return;
            }
        }
        System.out.println("Car not found");
    }
    
    
    public void deleteCar(Car car) {        //deleteCar method to delete a car from the database
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the car id to delete: ");
        int carId = scanner.nextInt();
        
        for (Car c : cars) {
            if (c.getCarId() == carId) {
                cars.remove(c);
                System.out.println("Car deleted successfully");
                return;
            }
        }

        scanner.close();
        
        
        System.out.println("Car not found");
    }
    
    

    public void searchCar(Car car) {      //searchCar method to search a car in the database by its id
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the car id to search: ");
        int carId = scanner.nextInt();
        
        for (Car c : cars) {
            if (c.getCarId() == carId) {
                System.out.println(c);
                return;
            }
        }
        scanner.close();
        System.out.println("Car not found");
       

    }
    
    
    public void searchCarByBrand(String brand) { //searchCarByBrand method to search a car in the database by its brand
        
        for (Car c : cars) {
            if (c.getCarBrand().equals(brand)) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("Car not found");
    }


    public void searchCarByModel(String model) { //searchCarByModel method to search a car in the database by its model
        
        for (Car c : cars) {
            if (c.getCarModel().equals(model)) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("Car not found");
    }

    
}
    
