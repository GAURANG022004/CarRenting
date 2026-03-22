package carrentalmodel;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String customerPhoneNumber;
	private String customerEmail;
	private String customerAddress;
	private int drivingLicenseNumber;
	private int customerAge;
	
	
	
	public Customer(int customerId2, String customerName2, String customerPhoneNumber2, String customerEmail2,
            String customerAddress2, int drivingLicenseNumber2, int customerAge2) {
        //TODO Auto-generated constructor stub
    }
    public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getDrivingLicenseNumber() {
		return drivingLicenseNumber;
	}
	public void setDrivingLicenseNumber(int drivingLicenseNumber) {
		this.drivingLicenseNumber = drivingLicenseNumber;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPhoneNumber=" + customerPhoneNumber + ", customerEmail=" + customerEmail + ", customerAddress=" + customerAddress + ", drivingLicenseNumber=" + drivingLicenseNumber + ", customerAge=" + customerAge + "]";
	}
	
	
	

}
