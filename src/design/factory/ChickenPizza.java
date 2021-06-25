package design.factory;

public class ChickenPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing chicken pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking chicken pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting chicken pizza");
    }
}
