/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *   |_ Race
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 4.
 * </pre>
 * 
 * @author		: YM
 * @version		: 1.0
 */
public class Race {
	public static void main(String args[]){
		System.out.println("main method start");
		
		Thread r1 = new Runner("정욱재");
		Thread r2 = new Runner("박승진");
		
		r1.setPriority(Thread.MAX_PRIORITY);
		r2.setPriority(Thread.MIN_PRIORITY);
		
		r1.start();
		r2.start();
		
		System.out.println("main method end");
	}
}
