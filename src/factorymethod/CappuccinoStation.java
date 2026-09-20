package factorymethod;

public class CappuccinoStation extends DrinkStation{
    protected Drink createDrink(){
        return new Cappuccino();
    }
}
