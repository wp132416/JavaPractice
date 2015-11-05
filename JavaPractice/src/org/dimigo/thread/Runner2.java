/**
 * 
 */
package org.dimigo.thread;

import java.util.Random;

/**
 * <pre>
 * org.dimigo.thread
 *   |_ Runner
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 4.
 * </pre>
 * 
 * @author		: YM
 * @version		: 1.0
 */
public class Runner2 implements Runnable {
	
	private String name;
	
	public Runner2(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(name + " 출발");
		
		for(int i=100; i>0; i=i-10){
			System.out.println(name + " " + i + " 미터");
			try {
				//Thread.sleep(new Random().nextInt(2000));
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(name + " 골인");
	}
}
