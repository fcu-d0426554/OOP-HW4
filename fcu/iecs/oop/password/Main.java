package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		PasswordEncorder a=new PasswordEncorder();
		while(true)
		{
			System.out.println("Please enter a password:");
			String password;
			password=new Scanner(System.in).nextLine();
			if(password.equals("exit"))
			{
				break;
			}
			else
			{
				password=a.encode(password);
				System.out.println(password);
			}
		}
		
		}
}