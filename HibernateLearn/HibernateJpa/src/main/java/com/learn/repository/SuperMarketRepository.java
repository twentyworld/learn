package com.learn.repository;

import com.learn.entity.SuperMarket;
import org.springframework.data.repository.CrudRepository;

public interface SuperMarketRepository extends CrudRepository<SuperMarket,Integer> {

}
