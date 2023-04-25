
public class Checking extends Account {
	 
	//List properties specific to Checking account
	
	private long debitCardNumber;
	private int debitCardPin;
	
	//Constructor to initialize setting for  Checking
	
	public Checking(String name,String sSN,double initDeposit) {
		super(name,sSN,initDeposit);
		accountNumber="CH_"+accountNumber;
		//System.out.println("Account No : "+this.accountNumber);--this print statement will come in SHowINfo method in account class
		//System.out.println("New Checking Account"); --this print statement will come in SHowINfo method in account class
		setDebitCard();
	}
	
	private void setDebitCard() {
		debitCardNumber=(long)(Math.random()*Math.pow(10, 12));
		debitCardPin=(int)(Math.random()*Math.pow(10, 4));
	} 
	
	//List method specific to Checking account
	
	public void showInfo() {		
		System.out.println("Account Type : Checking");
		super.showInfo();
		System.out.println("Checking Account Features : \n Debit Card Number : "+debitCardNumber+"\n Debit Card Pin : "+debitCardPin);
	}

	@Override
	public void setRate() {
		//System.out.println("Implementing Set Rate for Checking Account"); to Check 
		
		rate=getBaseRate()*.15;
	}

}
