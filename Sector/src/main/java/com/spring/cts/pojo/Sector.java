package com.spring.cts.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "sectors")

public class Sector {

	@Id
	
	private Integer sectorid;
	private String sectorname;

	private String brief;

	public Integer getSectorid() {
		return sectorid;
	}

	public void setSectorid(Integer sectorid) {
		this.sectorid = sectorid;
	}


	public String getSectorname() {

		return sectorname;

	}

	public void setSectorname(String sectorname) {

		this.sectorname = sectorname;

	}

	public String getBrief() {

		return brief;

	}

	public void setBrief(String brief) {

		this.brief = brief;

	}

}