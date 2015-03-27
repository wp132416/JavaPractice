package org.dimigo.basic;

/**
 * << 다섯번째 수행평가 과제 >>
 * 내용 : 반복문 관련 실습과제
 * 작성일자 : 2015년 3월 27일
 * @author wp132416
 * @version 1.0
 */

public class Loop {

	public static void main(String[] args) {
		
		// 변수 선언
		int i, j;
		
		for(i=1;i<=10;i++){
			for(j=1;j<=10;j++){
				if(i == j)
					System.out.print("*");
				else
					System.out.print(j);
			}
			
			// 줄바꿈
			System.out.println();
		}

	}

}
