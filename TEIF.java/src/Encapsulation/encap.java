package Encapsulation;
import java.util.*;

public class encap {
	public static void main(String []args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("please enter amount to deposit");
		Bank b = new Bank();
		int bal = sc.nextInt();
		b.setBalance(bal);
		System.out.println("your current balance is : "+b.getBalance());
		
		System.out.println("please enter amount to widrawl");
		int w =sc.nextInt();
	    int upd_bal = b.getBalance()-w;
	    b.setBalance(upd_bal);
		System.out.println("your current balance is : "+ b.getBalance());
		



		
	}

}
class Bank {
	public int balance;
	public void setBalance (int bal) {
		if(bal>0) {
		balance = bal;
		}
		else {
			System.out.println("invalid");
		}
	}
	public int getBalance() {
		return balance;
	}
}
