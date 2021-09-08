public class Item {
    private double price;
    private double weight;

    public Item (double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public double pricePerWeight () {
        return price / weight;
    }
}
