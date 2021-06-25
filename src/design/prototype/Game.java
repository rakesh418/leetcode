package design.prototype;

public class Game implements Cloneable{
    private int id;
    private String name;
    private Membership membership;

    public Game(){

    }

    public Game(Game game) {
        this.id = game.getId();
        this.name = game.getName();
        this.membership = new Membership();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    @Override
    protected Game clone() throws CloneNotSupportedException {
//        throw new CloneNotSupportedException();
        Game game = (Game) super.clone();
        game.setMembership(new Membership());
        return game;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", membership=" + membership +
                '}';
    }
}
