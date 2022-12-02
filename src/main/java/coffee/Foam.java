package coffee;

import java.util.function.Consumer;

public class Foam extends CoffeeDecorator {

    private final double cost = .75;
    private Consumer<String> addThing;
    public Foam(Coffee specialCoffee) {
        super(specialCoffee);
    }

    public double makeCoffee() {
        return specialCoffee.makeCoffee() + addFoam();
    }

    private double addFoam() {
        addThing.accept(" + Foam: $.75");
        System.out.println(" + Foam: $.75");

        return cost;
    }

    public void setAddThing(java.util.function.Consumer<String> addThing) {
        this.addThing = addThing;
    }
}