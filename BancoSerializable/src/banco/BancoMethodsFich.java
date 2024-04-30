package banco;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import constantesBD.constantesFich;

public class BancoMethodsFich {
   
	private static ObjectOutputStream salida;
	
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
