package banco;

import java.io.Serializable;

public class Cuenta implements Serializable {
	private static final long serialVersionUID = 1L;
	private String numCuenta;
	private String nombUser;
	private String apellUser;
	double saldo;


	
public Cuenta() {};

public Cuenta(String numCuenta, String nombUser, String apellUser, double saldo) {
	   this.numCuenta = numCuenta;
	   this.nombUser = nombUser;
	   this.apellUser = apellUser;
	   this.saldo = saldo;
   }


/**
 * Getters and Setters from the class
 * getNumCuenta();
 * @return the account number
 * getNombUser()
 * @return the owner's name
 * getApellUser((
 * @return the owner's last name
 * getSaldo()
 * @return the amount of the account available
 */

public String getNumCuenta() {
	return numCuenta;
}

public void setNumCuenta(String numCuenta) {
	this.numCuenta = numCuenta;
}

public String getNombUser() {
	return nombUser;
}

public void setNombUser(String nombUser) {
	this.nombUser = nombUser;
}

public String getApellUser() {
	return apellUser;
}

public void setApellUser(String apellUser) {
	this.apellUser = apellUser;
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}


/**
 * 
 * Methods
 * 
 * 
 */


//public void withDrawMoney(Cuenta cuenta, int amount) {
//	
//	
//}


@Override
public String toString() {
	return "Cuenta [numCuenta=" + numCuenta + ", nombUser=" + nombUser + ", apellUser=" + apellUser + ", saldo=" + saldo
			+ "]";
}





}
