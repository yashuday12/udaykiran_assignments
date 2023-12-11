package com.hexaware.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springjdbc.config.AppConfig;
import com.hexaware.springjdbc.model.Product;
import com.hexaware.springjdbc.service.IProductService;
import com.hexaware.springjdbc.service.ProductServiceImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	IProductService service =		context.getBean(ProductServiceImp.class);
    	
    	
    		Product product = new Product(101, "Mobile", 990000);
    	
    		boolean isUpdated =	service.updateProduct(product);
    		
    		System.out.println("Is record created "+isUpdated);
    	  /*  Product product=service.getProductById(101);
    	    System.out.println(product);*/
    	  /*List <Product> list=  service.getAllProducts();
    	  for(Product product:list) {
    		  System.out.println(product);
    	  }*/
    	
    		context.close();
    	
    }
}
