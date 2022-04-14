package BankAccount;
import java.util.Random;

public class BankAccount {
	
	private int accountNumber;
	private double checkingBalance;
	private double savingBalance;
	public static int numberOfAccounts = 0;
	public static double totalOfAccounts = 0;

	
//	Constructors
	
	public BankAccount(double checkingBalance, double savingBalance) {
		super();
		this.accountNumber = generateId();
		this.checkingBalance = checkingBalance;
		this.savingBalance = savingBalance;
		totalOfAccounts = savingBalance + checkingBalance; 
		numberOfAccounts++;
	}
	
	
//	Getter and Setters
	
	
	public double getCheckingBalance() {
		
		return this.checkingBalance;
	}


	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}


	public double getSavingBalance() {
		return this.savingBalance;
	}


	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}

	
	
//	Static Methods
	
	
	public static double totalOfAccounts() {
		return totalOfAccounts;
	}
	
	public static int numberOfAccounts() {
		return numberOfAccounts;
	}
	
	
//	Class Methods
	
	private static int generateId() {
		Random randNum = new Random();
		int randomId = randNum.nextInt(100000000) + 99999999;
		return randomId;
	}
	
	public void depositMoney(double ammount, String account) {
		
		if (account == "saving") {
			this.savingBalance+= ammount;
		}
		else {
			this.checkingBalance+=ammount;
		}
		BankAccount.totalOfAccounts+=ammount;
		
	}
	
	public void withdrawMoney(double ammount, String account) {
		
		if (account == "saving" && ammount < this.savingBalance) {
			this.savingBalance-=ammount; 
		}
		else if (account == "checking" && ammount < this.checkingBalance) {
			this.checkingBalance-=ammount;
		}
		else {
			System.out.println("There are insufficient funds.");
		}
		BankAccount.totalOfAccounts-=ammount;
		
	}
	
	public void seeChecking() {
		System.out.printf("Checking: %.2f\n", getCheckingBalance());
	}
	
	public void seeSaving() {
		System.out.printf("Saving: %.2f\n", getSavingBalance());
	}
	
	public void seeAccountNumber() {
		System.out.println("Account Number: " + accountNumber);
	}
	
	public void seeTotalOfAccounts() {
		System.out.println("Total in Accounts: " + totalOfAccounts());
	}
	
	public void printAccount() {
		seeAccountNumber();
		seeChecking();
		seeSaving();
		seeTotalOfAccounts();
		
	}

	

}
