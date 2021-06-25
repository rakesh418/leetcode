package design.builder;

public class TestBuilderPattern {
    public static void main(String[] args) {
        HttpClient client = new HttpClient.HttpClientBuilder().method("POST").url("localhost:8080").secure("rakesh","dutta")
                .headers("headers").body("body").build();
        System.out.println(client);
    }
}
