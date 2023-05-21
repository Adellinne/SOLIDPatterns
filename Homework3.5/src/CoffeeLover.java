public class CoffeeLover
{
    private CoffeeMachine coffeeMachine;

    public CoffeeLover(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void makeCoffee() {
        coffeeMachine.start();
    }

    public static void main(String[] args) {
        CoffeeMachine simpleMachine = new SimpleCoffeeMachine();
        CoffeeMachine complexMachine = new ComplexCoffeeMachine();

        CoffeeLover user1 = new CoffeeLover(simpleMachine);
        CoffeeLover user2 = new CoffeeLover(complexMachine);

        user1.makeCoffee();
        user2.makeCoffee();
    }
}