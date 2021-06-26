package design.factory;

/*
A factory pattern is a creational pattern that abstracts or hides the object creation process.
 */
public class TestFactoryPattern {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("chicken");
    }
}
