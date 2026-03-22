package carrentalmodel;

public class Car {
    //carId, brand, model, year, color, fuelType, transmissionType, seatingCapacity, mileage, registrationNumber, isAvailable
	
    private int CarId;
    private String CarName;
    private String carBrand;
    private String carModel;
    private int carYear;
    private String carColor;
    private String carFuelType;
    private String carTransmissionType;
    private int carSeatingCapacity;
    private int carPrice;
    private int carMileage;
    private String carRegistrationNumber;
    private boolean carIsAvailable;

    public Car(int CarId, String CarName, String carBrand, String carModel, int carYear, String carColor, String carFuelType, String carTransmissionType, int carSeatingCapacity, int carPrice, int carMileage, String carRegistrationNumber, boolean carIsAvailable) {
        this.CarId = CarId;
        this.CarName = CarName;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carYear = carYear;
        this.carColor = carColor;
        this.carFuelType = carFuelType;
        this.carTransmissionType = carTransmissionType;
        this.carSeatingCapacity = carSeatingCapacity;
        this.carPrice = carPrice;
        this.carMileage = carMileage;
        this.carRegistrationNumber = carRegistrationNumber;
        this.carIsAvailable = carIsAvailable;
    }

	public int getCarId() {
		return CarId;
	}

	public void setCarId(int carId) {
		CarId = carId;
	}

	public String getCarName() {
		return CarName;
	}

	public void setCarName(String carName) {
		CarName = carName;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarYear() {
		return carYear;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarFuelType() {
		return carFuelType;
	}

	public void setCarFuelType(String carFuelType) {
		this.carFuelType = carFuelType;
	}

	public String getCarTransmissionType() {
		return carTransmissionType;
	}

	public void setCarTransmissionType(String carTransmissionType) {
		this.carTransmissionType = carTransmissionType;
	}

	public int getCarSeatingCapacity() {
		return carSeatingCapacity;
	}

	public void setCarSeatingCapacity(int carSeatingCapacity) {
		this.carSeatingCapacity = carSeatingCapacity;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

	public int getCarMileage() {
		return carMileage;
	}

	public void setCarMileage(int carMileage) {
		this.carMileage = carMileage;
	}

	public String getCarRegistrationNumber() {
		return carRegistrationNumber;
	}

	public void setCarRegistrationNumber(String carRegistrationNumber) {
		this.carRegistrationNumber = carRegistrationNumber;
	}

	public boolean isCarIsAvailable() {
		return carIsAvailable;
	}

	public void setCarIsAvailable(boolean carIsAvailable) {
		this.carIsAvailable = carIsAvailable;
	}
    
    @Override
    public String toString() {
        return "Car [CarId=" + CarId + ", CarName=" + CarName + ", carBrand=" + carBrand + ", carModel=" + carModel + ", carYear=" + carYear + ", carColor=" + carColor + ", carFuelType=" + carFuelType + ", carTransmissionType=" + carTransmissionType + ", carSeatingCapacity=" + carSeatingCapacity + ", carPrice=" + carPrice + ", carMileage=" + carMileage + ", carRegistrationNumber=" + carRegistrationNumber + ", carIsAvailable=" + carIsAvailable + "]";
    }
    
    
    
    
}
    