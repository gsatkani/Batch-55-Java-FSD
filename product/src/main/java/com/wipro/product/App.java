package com.wipro.product;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		Product[] productList = null; // store 100 Product Object
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number of Products");
		int size = scanner.nextInt();
		productList = new Product[size];
		for (int i = 0; i < productList.length; i++) {
			Product product = new Product();
			System.out.println("Product Detail " + (i + 1));
			System.out.println("Enter Id");
			product.setId(scanner.nextInt());
			System.out.println("Enter Name");
			product.setName(scanner.next());
			System.out.println("Enter price");
			product.setPrice(scanner.nextDouble());
			System.out.println("Enter the Quantity");
			product.setQuantity(scanner.nextInt());

			productList[i] = product; // add product object into array
			System.out.println("Product Added");
		}
		System.out.println("List All Product Details before Discount");
		System.out.format("%-10s%-30s%-10s%-10s%n", "Id", "Name", "Price", "Quantity");
		for (Product product : productList) {
			System.out.format("%-10d%-30s%-10.2f%-10d%n",product.getId(),product.getName(),product.getPrice(), product.getQuantity());
		}
		
		System.out.println("List All Product Details After Discount");
		
		ProductStore productStore=new ProductStore();
		Product[] list=productStore.getDiscountedPrice(productList);
		
		System.out.format("%-10s%-30s%-10s%-10s%n", "Id", "Name", "Price", "Quantity");
		for (Product product :list) {
			System.out.format("%-10d%-30s%-10.2f%-10d%n",product.getId(),product.getName(),product.getPrice(), product.getQuantity());
		}
		
		
		
		
		
		
		
		
	}
}
