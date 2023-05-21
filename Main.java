public class Main
{
    public static void main(String[] args)
    {
        CoffeeLover user = new CoffeeLover();

        // Set the coffee machine using public methods
        user.setSimpleCoffeeMachine();
        user.makeCoffee();

        user.setComplexCoffeeMachine();
        user.makeCoffee();

        CoffeeMachine deliveredMachine = new DeliveredCoffeeMachine();
        user.setDeliveredCoffeeMachine(deliveredMachine);
        user.makeCoffee();
    }
}