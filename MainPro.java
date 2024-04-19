package epl;

import java.util.Scanner;
import java.util.ArrayList;

public class MainPro {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String name,city;
		int accno,amt;
		ArrayList<Account> list=new ArrayList<>();
		
		list.add(new Account("Sumit Mhaske","Shevgaon",10000));
		list.add(new Account("Satish Mhaske","Ahmadnagar",11000));
		list.add(new Account("Sujit Mhaske","Shevgaon",12000));
		
		System.out.println("Select Operations");
		System.out.println("1.Open Account");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Balance Enquiry");
		System.out.println("5.List All");
		System.out.println("6.Exit");
		
		
		int choice;
		boolean found;
		do {
			
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice) {
					case 1:
						System.out.println("_______Account open____________");
						System.out.print("Enter name");
						name=sc.next();
						System.out.print("Enter city");
						city=sc.next();
						System.out.print("Enter Amount");
						amt=sc.nextInt();
						Account acc=new Account(name,city,amt);
						list.add(acc);
						System.out.println("Account Opened.....!!");
						break;
						
					case 2:System.out.println("_______Account Deposit____________");
					found=false;
					System.out.println("Enter Account no ");
					accno=sc.nextInt();
					for(Account ac:list) {
						if(accno==ac.getAccno())
						{
							found=true;
							System.out.println("Customer Name "+ac.getName());
							System.out.println("City "+ac.getCity());
							System.out.println("Account Balance"+ac.getBal());
							
							System.out.println("\n Enter amount to deposit");
							amt=sc.nextInt();
							ac.setBal(ac.getBal()+amt);
							System.out.println("Deposit Succesfully..!!");
							break;
						}
					}
					if(!found)
					{
						System.out.println("Invalid Account Number");
						
					}
					break;
					
					case 3:System.out.println("_______Account Withdraw____________");
					System.out.println("_______Account Deposit____________");
					found=false;
					System.out.println("Enter Account no ");
					accno=sc.nextInt();
					for(Account ac:list) {
						if(accno==ac.getAccno())
						{
							found=true;
							System.out.println("Customer Name "+ac.getName());
							System.out.println("City "+ac.getCity());
							System.out.println("Account Balance"+ac.getBal());
							
							System.out.println("\n Enter amount to withdraw");
							amt=sc.nextInt();
							if(amt<=ac.getBal()) {
							ac.setBal(ac.getBal()-amt);
							System.out.println("withdraw Succesfully..!!");
							}
							else {
								System.out.println("Insufficient Balance");
							}
							break;
						}
					}
					if(!found)
					{
						System.out.println("Invalid Account Number");
						
					}
					break;
					
					case 4:System.out.println("_______Account Balance Enquiry____________");
					found=false;
					System.out.println("Enter Account no ");
					accno=sc.nextInt();
					for(Account ac:list) {
						if(accno==ac.getAccno())
						{
							found=true;
							System.out.println("Customer Name "+ac.getName());
							System.out.println("City "+ac.getCity());
							System.out.println("Account Balance"+ac.getBal());
							
							
							break;
						}
					}
					if(!found)
					{
						System.out.println("Invalid Account Number");
						
					}
					break;
					
					case 5:System.out.println("_______List of All Accounts____________");
					for(Account ac:list) {
						System.out.println(ac);
					}
					break;
					
					case 6:System.out.println("_______Thanks for visiting____________");
					break;
					
						
					default:System.out.println("_______Invalid Choice____________");
					break;
					
					}
			
		}while(choice!=6);
		
	}

}