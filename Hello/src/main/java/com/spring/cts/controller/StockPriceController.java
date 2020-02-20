package com.spring.cts.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.spring.cts.dao.IpoDetailsRepository;
import com.spring.cts.dao.StockPriceRepository;
import com.spring.cts.pojo.IpoDetails;
import com.spring.cts.pojo.StockPrice;

@RestController
@RequestMapping
public class StockPriceController {

	@Autowired

	private StockPriceRepository stockpriceRepository;

	@RequestMapping("/getAllStockPrice")

	public Iterable<StockPrice> getAllStockPrice() {

		return stockpriceRepository.findAll();

	}

	@PostMapping("/savestockprice")
	
	public StockPrice saveStockPrice(@RequestBody StockPrice stockprice) {

		System.out.println(stockprice);

		stockpriceRepository.save(stockprice);

		return stockprice;

	}

	@PutMapping("/updateStockPrice/{companyname}")

	public StockPrice updateStockPrice(@RequestBody StockPrice stockprice,
			@PathVariable("companyname") String companyname) {

		stockprice.setCompanyname(companyname);

		System.out.println(stockprice);

		stockpriceRepository.save(stockprice);

		return stockprice;

	}

	@DeleteMapping("/deletestockprice/{companyname}")

	public Boolean deleteStockPrice(@PathVariable("companyname") String companyname) {

		System.out.println(companyname);

		Optional<StockPrice> stockprice = stockpriceRepository.findById(companyname);

		stockpriceRepository.delete(stockprice.get());

		return true;

	}

	@GetMapping("/findOneInAll5/{companyname}")

	public StockPrice findoneinall(@PathVariable("companyname") String companyname)

	{

		Optional<StockPrice> stockprice = stockpriceRepository.findById(companyname);

		return stockprice.get();

	}

}
