import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Item item1 = new Item(20, 4);
        Item item2 = new Item(18, 3);
        Item item3 = new Item(14, 2);
        Item[] items = {item1, item2, item3};
        Arrays.sort(items, Comparator.comparingDouble(Item::pricePerWeight).reversed());
        double knapsack = 7;
        double currentWeight = 0;
        double knapsackPrice = 0;
        int i = 0;
        while (currentWeight < knapsack && i < items.length) {
            if (items[i].getWeight() + currentWeight < knapsack) {
                currentWeight += items[i].getWeight();
                knapsackPrice += items[i].getPrice();
                System.out.println(items[i].getWeight() + ":" + items[i].getPrice());
                i++;
            } else {
                double itemiWeightInKnapsack = knapsack - currentWeight;
                double itemIPriceInKnapsack = itemiWeightInKnapsack * items[i].pricePerWeight();
                knapsackPrice += itemIPriceInKnapsack;
                System.out.println(itemiWeightInKnapsack + ":" + itemIPriceInKnapsack);
                currentWeight += itemiWeightInKnapsack;
            }
        }
        System.out.println(knapsackPrice);
    }
}
