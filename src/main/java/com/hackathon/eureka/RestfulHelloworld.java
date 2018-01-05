package com.hackathon.eureka;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hackathon.eureka.stock.bo.StockBo;
import com.hackathon.eureka.stock.model.Stock;

@Path("/")
public class RestfulHelloworld 
{
	@GET
	@Produces("text/html")
	@Path("/abcd")
	public Response getStartingPage()
	{
		String output = "<h1>Hello World Rituraj!<h1>" +
				"<p>RESTful Service is running ... <br>Ping @ " + new Date().toString() + "</p<br>";
		/*ApplicationContext appContext =
		    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");

		    	StockBo stockBo = (StockBo)appContext.getBean("stockBo");

		    	*//** insert **//*
		    	Stock stock = new Stock();
		    	stock.setStockCode("12");
		    	stock.setStockName("RD");
		    	stock.setStockId(12l);
		    	stockBo.save(stock);
		    	System.out.println("Done");*/
		return Response.status(200).entity(output).build();
	}
}