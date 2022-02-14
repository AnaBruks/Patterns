package Creating_patterns.abstract_fabric;

public class AmericanCoffeeShop extends CoffeeShop {
    @Override
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case AMERICANO:
                coffee = new AmericanStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new AmericanStyleEspresso();
                break;
        }
        return coffee;
    }
}
