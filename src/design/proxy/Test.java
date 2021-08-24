package design.proxy;
/*
structural design pattern
Proxy is an  object  which comes in place of actual objects
 */
public class Test {
    public static void main(String[] args) {
//        Customer customer = new CustomerImpl();
        Customer customer = new CustomerImplProxy();
        System.out.println(customer.getId());
        System.out.println(customer.getOrders());
    }
}
