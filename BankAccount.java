package com.oops;

public class BankAccount {

	double balance;
	String customerName;
	String address;
	String updateAddress;
	String updateCustomerName;
	double amount=0;
	
	public BankAccount(double bal,String name,String add) {
		balance=bal;
		customerName=name;
		address=add;
	}
	
	public void printData() {
		
		System.out.println(balance + " " + customerName + " " + address + " ");
		System.out.println("-----------------------");
	}
	
	public BankAccount() {
		balance=0;
		customerName="NA";
		address="NA";
		System.out.println("---------------");
	}
	
	public void deposite(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("After deposite");
			System.out.println(balance);
			System.out.println("-----------------------");
		}
		else {
			System.out.println("invalid amount - Deposite fail");
		}
	}
	
	public void withdraw(double amount) {
		if(amount<0) {
			System.out.println("invalid amount - withdraw failed.");
		}
		else if(amount>balance){
			System.out.println("insufficient funds-withdrawal failed");
		}
		else {
			balance=balance-amount;
			System.out.println("After withdrawl");
			System.out.println(balance);
		}
	}
	
	public void updateAddress(String newAddress) {
			updateAddress=newAddress;
			System.out.println("Updated Address sucessfully");
			System.out.println("updated Address :" +updateAddress);
	}
	
	public void updateCustomerName(String newCustomerName) {
		updateCustomerName=newCustomerName;
		System.out.println("Updated address sucessfully");
		System.out.println("updated Name :" +updateCustomerName);
}

	
	
	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		bank.printData();
		BankAccount bank1 = new BankAccount(1000.0,"Bhargavi","Cumbum");
		bank1.printData();
		bank1.deposite(3000.0);
		bank1.withdraw(2200);
		System.out.println("-------------------------");
		bank1.updateAddress("Kphp");
		bank1.updateCustomerName("Thanmai");
	}



	
	
}
