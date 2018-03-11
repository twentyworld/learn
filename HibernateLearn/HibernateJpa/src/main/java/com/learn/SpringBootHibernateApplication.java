package com.learn;

import com.learn.entity.Mark;
import com.learn.entity.Product;
import com.learn.entity.SuperMarket;
import com.learn.repository.SuperMarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringBootHibernateApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootHibernateApplication.class,args);
    }

    @Autowired
    SuperMarketRepository repository;
    @Override
    public void run(String... args) throws Exception {
        System.out.println();
        SuperMarket superMarket = new SuperMarket();


        superMarket.setId(1);
        superMarket.setName("name");
        superMarket.setProducts(Arrays.asList(new Product(1,"product"),new Product(2,"products")));
        superMarket.setMark(new Mark(3,"mark"));

        repository.save(superMarket);

        Iterable<SuperMarket> superMarkets = repository.findAll();

        superMarkets.forEach(
                superMarket1 -> System.out.println(superMarket1)
        );



    }
}
