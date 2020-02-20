package com.spring.cts.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

@Table(name = "stockExchange")
public class StockExchange {

	@Id
	
	private int seid;

	public int getSeid() {
		return seid;
	}

	public void setSeid(int seid) {
		this.seid = seid;
	}

	private String stock_exchange;

	private String brief;

	private String remarks;

		private String contact_address;

	

	public String getStock_exchange() {

		return stock_exchange;

	}

	public void setStock_exchange(String stock_exchange) {

		this.stock_exchange = stock_exchange;

	}

	public String getBrief() {

		return brief;

	}

	public void setBrief(String brief) {

		this.brief = brief;

	}

	

	public String getContact_address() {

		return contact_address;

	}

	public void setContact_address(String contact_address) {

		this.contact_address = contact_address;

	}
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}



}
