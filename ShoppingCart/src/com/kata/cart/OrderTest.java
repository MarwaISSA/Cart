package com.kata.cart;

import java.util.Collection;
import java.util.Iterator;

import com.kata.cart.bean.Product;
import com.kata.cart.order.Order;

public class OrderTest {

	public static void main (String[] s) throws Exception {
		
		Order o = new Order("Marwa ISSA");		
		o.addProduct(new Product("p101","Rice",12,120));
		o.addProduct(new Product("p102","Olive Oil",4,140));
		
		System.out.println("\nNo. of Product : "+o.productCount());
		System.out.println ("Order Places By: "+o.uid);
		
    // code to remove product from Cart
    // o.removeProduct("p103");
    // Get Product By its Id  
    // Product p = o.getProductFromCart("p102");	
    
    System.out.println ("Cart Total : "+o.getCartPrice());   
		final Iterator<Product> it = o.getCartDetails().iterator();
		while(it.hasNext()){		
			System.out.println (it.next());
		}
	}

}