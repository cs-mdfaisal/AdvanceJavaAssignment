package com.phoenix.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.phoenix.daos.ProductDao;
import com.phoenix.daos.ProductDaoImpl;
import com.phoenix.data.Product;
import com.phoenix.web.exceptions.ProductNotFoundException;
import com.phoenix.web.exceptions.ServiceException;

public class ProductServiceImpl implements ProductService {
	private ProductDao productDao;
	public ProductServiceImpl() {
		productDao=new ProductDaoImpl();
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<Product> findAll() throws ServiceException {
		// TODO Auto-generated method stub
		
		try {
			return productDao.getAllProducts();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ServiceException(e.getMessage());
		}
	}

	@Override
	public Product findById(int id) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		try {
			return productDao.getProductbyId(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ProductNotFoundException(e.getMessage());
		}
	}

	@Override
	public void add(Product product) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void edit(Product product) throws ServiceException {
		// TODO Auto-generated method stub
		try {
			productDao.update(product);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
		}
	}

	@Override
	public void remove(Product product) throws ServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> sortByPrice() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> sortByName() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> sortByBrand() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findProductBetween(float minPrice, float maxPrice) throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> dbProducts = findAll();
		List<Product> productsBetweenPrice = new ArrayList<Product>();
		for(Product product:dbProducts) {
			if(product.getPrice()>=minPrice && product.getPrice()<=maxPrice)
				productsBetweenPrice.add(product);
		}
		return productsBetweenPrice;
	}

	@Override
	public List<Product> findByBrand(String brand) throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> dbProducts = findAll();
		List<Product> productsByBrand=new ArrayList<Product>();
		for(Product product:dbProducts) {
			if(product.getBrand().equals(brand))
				productsByBrand.add(product);
		}
		return productsByBrand;
	}

	@Override
	public List<Product> findByPrice(float price) throws ServiceException {
		// TODO Auto-generated method stub
		List<Product> dbProducts = findAll();
		List<Product> productsByPrice = new ArrayList<Product>();
		for(Product product:dbProducts) {
			if(product.getPrice()==price)
				productsByPrice.add(product);
		}
		return productsByPrice;
	}

	@Override
	public List<Product> findByName(String name) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
