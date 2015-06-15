/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ PiggyBank
 * 
 * 1. 개요 : 12번째 실습과제
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 * 
 * @author		: ym
 * @version		: 1.0
 */
public class PiggyBank {
	// 잔고
	private static int balance;
	
	// 저금통에 돈 넣는 메소드
	public static void putMoney(FamilyMember member, int amount){
		balance += amount;
		System.out.println(member.getMemberName() + " " + amount + "원 넣음");
	}
	
	// 잔고 출
	public static void printBalance(){
		System.out.println("돼지저금통 총 금액 : " + balance + "원");
	}
}
