package com.spring.cts.dao;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.spring.cts.pojo.StockPrice;




public interface StockPriceRepository extends CrudRepository<StockPrice,String>{
Iterable<StockPrice> findAll();
	List<StockPrice> findByCompanyname(String companyname);

}
