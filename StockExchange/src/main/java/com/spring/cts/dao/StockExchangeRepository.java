package com.spring.cts.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.cts.pojo.StockExchange;






public interface StockExchangeRepository  extends CrudRepository<StockExchange,Integer> {
	

}
