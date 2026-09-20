package factorymethod;

public class Cappuccino implements Drink{
    public String getName(){return "Cappuccino";}
    public int getVolumeMl(){return 180;}
    public double brew(){
        System.out.println("Готовим капучино: экспрессо + молоко 1:1:1");
        return 2.80;
    }
}
