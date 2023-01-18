package org.example.abstractfactory;

public class XMLDaoFactory extends DaoAbstractFactory {
    @Override
    public Dao createDao(String type) {
        Dao dao = null;
        if ("emp".equals(type)) {
            dao = new XMLEmpDao();
        } else if ("dept".equals(type)) {
            dao = new XMLDeptDao();
        }
        return dao;
    }
}