package pl.sda.zamowienia;

public class CenaException extends Exception {
    public CenaException() {
    }

    public CenaException(String message) {
        super (message);
    }

    public CenaException(String message, Throwable cause) {
        super (message, cause);
    }

    public CenaException(Throwable cause) {
        super (cause);
    }
}
