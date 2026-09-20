package abstractfactory;

public class Barista {
    private final ServingSetFactory factory;

    public Barista(ServingSetFactory factory){
        this.factory = factory;
    }
    public void serve (double amount){
        Cup cup = factory.createCup();
        Lid lid = factory.createLid();
        Receipt receipt = factory.createReceipt();

        System.out.println(cup.describe());
        System.out.println(lid.describe());
        System.out.println(receipt.print(amount));

    }
}
