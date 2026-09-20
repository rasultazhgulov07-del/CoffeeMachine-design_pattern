package factorymethod;
import java.util.List;
public class

FactoryMethodDemo {
    public static void main(String[] args) {
        List<DrinkStation> stations = List.of(
                new EspressoStation(),
                new LatteStation(),
                new CappuccinoStation()
        );
        double total = 0;
        for (DrinkStation station : stations) {
            total+=station.serveOrder();
        }
        System.out.println("Total price: "+total);
    }
}
