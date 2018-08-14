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
import java.util.List;
import java.util.Map;


/**
 * Created by teemper on 2017/12/6, 19:57.
 *
 * @auther Zed.
 * copy as you like, but with these words.
 * from win.
 */
@SpringBootApplication
public class SpringBootMybatisApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisApplication.class,args);
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


    @Autowired
    UserMapper mapper;
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

        ResourceDatabasePopulator secondaryDataSourcePopulator = new ResourceDatabasePopulator();
        secondaryDataSourcePopulator.addScript(new ClassPathResource("db/schema.sql"));
        secondaryDataSourcePopulator.execute(secondaryDataSource);

        primaryDataSourceExecute();
        secondaryDataSourceExecute();

        System.out.println("----------------------");
        System.out.println(mapper.findById(1));
    }


    public void primaryDataSourceExecute(){
        SqlSession primarySqlSession = primarySqlSessionFactory.openSession(true);
        UserMapper primaryUserMapper = primarySqlSession.getMapper(UserMapper.class);

        primaryUserMapper.insertUser(1,"name");
        primaryUserMapper.insertUser(2,"name");
        primaryUserMapper.insertUser(3,"name");

        System.out.println("*********************************************************************************");
        System.out.println("primaryDataSourceExecute..get User by mapper:");
        System.out.println(primaryUserMapper.findByName("name"));
        System.out.println(primaryUserMapper.findNameByName("name"));
        List<Map<String,String>> lists = primaryUserMapper.findNameByName("name");
        for (Map<String,String> map:lists) {
            System.out.println(map.get("NAMES"));
        }
//        System.out.println("*********************************************************************************");
//        System.out.println("get User by SqlSession:");
//        String sql = "SELECT * FROM USER WHERE ID = 1;";
//        Map<String, Integer> map = new HashMap<>();
//        map.put("name",1);
//        List<User> userList = primarySqlSession.selectList(sql,map);
//        System.out.println(userList);

    }

    public void secondaryDataSourceExecute(){
        SqlSession secondarySqlSession = secondarySqlSessionFactory.openSession(true);
        UserMapper secondaryUserMapper = secondarySqlSession.getMapper(UserMapper.class);

        System.out.println("*********************************************************************************");
        System.out.println("secondaryDataSourceExecute..get User by mapper:");
        secondaryUserMapper.insertUser(1,"name");
        System.out.println(secondaryUserMapper.findByName("name"));

    }
}
