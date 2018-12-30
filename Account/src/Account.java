import java.util.*;
public class Account {
	//instance variable...
	private double accNo;
	private int accBal;
	private String name;
	public double getAccNo() {
		return accNo;
	}
	public void setAccNo(double accNo) {
		this.accNo = accNo;
	}
	public int getAccBal() {
		return accBal;
	}
	public void setAccBal(int acccBal) {
		this.accBal = acccBal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
 void accept()
 {
	 Scanner sc =new Scanner(System.in);	
	 
	 System.out.println("Enter your Acc No: ");
	 double accNo= sc.nextDouble();
	 System.out.println("Enter your Acc Bal: ");
	 int accBal= sc.nextInt();
	 System.out.println("Enter your Name : ");
	 String name= sc.next();
	 setAccNo(accNo);
	 setAccBal(accBal);
	 setName(name);
	 
 }
 void display() {
	 System.out.println("Your Acc No is: "+ accNo);
	 System.out.println("Your Acc Bal is: "+ accBal);
	 System.out.println("Your Name is: "+ name);
 }
}
