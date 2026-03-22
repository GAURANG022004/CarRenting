package carrentalmodel;

public class Rental {
	
	Customer cust;
	Car car;
	
	private int rentalId;


	private int customerId = cust.getCustomerId();

	private int carId = car.getCarId();

	private int rentalDate;

	private int returnDate;

	private int numberOfDays;

	private int totalPrice;

	private boolean rentalStatus;

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public int getRentalId() {
		return rentalId;
	}

	public void setRentalId(int rentalId) {
		this.rentalId = rentalId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public int getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(int rentalDate) {
		this.rentalDate = rentalDate;
	}

	public int getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(int returnDate) {
		this.returnDate = returnDate;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public boolean isRentalStatus() {
		return rentalStatus;
	}

	public void setRentalStatus(boolean rentalStatus) {
		this.rentalStatus = rentalStatus;
	}

	@Override
	public String toString() {
		return "Rental [cust=" + cust + ", car=" + car + ", rentalId=" + rentalId + ", customerId=" + customerId
				+ ", carId=" + carId + ", rentalDate=" + rentalDate + ", returnDate=" + returnDate + ", numberOfDays="
				+ numberOfDays + ", totalPrice=" + totalPrice + ", rentalStatus=" + rentalStatus + "]";
	}
	
	
	
	

}
