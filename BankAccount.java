package assaignment11;

import java.util.Scanner;

public class BankAccount {
public static int savings;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int savings, withDraw;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance amount in account : ");
        savings = sc.nextInt();
		System.out.print("Enter amount to be withdrawn : ");
		withDraw = sc.nextInt();
	}
	
	public static int debit(int withDraw) 
	{
        if(withDraw > savings)
        {
            System.out.println("Insufficient balance in Savings A/c!!");
            return savings;
        }
        savings = savings - withDraw;
        return savings;
    }

}
