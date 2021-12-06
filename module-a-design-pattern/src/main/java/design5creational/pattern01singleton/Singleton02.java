package design5creational.pattern01singleton;

/**
 * 饿汉模式(在类加载时候进行创建);线程安全的
 */
public class Singleton02 {
	
	private Singleton02(){}
	
	private static Singleton02 instance = new Singleton02();
	
	public static Singleton02 getInstance(){
		return instance;
	}
}
