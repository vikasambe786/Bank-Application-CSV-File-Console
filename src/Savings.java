
public class Savings extends Account {
	
	//List properties specific to Saving account
	
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
		//Constructor to initialize setting for  Saving
	public Savings(String name,String sSN,double initDeposit) {
		super(name,sSN,initDeposit);
		accountNumber="SA_"+accountNumber;
		//System.out.println("Account Number : "+this.accountNumber); --this print statement will come in SHowINfo method in account class
		//System.out.println("New Saving Account"); --this print statement will come in SHowINfo method in account class
		setSafetyDepositBox();
		
		
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID=(int)(Math.random()*Math.pow(10, 3));
		safetyDepositBoxKey=(int)(Math.random()*Math.pow(10, 4));
		
	}
		
		//List method specific to Saving account

	public void showInfo() {
		System.out.println("Account Type : Savings");
		super.showInfo();
		System.out.println("Your Saving Account Features : \n Safety Deposit Box ID : "+safetyDepositBoxID+
				"\n Safety Deposit Box Key : "+safetyDepositBoxKey);
		
	}

	@Override
	public void setRate() {
		//System.out.println("Implementing Set Rate for Saving Account");--To Check
		
		rate=getBaseRate()-.25;
		
	}

}
