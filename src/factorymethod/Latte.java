package factorymethod;

public class Latte implements Drink {
    public String getName() { return "Latte"; }
    public int getVolumeMl() { return 240; }
    public double brew() {
        System.out.println("Готовим латте: эспрессо + вспененное молоко 1:3.");
        return 3.20;
    }
}