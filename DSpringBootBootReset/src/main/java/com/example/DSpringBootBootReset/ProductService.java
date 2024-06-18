package com.example.DSpringBootBootReset;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService
{
   public List<Product>findAll()
   {
	   ArrayList<Product>products=new ArrayList<>();
	   products.add(new Product(1001,"mobile1","mobile2",1000.00,6));
	   products.add(new Product(1002,"mobile2","mobile3",2000.00,10));
	   products.add(new Product(1003,"mobile3","mobile4",3000.00,6));
	   return products;
   }
}
