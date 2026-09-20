package factorymethod;

public abstract class DrinkStation {
    protected abstract Drink createDrink();

    public double serveOrder() {
        Drink drink = createDrink();
        double price = drink.brew();
        System.out.printf("клиенту выдан %s (%d ml) за $%.2f%n", drink.getName(), drink.getVolumeMl(), price);
        return price;
    }
    }
