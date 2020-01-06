package cn.itcast.service.impl;

import cn.itcast.dao.Userdao;
import cn.itcast.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {

    private Userdao dao;

/*    public Userdao getDao() {
        return dao;
    }

    public void setDao(Userdao dao) {
        this.dao = dao;
    }*/

    public UserServiceImpl() {
    }

    public UserServiceImpl(Userdao dao) {
        this.dao = dao;
    }

    @Override
    public void save() {
        System.out.println("service的save执行了");
        dao.save();
    }
}
