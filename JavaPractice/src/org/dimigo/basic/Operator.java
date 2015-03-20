package org.dimigo.basic;

/**
 * << 세번째 수행평가 과제 >>
 * 내용 : 사다리꼴과 평행사변형 두 개의 넓이를 비교하여 결과를 출력하기
 * 작성일자 : 2015년 3월 20일
 * @author wp132416
 * @version 1.0
 */
public class Operator {

	public static void main(String[] args) {
		
		int a = 9, b = 10;
		double h1 = 5.8, h2 = 5.4;
		
		double ret1 = (a + b) * h1 / 2;
		double ret2 = a * h2;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + ret1);
		System.out.println("평행사변형 넓이 : " + ret2);
		System.out.println();
		System.out.println(
				((ret1 > ret2) ? "사다리꼴이 평행사변형 보다 " : "평행사변형이 사다리꼴 보다 ") 
				+ ((ret1 > ret2) ? ret1 - ret2 : ret2 - ret1)
				+ " 더 큽니다."
				);
		

	}

}
