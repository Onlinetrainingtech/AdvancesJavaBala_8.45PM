package com.example.BSpringBootWebService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService
{

	@Override
	public List<Product> findAll() {
		
		ArrayList<Product>products=new ArrayList<>();
		products.add(new Product(1001,"mobile1","mobilee1",1000.00,6));
		products.add(new Product(1002,"mobile2","mobilee2",2000.00,7));
		products.add(new Product(1003,"mobile3","mobilee3",4000.00,6));
		
		return products;
	}
    
}
