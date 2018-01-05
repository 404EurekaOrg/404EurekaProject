package com.hackathon.eureka.stock.dao;

import com.hackathon.eureka.stock.model.Stock;


public interface StockDao {

	void save(Stock stock);
	void update(Stock stock);
	void delete(Stock stock);
	Stock findByStockCode(String stockCode);

}