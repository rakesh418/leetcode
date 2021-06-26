package design.decorator;

/*
is a behavioral design pattern . it wraps an object with additional behavior in runtime without affecting other object of the same type. new BufferedReader(new FileReader())
new BufferedReader(new FileReader())
--> fileReader can read one line
--> decorated with BufferedReader -- it can read multiple lines
*/
public class TestDecoratorPattern {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza.bake();
        System.out.println("********");

        Pizza cheesePizza = new CheesePizzaDecorator(new PlainPizza());
        cheesePizza.bake();
        Pizza veggiePizza = new VeggiePizzaDecorator(new PlainPizza());
        veggiePizza.bake();
    }
}
