package pl.javastart.task;

public class BruttoCalculator {
    public double calculateBrutto(Product product) {
        double multiplier = switch (product.getCategory()) {
            case "books" -> 1.08;
            case "food" -> 1.05;
            default -> 1.23;
        };
        return multiplier * product.getPrice();
    }
}
