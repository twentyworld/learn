package com.learn;

import com.learn.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import javax.sql.DataSource;


/**
 * Created by teemper on 2017/12/6, 19:57.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
@SpringBootApplication
public class MybatisApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class,args);
    }

    @Autowired
    @Qualifier("primaryDataSource")
    DataSource primaryDataSource;
    @Autowired
    @Qualifier("secondaryDataSource")
    DataSource secondaryDataSource;

    @Autowired
    @Qualifier("primarySqlSessionFactory")
    SqlSessionFactory primarySqlSessionFactory;
    @Autowired
    @Qualifier("secondarySqlSessionFactory")
    SqlSessionFactory secondarySqlSessionFactory;
    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {

        ResourceDatabasePopulator primaryDataSourcePopulator = new ResourceDatabasePopulator();
        primaryDataSourcePopulator.addScript(new ClassPathResource("db/schema.sql"));
        primaryDataSourcePopulator.execute(primaryDataSource);

        SqlSession primarySqlSession = primarySqlSessionFactory.openSession();
        UserMapper primaryUserMapper = primarySqlSession.getMapper(UserMapper.class);

        primaryUserMapper.insertUser(1,"name");
        primaryUserMapper.insertUser(2,"name");
        primaryUserMapper.insertUser(3,"name");
        System.out.println(primaryUserMapper.findByName("name"));


        ResourceDatabasePopulator secondaryDataSourcePopulator = new ResourceDatabasePopulator();
        secondaryDataSourcePopulator.addScript(new ClassPathResource("db/schema.sql"));
        secondaryDataSourcePopulator.execute(secondaryDataSource);

        SqlSession secondarySqlSession = secondarySqlSessionFactory.openSession();
        UserMapper secondaryUserMapper = secondarySqlSession.getMapper(UserMapper.class);

        secondaryUserMapper.insertUser(1,"name");
        System.out.println(secondaryUserMapper.findByName("name"));

    }


}
