/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 26.
 * </pre>
 * 
 * @author		: ym
 * @version		: 1.0
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
		IPhone i = new IPhone("iPhone 6", "애플", 700000);
		Galaxy g = new Galaxy("갤럭시 S6", "삼성", 650000);
		
		usePhone(i);
		usePhone(g);
	}
	
	public static void usePhone(SmartPhone p){
		p.turnOn();
		p.pay();
		p.useSpecialFunction();
		p.turnOff();
	}
}
