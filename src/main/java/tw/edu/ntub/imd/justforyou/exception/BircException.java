package tw.edu.ntub.imd.justforyou.exception;

public abstract class BircException extends RuntimeException {
    public BircException(Throwable cause) {
        super(cause);
    }

    public BircException(String message) {
        super(message);
    }

    public abstract String getErrorCode();
}
