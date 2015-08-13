/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Circle
 * 
 * 1. 개요 : Circle 클래스
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 * 
 * @author		: ym
 * @version		: 1.0
 */
public class Circle extends Figure {

	private int radius;
	
	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
	
	public Circle(int radius){
		this(0, 0, radius);
	}
	
	@Override
	protected double calcArea(){
		return Math.PI * Math.pow(radius, 2);
	}
	
	protected void printCenter(){
		System.out.print("원 ");
		super.printCenter();
	}
	
}
