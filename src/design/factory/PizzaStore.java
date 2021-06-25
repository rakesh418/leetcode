package design.factory;
/*
it hides the object creation process and it will take care of everything and will deliver object whoever request for it
ex: database Driver
DriverManager.getConnection(String connectionString)
 */
public class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza p =null;

        p = PizzaFactory.createPizza(type);
        p.prepare();
        p.bake();
        p.cut();
        return p;
    }
}
