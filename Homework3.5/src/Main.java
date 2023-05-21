public class Main
{
    public static void main(String[] args)
    {
        CoffeeMachine simpleMachine = new SimpleCoffeeMachine();
        CoffeeMachine complexMachine = new ComplexCoffeeMachine();

        CoffeeLover user1 = new CoffeeLover(simpleMachine);
        CoffeeLover user2 = new CoffeeLover(complexMachine);

        user1.makeCoffee();
        user2.makeCoffee();
    }
}
