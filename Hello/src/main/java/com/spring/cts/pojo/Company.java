package com.spring.cts.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {
	@Id
	private String companyname;
	private String ceo;
	private String boardofdirectors;
	private String sector;
	private String briefwriteup;
	private Integer turnover;
	private Integer listedinstock;
	private String stockcode;
	
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardofdirectors() {
		return boardofdirectors;
	}
	public void setBoardofdirectors(String boardofdirectors) {
		this.boardofdirectors = boardofdirectors;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getBriefwriteup() {
		return briefwriteup;
	}
	public void setBriefwriteup(String briefwriteup) {
		this.briefwriteup = briefwriteup;
	}
	public Integer getTurnover() {
		return turnover;
	}
	public void setTurnover(Integer turnover) {
		this.turnover = turnover;
	}
	public Integer getListedinstock() {
		return listedinstock;
	}
	public void setListedinstock(Integer listedinstock) {
		this.listedinstock = listedinstock;
	}
	public String getStockcode() {
		return stockcode;
	}
	public void setStockcode(String stockcode) {
		this.stockcode = stockcode;
	}
	
}
