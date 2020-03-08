package pl.sda.zamowienia;

public class Customer {
    //name (imię klienta), surname(nazwisko klienta),
    // age (wiek klienta), email (adres e-mail klienta)
    private String nameSurname;
    private int age;
    private String email;

    public Customer(String name, String surname, int age, String email) {
        this.nameSurname = name;
        this.age = age;
        this.email = email;
    }
    public Customer (){

    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
