/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Car
 * 
 * 1. 개요 : Car 클래스로부터 3개의 Car 객체를 생성하여 아래와 같이 출력해보기
 * 2. 작성일 : 2015. 4. 10.
 * </pre>
 * 
 * @author		: wp132416
 * @version		: 1.0
 */
public class Car {
	// Variables
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
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
	
	// Setter
	public void setCompany(String newCompany){
		company = newCompany;
	}
	
	public void setModel(String newModel){
		model = newModel;
	}
	
	public void setColor(String newColor){
		color = newColor;
	}
	
	public void setMaxSpeed(int newMaxSpeed){
		maxSpeed = newMaxSpeed;
	}
	
	public void setPrice(int newPrice){
		price = newPrice;
	}
}
