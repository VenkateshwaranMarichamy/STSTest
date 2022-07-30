package com.study.test;

public class ThreadExample {

	static int[] array = {0};

	public static void main(String[] args) throws InterruptedException {
		// Concurrency problem		
		Thread a = new Thread() {
			public void run() {
				for(int i=0; i<1000; i++)
					increase();
			}
		};

		Thread b = new Thread() {
			public void run() {
				for(int i=0; i<1000; i++)
					decrease();
			}
		};

		a.start();
		b.start();

//		a.join();
//		b.join();

		System.out.println(array[0]);

	}

	//	public synchronized  static void increase() {
	//		array[0]++;
	//	}
	//	
	//	public synchronized static void decrease() {
	//		array[0]--;
	//	}

	public  static void increase() {
		synchronized (array) {
			array[0]++;
		}

	}

	public static void decrease() {
		synchronized (array) {
			array[0]--;
		}

	}

}
