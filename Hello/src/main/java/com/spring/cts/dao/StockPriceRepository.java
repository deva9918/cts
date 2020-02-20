package com.spring.cts.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.cts.pojo.StockPrice;




public interface StockPriceRepository extends CrudRepository<StockPrice,String>{

}
