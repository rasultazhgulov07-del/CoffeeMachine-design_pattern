package factorymethod;

public class LatteStation extends DrinkStation{
    protected Drink createDrink(){
        return new Latte();
    }
}
