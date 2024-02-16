package edu.kh.poly.ex1.model.vo;

public class Spark extends Car{

	private double discountOffer; // 할인혜택
	
	public Spark() {}
	
	public Spark(String engine, String fuel, int wheel, double discoutOffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discoutOffer;
	}

	@Override
	public String toString() {
		return super.toString() + " / " + discountOffer;
	}

	
	public double getDiscountOffer() {
		return discountOffer;
	}
	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
}