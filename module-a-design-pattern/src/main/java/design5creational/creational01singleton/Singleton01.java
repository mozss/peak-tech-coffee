package design5creational.creational01singleton;

/**
 * 懒汉模式;线程不安全的
 */
public class Singleton01 {
	
	private Singleton01(){}
	
	private static Singleton01 instance = null;
	
	public static Singleton01 getInstance(){
		//多个线程同时调用, 可能会创建多个对象
		if (instance == null) {
			instance = new Singleton01();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		new Thread(()->{System.out.println(Singleton01.getInstance().hashCode()); }).start();
		new Thread(()->{System.out.println(Singleton01.getInstance().hashCode()); }).start();
		new Thread(()->{System.out.println(Singleton01.getInstance().hashCode()); }).start();
	}
}
