package pl.sda.zamowienia;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Category category = new Category ("a", "b", "c");

        Product produkt1 = new Product ("WODA", 20, "A");
        Product product2 = new Product ("BUŁKA", 5, "B");
        Product produkt3 = new Product ("baton", 10, "C");

        Customer customer1 = new Customer ("MONIKA", "Gosiewska", 22, "g@wp.pl");
        Customer customer2 = new Customer ("Kasia", "Zielinska", 17, "k@wp.pl");
        Customer customer3 = new Customer ("PAWEL", "DZIK", 44, "adres");




    }
}
