
public abstract class Account implements IBaseRate {
	
	//List Common Properties for Saving and Checking Accounts
	
	private String name;
	private String sSn;
	double balance;
	protected String accountNumber;
	protected double rate;
	
	private static int index=10000;
	
	//Costructor to initialize the account ans to set Base Properties
	
	public Account(String name,String sSN,double initDeposit) {
		
		
		this.name=name;
		this.sSn=sSN;
		this.balance=initDeposit+100; 	
		//System.out.println("Name : "+name+ " SSN : "+sSN+ " Balance : "+balance);--this print statement will come in SHowINfo method in account class
		
		//System.out.println("Name : "+name);
		//System.out.print("New Account : ");
		index++;
		this.accountNumber=setAccountNumber();
		
		setRate();
		//System.out.println("Account No : "+accountNumber);--this print statement will come in SHowINfo method in account class
		
	}
	
	public abstract void setRate();
	
	public String setAccountNumber() {
		String lastTwoOfSsn=sSn.substring(sSn.length()-2, sSn.length());
		int uniqueID=index;
		int randomNumber=(int)(Math.random() * Math.pow(10, 3));
		return lastTwoOfSsn+uniqueID+randomNumber;
	}
	
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("Amount Deposited : "+amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance-=amount;
		System.out.println("Amount Withdrawn : "+amount);
		printBalance();
		
	}
	
	public void transfer(String toWhere,double amount) {
		balance-=amount;
		System.out.println("Transfering Amount : "+amount+ " Rs. to :  "+toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Balance : "+balance);
	}
	
	public void compound() {
		double accuredInterest=balance*(rate/100);
		System.out.println("Accured Interest : "+accuredInterest);
		balance=balance+accuredInterest;
		
		printBalance();
	}
	
	//List common Method
	
	public void showInfo() {
		System.out.println("Name : "+name+"\nAccoutn NO : "+this.accountNumber
				+"\nSSN : "+sSn+"\nBalance : "+balance+"\nRate : "+rate+ "%");
	}

}
