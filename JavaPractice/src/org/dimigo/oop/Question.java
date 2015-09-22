/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 * 
 * 1. 개요 : 실습과제 8
 * 2. 작성일 : 2015. 5. 11.
 * </pre>
 * 
 * @author		: ym
 * @version		: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String answer = null;
		
		System.out.println("민석이가 사는 곳은?");
		answer = scanner.nextLine();
		
		if("광명".equals(answer)){
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅠ");
		}
		
			
		System.out.println("민석이의 흑역사는?");
		answer = scanner.nextLine();
		
		if("차카".equals(answer)){
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅠ");
		}
		
		System.out.println("민석이가 좋아하는 음식은?");
		answer = scanner.nextLine();
		
		if("파스타".equals(answer)){
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅠ");
		}

		scanner.close();
		
	}

}
