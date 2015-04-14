/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Car3
 * 
 * 1. 개요 : Car 클래스를 생성자 오버로딩을 이용하여 수정해보자. (this 이용하기)
 * 2. 작성일 : 2015. 4. 14.
 * </pre>
 * 
 * @author		: wp132416
 * @version		: 1.0
 */
public class Car3 {
	// Variables
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	// Constructor
	public Car3(){
		
	}
	
	// Constructor
	public Car3(String company, String model, String color, int maxSpeed, int price){
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	
	// Constructor
	public Car3(String company, String model, String color, int maxSpeed){
		this(company, model, color, maxSpeed, 0);
	}
		
	// Constructor
	public Car3(String company, String model, String color){
		this(company, model, color, 0, 0);
	}
	
	// Getter
	public String getCompany(){
		return company;
	}
	
	public String getModel(){
		return model;
	}
	
	public String getColor(){
		return color;
	}
	
	public int getMaxSpeed(){
		return maxSpeed;
	}
	
	public int getPrice(){
		return price;
	}
}
