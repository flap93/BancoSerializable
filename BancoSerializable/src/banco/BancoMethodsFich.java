package banco;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import constantesBD.constantesFich;

public class BancoMethodsFich {
   
 private static ObjectOutputStream salida;
 
 /**
  * Lee los clientes de cuentas.dat
  * @param archivo
  */
 
 public static boolean mostrarClientes() {
	 Cuenta cuenta = null;
	 boolean vacio = true;
	 
	 try(ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(constantesFich.NOMFICHCUENTA))){
		 
		 while(true) {
			 cuenta = (Cuenta) entrada.readObject();
			 System.out.println(cuenta);
			 vacio = false;
			 
		 }
	 } catch(EOFException ex) {
		 return vacio;
	 }catch(Exception ex) {
			System.out.println("Excepcion capturada en listarClientes" + ex.toString());
			return vacio;
	 }
 }
	
 public static void saveAccInFile(Cuenta cuenta) {
	 try {
			// Creamos un fujo de salida hacia clientes.dat

			if (tieneRegistros()) {
				// Si clientes.dat existe.
				// El flujo ObjectOutputStream es el que procesa los datos de
				// salida y se ha de vincular a un objeto de la clase
				// FileOutputStream.(Serializar)
				salida = new MiObjectOuputStream(new FileOutputStream(constantesFich.NOMFICHCUENTA, true));
				////////////////////////////////////////////////////////////////
				// Evitamos que nos aniada una cabecera en mitad del fichero //
				////////////////////////////////////////////////////////////////
			} else {
				// Si no existe uso la clase ObjectOutputStream para
				// escribir la cabecera y el PRIMER registro
				salida = new ObjectOutputStream(new FileOutputStream(constantesFich.NOMFICHCUENTA));
			}
			// Grabar cliente
			if (salida != null) {
				salida.writeObject(cuenta);
			}

			// Captura de excepciones.
		} catch (IOException ex) {
			System.out.println("Excepcion capturada en guardarClienteEnArchivo" + ex.getMessage());
		} finally {
			try {
				if (salida != null)
					salida.close();
			} catch (IOException e) {
			}
		}
	 
 }
 /**
	 * Borrar todo del fichero y el fichero
	 */
 
 public static boolean DeleteAll() {
	 File cuentasDat = new File(constantesFich.NOMFICHCUENTA);

	 if(cuentasDat.delete()) {
		 System.out.println("Borrado con exito");
		 return true;
	 } else {
		 System.out.println("No se pudo borrar el fichero");
		 return false;
	 }
}
 
 
 
 
 
 /**
	 * Comprobar existencia del archivo
	 */
	public static boolean existeFichero() {
		File f = new File(constantesFich.NOMFICHCUENTA);

		return (f.exists());
	}
	
	/**
	 * Comprobar si el archivo tiene registros
	 */
	public static boolean tieneRegistros() {
		File f = new File(constantesFich.NOMFICHCUENTA);

		return (f.exists() && f.length() > 0);
	}
	
}
