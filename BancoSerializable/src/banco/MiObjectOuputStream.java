package banco;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MiObjectOuputStream extends ObjectOutputStream{
	
	public MiObjectOuputStream(OutputStream out) throws IOException {
		super(out);
	}
	
	protected MiObjectOuputStream() throws IOException, SecurityException
    {
        super();
    }
	
	@Override
    protected void writeStreamHeader() throws IOException {
        // No escribir una cabecera de stream al iniciar el flujo
    }

}
