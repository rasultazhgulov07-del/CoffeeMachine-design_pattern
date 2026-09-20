package factorymethod;

public class Espresso implements Drink {
    public String getName() { return "Espresso"; }
    public int getVolumeMl() { return 30; }
    public double brew() {
        System.out.println("Готовим эспрессо: 9 бар, 25 сек экстракции.");
        return 1.50;
    }
}
