package CrypterPackage;

public class CrypterException extends Throwable{
	
    public CrypterException() {
        super();
    }

    public CrypterException(final String arg0) {
        super(arg0);
    }

    public CrypterException(final Throwable arg0) {
        super(arg0);
    }

    public CrypterException(final String arg0, final Throwable arg1) {
        super(arg0, arg1);
    }

    public CrypterException(final String arg0, final Throwable arg1, final boolean arg2, final boolean arg3) {
        super(arg0, arg1, arg2, arg3);
    }
}
