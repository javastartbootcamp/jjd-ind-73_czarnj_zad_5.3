package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Book", "Very nice book", 15, "books");
        Product product2 = new Product("Plate", "plate", 20, "dishes");

        BruttoCalculator bc = new BruttoCalculator();
        System.out.println(bc.calculateBrutto(product1));
        System.out.println(bc.calculateBrutto(product2));
    }
}
