package com.hackathon.eureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hackathon.eureka.stock.bo.StockBo;
import com.hackathon.eureka.stock.model.Stock;

public class HibernateTestApp {
	  public static void main( String[] args )
	    {
	    	ApplicationContext appContext =
	    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");

	    	StockBo stockBo = (StockBo)appContext.getBean("stockBo");

	    	/** insert **/
	    	Stock stock = new Stock();
	    	stock.setStockCode("11");
	    	stock.setStockName("RR");
	    	stock.setStockId(11l);
	    	stockBo.save(stock);

	    	/** select **/
	    	Stock stock2 = stockBo.findByStockCode("11");
	    	System.out.println(stock2);

	    	/** update **/
	    	stock2.setStockName("RR2");
	    	stockBo.update(stock2);

	    	/** delete **/
	    	//stockBo.delete(stock2);

	    	System.out.println("Done");
	    }
}
