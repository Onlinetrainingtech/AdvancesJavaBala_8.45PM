package com.example.SpringBootJ3WebServices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService
{
    public List<Product>findAll()
    {
    	ArrayList<Product>products=new ArrayList<>();
    	products.add(new Product(1001,"mobile1","mobilee1",1000.00,6));
    	products.add(new Product(1002,"mobile1","mobilee1",3000.00,8));
    	products.add(new Product(1003,"mobile1","mobilee1",2000.00,6));
    	return products;
    }
}
