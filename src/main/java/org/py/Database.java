package org.py;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Config;
import tk.mybatis.mapper.mapperhelper.MapperHelper;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Configuration
@MapperScan(basePackages = {"org.py.mapper"}, mapperHelperRef = "mapperHelper")
public class Database {
    @Bean
    public DataSource dataSource() {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost/jcms2018?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Chongqing&useSSL=true");
        ds.setUsername("py");
        ds.setPassword("123");
        return ds;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource ds) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);
        return jdbcTemplate;
    }
    @Bean
    public MapperHelper mapperHelper() {
        MapperHelper mapperHelper = new MapperHelper();
        Config config = new Config();
        List<Class> mappers = new ArrayList<>();
        mappers.add(Mapper.class);
        config.setMappers(mappers);
        mapperHelper.setConfig(config);
        return mapperHelper;
    }
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource ds) {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(ds);
        return sessionFactoryBean;
    }
    @Bean
    public DataSourceTransactionManager transactionManager (DataSource ds) {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(ds);
        return transactionManager;
    }
}
