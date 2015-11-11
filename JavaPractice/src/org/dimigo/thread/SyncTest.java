/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *   |_ SyncTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 5.
 * </pre>
 * 
 * @author		: YM
 * @version		: 1.0
 */
public class SyncTest {

	private int data;
	
	public static void main(String[] args) {
		SyncTest s = new SyncTest();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				s.add();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				s.add();
			}
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("data => " + s.data);
	}
	
	private void add(){
		for(int i=0;i<10000;i++){
			data++;
		}
	}

}
