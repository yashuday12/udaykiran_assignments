package com.hexaware.springjdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springjdbc.model.Product;

@Repository
public class ProductDaoImp implements IProductDAO {

	JdbcTemplate jdbcTemplate;
	@Autowired
	public ProductDaoImp(DataSource datasource) {
		
		System.out.println("DS "+datasource);

		jdbcTemplate = new JdbcTemplate(datasource);
		
		System.out.println(jdbcTemplate);

	}

	@Override
	public boolean createProduct(Product product) {

		String insert = "insert into Product(pid,pname,price) values(?,?,?)";

		int count = jdbcTemplate.update(insert, product.getPid(), product.getProductName(), product.getPrice());

		return count > 0;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		String update="update product set pname=?,price=? where pid=?";
		int count=jdbcTemplate.update(update,product.getProductName(),product.getPrice(),product.getPid());
		return false;
	}

	@Override
	public boolean deleteProduct(int pid) {
		// TODO Auto-generated method stub
		String delete="delete from product where pid=?";
		int count=jdbcTemplate.update(delete, pid);
				
		return count>0;
	}

	@Override
	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
		String select="select * from product where pid=?";
	  Product pro= jdbcTemplate.queryForObject(select,new ProductMapper(),pid);
	  return pro;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		String selectall="select * from product";
		List<Product> pro=jdbcTemplate.query(selectall, new ProductMapper());
		return pro;
	}

}
