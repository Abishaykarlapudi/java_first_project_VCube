package com.languagefundamentals.constructers;

public class Product {
	
	int productId;
	String productName;
	double price;
	int quantity;
	
	Product(int productId,String productName,double price ,int quantity){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
	}
	
	Product(Product p,int quantity){
		this.productId=p.productId;
		this.productName=p.productName;
		this.price=p.price;
		this.quantity=quantity;
	}
	
	void calculateTotal() {
		System.out.println("The total price of the "+productName+" is: "+(price*quantity));
	}
	
	public static void main(String[] args) {
		
		Product p1 =new Product(100,"laptop",70000,2);
		p1.calculateTotal();
		Product p2 =new Product(p1,5);
		p2.calculateTotal();

	}
}
