/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Score
 * 
 * 1. 개요 : 실습과제 9
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 * 
 * @author		: ym
 * @version		: 1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		
		System.out.println("수학 점수 입력 => ");
		int mat = scanner.nextInt();
		
		System.out.println("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		StringBuilder sb = new StringBuilder("<< 점수 출력 >>\n");
		sb
		.append("국어 점수 : ")
		.append(kor + " 점\n")
		.append("수학 점수 : ")
		.append(mat + " 점\n")
		.append("영어 점수 : ")
		.append(eng + " 점\n")
		.append("총점 : ")
		.append((kor + mat + eng) + " 점\n")
		.append("평균 : ")
		.append(String.format("%.1f", ((kor + mat + eng) / 3.0)) + " 점");
		
		System.out.println(sb.toString());
	}

}
