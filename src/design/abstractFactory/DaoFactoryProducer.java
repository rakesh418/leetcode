package design.abstractFactory;

public class DaoFactoryProducer {
    public static DaoAbstractFactory produce(String factoryType){
        DaoAbstractFactory daf = null;
        if(factoryType.equals("XML"))
            return new XMLDaoFactory();
        else if(factoryType.equals("DB"))
            return new DBDaoFactory();
        return daf;
    }
}
