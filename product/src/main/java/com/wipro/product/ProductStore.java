package com.wipro.product;

public class ProductStore {

	// Calculate the discouted Price

	public Product[] getDiscountedPrice(Product[] list) {

		// list = {product1,product2}
		// index 0 product1 = 1,mobile,23000,12
		// index 1 product2 = 2,laptop,30000,10
		for (int i = 0; i < list.length; i++) {
			if (list[i].getName().equals("laptop")) {
				list[i].setPrice(list[i].getPrice() - 10000);
				// list[1].setPrice(list[1].getPrice -10000)
			}
		}
		return list;
	}

}
