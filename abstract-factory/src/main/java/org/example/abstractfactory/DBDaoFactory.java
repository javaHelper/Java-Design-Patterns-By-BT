package org.example.abstractfactory;

public class DBDaoFactory extends DaoAbstractFactory {
    @Override
    public Dao createDao(String type) {
        Dao dao = null;
        if ("emp".equals(type)) {
            dao = new DBEmpDao();
        } else if ("dept".equals(type)) {
            dao = new DBDeptDao();
        }
        return dao;
    }
}