public class ModeNotFound extends RuntimeException{
    public ModeNotFound() {
    }

    public ModeNotFound(String message) {
        super(message);
    }

    public ModeNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public ModeNotFound(Throwable cause) {
        super(cause);
    }

    public ModeNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
