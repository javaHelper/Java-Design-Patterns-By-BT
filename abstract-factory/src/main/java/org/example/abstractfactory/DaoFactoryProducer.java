package org.example.abstractfactory;

public class DaoFactoryProducer {

    public static DaoAbstractFactory produce(String factoryType) {
        DaoAbstractFactory daf = null;

        if ("xml".equals(factoryType)) {
            daf = new XMLDaoFactory();
        } else if ("db".equals(factoryType)) {
            daf = new DBDaoFactory();
        }
        return daf;
    }
}