/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ Figure
 * 
 * 1. 개요 : Figure 클래스
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 * 
 * @author		: ym
 * @version		: 1.0
 */
public class Figure {
	private int centerX;
	private int centerY;
	
	public Figure(int centerX, int centerY){
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea(){
		return 0.0;
	}
	
	protected void printCenter(){
		System.out.println("중심좌표 : (" + this.centerX + ", " + this.centerY + ")");
	}
	
	protected void moveFigure(int x, int y){
		this.centerX += x;
		this.centerY += y;
	}
}
