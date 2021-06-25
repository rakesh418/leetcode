package design.prototype;

/*
Proptotype is a creational design pattern that uses an exiting object to create new object.
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Game game1 = new Game();
        game1.setId(1);
        game1.setName("Overwatch");
        game1.setMembership(new Membership());

        Game game2 = game1.clone(); // one way of cloning
        Game game3 = new Game(game1); // second way of cloning
        System.out.println(game1);
        System.out.println(game2);
        System.out.println(game3);
    }
}
