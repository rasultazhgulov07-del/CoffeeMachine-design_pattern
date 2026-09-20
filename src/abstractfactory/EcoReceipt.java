package abstractfactory;

public class EcoReceipt implements Receipt{
    public String print(double amount){
        return "Eco coffee -- \n Amount price: $" +  amount + "это экочек";
    }
}
