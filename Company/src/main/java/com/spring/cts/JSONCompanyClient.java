package com.spring.cts;



import java.util.List;



import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;



import com.spring.cts.pojo.StockPrice;







@FeignClient(value = "jcompany", url = "http://localhost:8056/stockprice/")

public interface JSONCompanyClient {



 @GetMapping("/findByCompanyname/{companyname}")

 public List<StockPrice> findByCompanyname(@PathVariable("companyname") String companyname);
}