package banco;

import java.util.Scanner;

public class CreateAccounts {
	// Un único Scanner para toda la clase
	//Mantenimiento de un solo Scanner: 
	//Utilizando un único Scanner a nivel de la clase 
	//para evitar abrir y cerrar múltiples Scanners,
	//lo cual puede llevar a errores como NoSuchElementException.
	
	//Si tu programa se ejecuta en un bucle o requiere múltiples 
	//creaciones de cuenta, considera la posibilidad de manejar 
	//el cierre del Scanner de manera más global (por ejemplo, 
	//cerrándolo en el método main o similar 
	//cuando estés completamente seguro de que ya no se necesita más), 
	//en lugar de cerrarlo dentro de un método que se llame repetidamente.
	//	Esto evitará los problemas que discutimos anteriormente.
	//	
	
	private static Scanner sc = new Scanner(System.in);
	
   public static Cuenta create() {
	 String accountNum = ReadAccountNumber();
	 String name;
	 String lastName;
	 double saldo;
     
	 System.out.println("Introduce the owner's account name");
	 name = sc.nextLine();
	 
	 System.out.println("Introudce the owner's account last name");
	 lastName = sc.nextLine();
	 
	 System.out.println("Introduce funds available for this account");
	 saldo = sc.nextDouble();
	 sc.nextLine(); // Limpiar el búfer después de leer un número.
	 
	 
	Cuenta cuenta = new Cuenta(accountNum,name,lastName,saldo);
	return cuenta;
  }
   
   /**
    * This method handle a validation for 
    * the account number of user and must have
    * a length of 9 characters
    * @return (String) the account number
    */
  public static String ReadAccountNumber() {
	  String accountNum;
	  System.out.println("Introduce the new account number");
	  System.out.println("The must have 9 characters(Numbers or letters)");
	  accountNum = sc.nextLine();
	  while(accountNum.length() != 9) {
		  System.out.println("The account must have length of 9 characters");
		  System.out.println("Try again please");  
		  accountNum = sc.nextLine();
	  }
	  return accountNum;
  }
   
}

