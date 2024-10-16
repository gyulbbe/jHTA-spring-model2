package kr.co.jhta.vo;

import java.util.Date;

public class Product {

	private int no;
	private String name;
	private Company maker;
	private int price;
	private double discountRate;
	private int stock;
	private boolean soldOut;
	private Date createdDate;
	
	public Product() {}

	public Product(int no, String name, Company maker, int price, boolean soldOut) {
		this.no = no;
		this.name = name;
		this.maker = maker;
		this.price = price;
		this.discountRate = 0.15;
		this.stock = 10;
		this.soldOut = soldOut;
		this.createdDate = new Date();
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company getMaker() {
		return maker;
	}

	public void setMaker(Company maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public int getDiscountPrice() {
		return (int) (price*(1 - discountRate));
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public boolean isSoldOut() {
		return soldOut;
	}

	public void setSoldOut(boolean soldOut) {
		this.soldOut = soldOut;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
