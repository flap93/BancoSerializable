package menu;

import java.util.Scanner;
import banco.CreateAccounts;
import banco.BancoMethodsFich;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option;
		
		do {
			 System.out.println("\nMenu:");
	         System.out.println("1. Create Accounts and add to cuentas.dat");
	         System.out.println("2. Show accounts from file cuentas.dat");
	         System.out.println("3. Delete accounts and file from cuentas.dat");
	         System.out.println("4. Add the accounts from the cuentas.dat file to" + "\n"+
	                               "the database");
	         System.out.println("5. Select an account and witdraw the money");
	         System.out.println("6. Add money to a account number");
	         System.out.println("7. Select an account from the database and show the info");
	         System.out.println("8. Salir");
	         System.out.print("Elija una opción: ");
	         
	         option = Integer.parseInt(sc.nextLine());
	            
	         switch(option) {
	         
	           case 1:
	                
	                BancoMethodsFich.saveAccInFile(CreateAccounts.create());
	                System.out.println("objeto guardado");
	            break;
	           case 2:
	        	   BancoMethodsFich.mostrarClientes();
	            break;
	           case 3:
	        	   BancoMethodsFich.DeleteAll();
	        	 
	            break;
	           case 4:
	            break;
	           case 5:
	            break;
	           case 6:
	            break;
	           case 7:
	        	   System.out.println("Fin del programa");
	        	break;
	           case 8:
	        	   System.out.println("Fin del programa");
	        	break;
	           default:
	        	   System.out.println("Opcion incorrecta elija otra valida");
	            break;
	      }
			
		} while (option != 8);
      sc.close();
	}

}
