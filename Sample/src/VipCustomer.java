
public class VipCustomer {
	private String custName;
	private double credLimit;
	private String custEmail;
	
	public VipCustomer(){
		this("Unknown", 0.0, "unknown");
	}
	
	public VipCustomer(String custName, String custEmail){
		this(custName, 0.0, custEmail);
	}
	
	public VipCustomer(String custName, double credLimit, String custEmail){
		this.custName = custName;
		this.credLimit = credLimit;
		this.custEmail = custEmail;
	}
	
	public String getName(){
		return this.custName;
	}
	public double getCredLimit(){
		return this.credLimit;
	}
	public String getEmail(){
		return this.custEmail;
	}
}
