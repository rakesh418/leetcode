package design.abstractFactory;

/*
Factory of factories
it hides the factory creation process
 */
public class TestAbstractFactory {

    public static void main(String[] args) {
        DaoAbstractFactory daf = DaoFactoryProducer.produce("XML");

        daf.createDao("emp").save();
    }
}
