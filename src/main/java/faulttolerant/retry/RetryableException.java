package faulttolerant.retry;

public class RetryableException extends RuntimeException {

    public RetryableException() {
        super();
    }

    public RetryableException(String msg) {
        super(msg);
    }
}