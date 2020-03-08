package pl.sda.zamowienia.exeptions;

public class EmailExeption extends Exception{
    public EmailExeption() {
    }

    public EmailExeption(String message) {
        super (message);
    }
}

