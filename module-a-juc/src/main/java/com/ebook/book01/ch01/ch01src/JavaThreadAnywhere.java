package com.ebook.book01.ch01.ch01src;

/**
 * 该例子说明: 两个类的两个方法都是main方法负责执行的
 */
public class JavaThreadAnywhere {
	
	static class Helper implements Runnable{
		private final  String message;
		
		public Helper(String message) {
			this.message = message;
		}
		
		@Override
		public void run() {
			doSomething(message);
		}
		
		private void doSomething(String message) {
			System.out.println("The doSomething method was executed by thread:" + Thread.currentThread().getName());
			System.out.println("Do something with" + message);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("The main method was executed by thread:" + Thread.currentThread().getName());
		Helper helper = new Helper("Java Thread Anywhere");
		helper.run();
	}
}
