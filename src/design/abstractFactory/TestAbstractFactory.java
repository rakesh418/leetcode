package design.abstractFactory;

public class TestAbstractFactory {

    public static void main(String[] args) {
        DaoAbstractFactory daf = DaoFactoryProducer.produce("XML");

        daf.createDao("emp").save();
    }
}
