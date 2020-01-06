package cn.itcast.factory;

import cn.itcast.dao.Userdao;
import cn.itcast.dao.impl.UserdaoImpl;

public class DynamicFactory {

    public Userdao getDao() {
        return new UserdaoImpl();
    }
}
