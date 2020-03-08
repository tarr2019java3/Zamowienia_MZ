package pl.sda.zamowienia.exeptions;

public class CustomerExeption extends Exception {
    public CustomerExeption() {
    }

    public CustomerExeption(String message) {
        super (message);
    }
}
