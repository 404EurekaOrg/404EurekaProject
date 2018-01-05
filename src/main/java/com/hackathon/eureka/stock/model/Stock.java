package com.hackathon.eureka.stock.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "STOCK")
public class Stock implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long stockId;
	private String stockCode;
	private String stockName;
	
	
	@Id
	@Column(name = "STOCK_ID", unique = true, nullable = false, precision = 5, scale = 0)
	public Long getStockId() {
		return stockId;
	}
	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}
	
	@Column(name = "STOCK_CODE", nullable = false, length = 20)
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	

	@Column(name = "STOCK_NAME", nullable = false, length = 20)
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	
	
}