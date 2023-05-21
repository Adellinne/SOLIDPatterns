public class Main
{
    public static void main(String[] args)
    {

        CoffeeMachine deliveredMachine = new DeliveredCoffeeMachine();

        CoffeeLover user = new CoffeeLover(deliveredMachine);
        user.makeCoffee();
    }
}