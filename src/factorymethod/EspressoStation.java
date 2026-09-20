package factorymethod;

public class EspressoStation extends DrinkStation{
    protected Drink createDrink(){
        return new Espresso();
    }
}

