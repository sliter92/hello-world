
public class BankAccount {
	private int accountNumber;
	private double accountBalance;
	private String custName;
	private String custEmail;
	private int custPhone;
	
	// SET Methods
	
	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	public void setAccountBalance(double accountBalance){
		this.accountBalance = accountBalance;
	}
	public void setCustName(String custName){
		this.custName = custName;
	}
	public void setCustEmail(String custEmail){
		this.custEmail = custEmail;
	}
	public void setCustPhone(int custPhone){
		this.custPhone = custPhone;
	}
	
	// GET Methods
	public int getAccountNumber(){
		return this.accountNumber;
	}
	public double getAccountBalance(){
		return this.accountBalance;
	}
	public String getCustName(){
		return this.custName;
	}
	public String getCustEmail(){
		return this.custEmail;
	}
	public int getCustPhone(){
		return this.custPhone;
	}
	
	//Deposit Method
	public void accountDeposit(double depositAmount){
		accountBalance += depositAmount;
		System.out.println("New balance: "+ getAccountBalance());
	}
	
	public void accountWithdraw(double withdrawAmount){
		if(withdrawAmount <= accountBalance){
			accountBalance -= withdrawAmount;
			System.out.println("New balance: "+ getAccountBalance());
		}
		else{
			System.out.println("Insufficient funds to complete this transaction");
		}
	}
}
