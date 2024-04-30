package excepciones;

public class NoHayDinero extends Exception {
	private static final long serialVersionUID = 1L;
	
	public NoHayDinero() {
		super("No hay suficiente dinero para retirar de la cuenta");
	}
}
