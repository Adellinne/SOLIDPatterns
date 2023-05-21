public class CoffeeLover {
    private CoffeeMachine coffeeMachine;

    public CoffeeLover() {
        this.coffeeMachine = null;
    }

    public void setSimpleCoffeeMachine() {
        this.coffeeMachine = new SimpleCoffeeMachine();
    }

    public void setComplexCoffeeMachine() {
        this.coffeeMachine = new ComplexCoffeeMachine();
    }

    public void setDeliveredCoffeeMachine(CoffeeMachine deliveredMachine)
    {
        this.coffeeMachine = deliveredMachine;
    }

    public void makeCoffee() {
        if (coffeeMachine == null) {
            System.out.println("Nici-un aparat de cafea nu e dispobibila.");
        } else {
            coffeeMachine.start();
        }
    }
}