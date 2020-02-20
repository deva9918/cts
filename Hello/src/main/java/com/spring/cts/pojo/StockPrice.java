package com.spring.cts.pojo;



import java.sql.Time;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

@Table(name = "stockPrice")
public class StockPrice {
	
	

	@Override

	public String toString() {

		return "StockPrice [companyname=" + companyname + ", stockexchange=" + stockexchange + ", currentprice="

				+ currentprice + ", date=" + date + ", time=" + time + "]";

	}
	@Id
	
	private String companyname;
	
	private String stockexchange;

	private Integer currentprice;

	
	private Date date;

	private Time time;
	public Integer getCurrentprice() {
		return currentprice;
	}

	public void setCurrentprice(Integer currentprice) {
		this.currentprice = currentprice;
	}
	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getStockexchange() {

		return stockexchange;

	}

	public void setStockexchange(String stockexchange) {

		this.stockexchange = stockexchange;

	}


	public Date getDate() {

		return date;

	}

	public void setDate(Date date) {

		this.date = date;

	}

	public Time getTime() {

		return time;

	}

	public void setTime(Time time) {

		this.time = time;

	}

}
