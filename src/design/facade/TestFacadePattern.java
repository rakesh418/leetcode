package design.facade;

/*
Facade just reduces the complexity of a system by introducing a layer between client and multiple classes /network call
 */
public class TestFacadePattern {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.processOrder("MacBook", 3);
    }
}
