package design.proxy;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test {
    public static void main(String[] args) {
//        Customer customer = new CustomerImpl();
        Customer customer = new CustomerImplProxy();
        System.out.println(customer.getId());
        System.out.println(customer.getOrders());
    }
}
