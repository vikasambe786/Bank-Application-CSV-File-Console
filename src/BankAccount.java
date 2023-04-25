import java.util.LinkedList;
import java.util.List;

public class BankAccount {

	public static void main(String[] args) {
		
		List<Account> accounts=new LinkedList<Account>();
		
		String file="C:\\NETC_FRM\\Java Practise\\bankAccount.csv";
		
		/*
		 * Checking checking=new Checking("Vikas Shukla","A123",1500); Savings
		 * savings=new Savings("Avika Shukla","A4560",2000);
		 * 
		 * checking.showInfo();
		 * 
		 * System.out.println("*****************---******************");
		 * savings.showInfo();
		 * 
		 * savings.deposit(5000); savings.withdraw(1000);
		 * savings.transfer("Vikas Shukla", 500);
		 * 
		 * savings.compound();
		 * 
		 * checking.deposit(2000); checking.withdraw(300); checking.transfer("Avika",
		 * 700);
		 */
		
		
		
			//Read a CSV data and Create an Account based on that CSV data
		
		List<String[]> newAccountHolders=CSV.read(file);
		for(String[] accountHolder:newAccountHolders) {
			//System.out.println("NEW ACCOUNT");
			
			String name=accountHolder[0];
			String sSN=accountHolder[1];
			String accountType=	accountHolder[2];	
			double initDeposit=Double.parseDouble(accountHolder[3]);
			
			//System.out.println("Name : "+name+ " , SSN : "+sSN+ " , Account Type : "+accountType+ " , Deposit : "+initDeposit);
			
			if(accountType.equals("Savings")) {
				//System.out.println("Open a Saving Account");
				accounts.add(new Savings(name, sSN, initDeposit));			
				}
			else if(accountType.equals("Checking")) {
				//System.out.println("Open a Checking Account");
				accounts.add(new Checking(name, sSN, initDeposit));
			}else {
				System.out.println("Error Reading Account Types");
			}
		}
		
		//accounts.get(5).showInfo(); to show individual Details
		
		for(Account ac:accounts) {
			System.out.println("*****-----*****");
			ac.showInfo();
		}
	}

}
