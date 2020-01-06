package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
//<bean id="userService" class="cn.itcast.service.impl.UserServiceImpl">
//<property name="dao" ref="userDao"></property>
//</bean>

//@Component("userService")
@Service("userService")
//@Scope("prototype")
//@Scope("singleton")
public class UserServiceImpl implements UserService {

//    @Autowired
//    @Qualifier("userDao")

    @Resource(name = "userDao")
    private UserDao dao;

    @Value("${jdbc.driver}")
    private String driver;

/*    public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }*/

    public void save() {

//        System.out.println(driver);
        dao.save();
    }

    @PostConstruct
    public void init(){
        System.out.println("init...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy...");
    }
}
