package abstractfactory;

public class ClassicReceipt implements Receipt{
    public String print(double amount){
        return "==Classic coffee==/nprice: $ " + amount + "\n спасибо за заказ";
    }
}
