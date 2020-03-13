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

	@Id
	private String stockexchange;

	@Override
	public String toString() {
		return "StockPrice [stockexchange=" + stockexchange + ", companyname=" + companyname + ", currentprice="
				+ currentprice + ", date=" + date + ", time=" + time + ", uploadfile=" + uploadfile + "]";
	}

	private String companyname;

	private int currentprice;
	public int getCurrentprice() {
		return currentprice;
	}

	public void setCurrentprice(int currentprice) {
		this.currentprice = currentprice;
	}

	private String date;
	private String time;
	private String uploadfile;

	public String getUploadfile() {
		return uploadfile;
	}

	public void setUploadfile(String uploadfile) {
		this.uploadfile = uploadfile;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
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

}
