package carrentalservice;

import java.util.Scanner;

import carrentalDao.CarDao;
import carrentalmodel.Car;

public class CarService {
    private final CarDao carDao;

    public CarService(CarDao carDao) {
        this.carDao = carDao;
    }

    public void carMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("----- Car Menu -----");
            System.out.println("1. Add Car");
            System.out.println("2. Display All Cars");
            System.out.println("3. Update Car");
            System.out.println("4. Delete Car");
            System.out.println("5. Search Car by ID");
            System.out.println("6. Search Car by Brand");
            System.out.println("7. Search Car by Model");
            System.out.println("0. Back");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    carDao.addCar(null);
                    break;
                case 2:
                    carDao.displayAllCars();
                    break;
                case 3:
                    carDao.updateCar(null);
                    break;
                case 4:
                    carDao.deleteCar(null);
                    break;
                case 5:
                    carDao.searchCar(null);
                    break;
                case 6:
                    System.out.print("Enter brand: ");
                    String brand = scanner.next();
                    carDao.searchCarByBrand(brand);
                    break;
                case 7:
                    System.out.print("Enter model: ");
                    String model = scanner.next();
                    carDao.searchCarByModel(model);
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private int readIntSafe(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
