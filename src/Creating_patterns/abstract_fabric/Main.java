package Creating_patterns.abstract_fabric;

public class Main {
    public static void main(String[] args) {
        CoffeeShop italianCoffeeShop = new ItalianCoffeeShop();
        italianCoffeeShop.orderCoffee(CoffeeType.AMERICANO);

        CoffeeShop americanCoffeeShop = new AmericanCoffeeShop();
        americanCoffeeShop.orderCoffee(CoffeeType.ESPRESSO);

    }
}
