import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SwissBank<E> extends Object {

	static long initialAccountNumber = 1000000;
	static long initialCustomerId = 101010;
	private long accountNumber;
	private String accountHolderName;
	private long accountBalance;
	private long customerId;
	private String customerAddress;
	// bankName is a constant variable
	final static String bankName = "Swiss Bank of Hyderabad";

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public long getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public static String getBankname() {
		return bankName;
	}

	// default Constructor
	SwissBank() {

	}

	// deposite method
	void depositeMethod(int depositeAmount) {
		System.out.println("Your are Trying to deposite:" + depositeAmount);
		accountBalance = this.getAccountBalance() + depositeAmount;
		System.out.println("Total balance available in your account is:" + accountBalance);
	}

	// withdrawl
	// parameterized constructor
	public SwissBank(String accountHolderName, long accountBalance, String customerAddress) {
		this.accountNumber = initialAccountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.customerId = initialCustomerId;
		this.customerAddress = customerAddress;
		++initialAccountNumber;
		++initialCustomerId;
	}

	void withdrawAmount(int withdrawAmount) {
		System.out.println("You're trying to withdraw :" + withdrawAmount);
		System.out.println("connecting to a server!");
		if (withdrawAmount > 49999) {
			System.out.println("Please Enter the PAN card details are per the RBI guidelines:");
			Scanner input = new Scanner(System.in);
			String userEnteredInput = input.next();
			char[] charArray = userEnteredInput.toCharArray();
			if (charArray.length != 10) {
				System.out.println("You have entered following Pan card:" + userEnteredInput);
				System.out.println("Correct Pan card:");
				if (withdrawAmount > this.getAccountBalance()) {
					System.out.println("Insufficient Funds!!");
				} else {
					accountBalance = this.getAccountBalance() - withdrawAmount;
					System.out.println("Available Balance is:" + this.getAccountBalance());
				}
			}else {
				System.out.println("Invalid PAN card Number - Please check your inputs");
			}
		}else
			System.out.println("The Withdrawal is successfull "+"the amount withdrawn is :"+withdrawAmount);
	}

	void transfer(int transferAmount, int customerId, List<SwissBank> customers) {
		Iterator<SwissBank> itr = customers.iterator();
		while (itr.hasNext()) {
			SwissBank customerObject = itr.next();
			if (customerObject.getCustomerId() == customerId) {
				System.out.println("Account Holder Name is:" + customerObject.getAccountHolderName());
				customerObject.accountBalance += transferAmount;
				System.out.println(
						"Available balance in the transferred account is:" + customerObject.getAccountBalance());
			}
		}
	}

	public String toString() {
		return "Customer AccountNumber is:" + this.getAccountNumber() + "\nCustomer Name is:"
				+ this.getAccountHolderName() + "\nAvailable Balance is:" + this.getAccountBalance()
				+ "\nCustomer ID is:" + this.getCustomerId() + "\nCustomer Address is:" + this.getCustomerAddress()
				+ "\nCustomer Bank Name is:" + this.bankName;
	}
}
