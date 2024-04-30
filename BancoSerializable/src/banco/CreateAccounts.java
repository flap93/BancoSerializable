package banco;

import java.util.Scanner;

public class CreateAccounts {
 
 public static Cuenta create() {
	 Scanner sc = new Scanner(System.in);
	 String accountNum;
	 String name;
	 String lastName;
	 double saldo;
	 System.out.println("Introduce a new account number " + "\n" +
	                    "mandatory 9 characters(numbers or string)");
	 
	 accountNum = sc.nextLine();
	 System.out.println("Introduce the owner's account name");
	 name = sc.nextLine();
	 System.out.println("Introudce the owner's account last name");
	 lastName = sc.nextLine();
	 System.out.println("Introduce funds available for this account");
	 saldo = sc.nextDouble();
	 
	 
	 Cuenta cuenta = new Cuenta(accountNum, name, lastName, saldo);
	 
	 //sc.close();
	 
	 return cuenta;
 }
	
	
}
