package design.abstractFactory;

public class XMLEmpDao implements Dao{
    @Override
    public void save() {
        System.out.println("Saving employee to XML");
    }
}
