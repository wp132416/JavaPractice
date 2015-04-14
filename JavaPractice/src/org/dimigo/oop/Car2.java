/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Car2
 * 
 * 1. 개요 : Car 객체생성 시 생성자를 이용하여 필드를 초기화하여 출력해보기
 * 2. 작성일 : 2015. 4. 14.
 * </pre>
 * 
 * @author		: wp132416
 * @version		: 1.0
 */
public class Car2 {
	// Variables
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	// Constructor
	public Car2(){
		
	}
	
	// Constructor
	public Car2(String newCompany, String newModel, String newColor, int newMaxSpeed, int newPrice){
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
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
