package Test;

import BankAccount.BankAccount;

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount paigeAccount = new BankAccount( 100.00, 100.00);
		
		
		paigeAccount.depositMoney(50, "saving");
		paigeAccount.printAccount();
		
		paigeAccount.withdrawMoney(30, "checking");
		paigeAccount.seeChecking();
		paigeAccount.withdrawMoney(100, "saving");
		paigeAccount.seeSaving();
		paigeAccount.printAccount();
		paigeAccount.seeTotalOfAccounts();
		
	}

}
