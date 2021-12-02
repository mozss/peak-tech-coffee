package design5creational.pattern01singleton;

/**
 * 饿汉模式;线程安全的
 */
public class Singleton06 {
	
	private Singleton06(){}
	
	private static Singleton06 instance = null;
	
	static {
		instance = new Singleton06();
	}
	
	public static Singleton06 getInstance() {
		return instance;
	}
}
