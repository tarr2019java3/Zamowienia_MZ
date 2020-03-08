package pl.sda.zamowienia;

public class Product {
    //Klasa posiada pola składowe:
    // name (nazwa produktu), price (cena produktu),
    // category (pole typu Category – kategoria produktu)
    private String name;
    private int cena;
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

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String checkName(String name) {
        return checkName (name.toUpperCase ( ));
    }


}
