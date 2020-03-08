package pl.sda.zamowienia;

public class Product {
    //Klasa posiada pola składowe:
    // name (nazwa produktu), price (cena produktu),
    // category (pole typu Category – kategoria produktu)
    private String name;
    private double cena;
    private Category category;

    public Product(String name, int cena, Category category) {
        this.name = name;
        this.cena = cena;
        this.category = category;
    }

    public Product(String baton, int cena, String c) {

    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String checkName(String name) {
        return checkName (name.toUpperCase ( ));
    }

    public boolean cenaDodatnia(double cena) {
        if (cena > 0.0) {
            return true;
        } else {
            return false;
        }

    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) throws CenaException {
        if(cenaDodatnia (cena)) {
            this.cena = cena;
        }
        else{
            throw new CenaException ("Cena musi być większa od 0");
        }this.cena = cena;
    }
}
