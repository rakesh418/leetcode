package design.facade;

public class OrderProcessor {
    public boolean checkStock(String name){
        System.out.println("checking stock");
        return true;
    }

    public String placeOrder(String name, int quantity){
        System.out.println("order placed");
        return "abc123";
    }

    public void shipOrder(String orderId){
        System.out.println("Order shipped");
    }
}
