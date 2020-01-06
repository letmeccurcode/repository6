package cn.itcast.factory;

import cn.itcast.dao.Userdao;
import cn.itcast.dao.impl.UserdaoImpl;

public class StaticFactory {

    public static Userdao getDao() {
        return new UserdaoImpl();
    }
}
