package cn.itcast.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@PropertySource("classpath:db.properties")
public class DataSourceConfig {

    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;


    @Bean("datasource")
    public DataSource getds() {
        ComboPooledDataSource s = null;
        try {
            s = new ComboPooledDataSource();
            s.setDriverClass(driver);
            s.setJdbcUrl(url);
            s.setUser(username);
            s.setPassword(password);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        return s;
    }
}
