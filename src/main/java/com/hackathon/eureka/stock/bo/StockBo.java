package com.hackathon.eureka.stock.bo;

import com.hackathon.eureka.stock.model.Stock;


public interface StockBo {

	void save(Stock stock);
	void update(Stock stock);
	void delete(Stock stock);
	Stock findByStockCode(String stockCode);
}