package carrentalmodel;

public class Payment {
	
	//paymentMethod, paymentAmount, paymentDate, paymentStatus


	Rental rent;
	private int paymentId;
	private int rentId = rent.getRentalId();
	private String paymentMethod;
	private int paymentAmount;
	private int paymentDate;
	private boolean paymentStatus;

	public Payment(int paymentId, int rentId, String paymentMethod, int paymentAmount, int paymentDate, boolean paymentStatus) {
		this.paymentId = paymentId;
		this.rentId = rentId;
		this.paymentMethod = paymentMethod;
		this.paymentAmount = paymentAmount;
		this.paymentDate = paymentDate;
		this.paymentStatus = paymentStatus;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public int getRentId() {
		return rentId;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public int getPaymentAmount() {
		return paymentAmount;
	}
	public int getPaymentDate() {
		return paymentDate;
	}
	public boolean getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public void setRentId(int rentId) {
		this.rentId = rentId;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public void setPaymentDate(int paymentDate) {
		this.paymentDate = paymentDate;
	}
	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", rentId=" + rentId + ", paymentMethod=" + paymentMethod + ", paymentAmount=" + paymentAmount + ", paymentDate=" + paymentDate + ", paymentStatus=" + paymentStatus + "]";
	}
}
