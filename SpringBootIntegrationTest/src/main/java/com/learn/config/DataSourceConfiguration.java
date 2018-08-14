package com.learn.config;

import com.learn.mapper.UserMapper;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by teemper on 2017/12/6, 23:16.
 *
 * @author Zed.
 * copy as you like, but with these words.
 * from win.
 */
@Configuration
public class DataSourceConfiguration {

    @Bean
    public SqlSessionFactory secondarySqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception{
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("test", transactionFactory, dataSource);
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration(environment);
        configuration.addMapper(UserMapper.class);
        return new SqlSessionFactoryBuilder().build(configuration);
    }

    @Bean
    public DataSourceTransactionManager testTransactionManager(@Qualifier("dataSource")DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public SqlSessionTemplate testSqlSessionTemplate(SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
