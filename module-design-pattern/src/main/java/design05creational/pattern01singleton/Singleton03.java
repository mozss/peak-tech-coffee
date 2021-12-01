package design05creational.pattern01singleton;


/**
 * 懒汉模式;线程安全的(但不推荐)
 */
public class Singleton03 {
	
	private Singleton03(){}
	
	private static Singleton03 instance = null;
	
	public static synchronized Singleton03 getInstance(){
		if (instance == null) {
			instance = new Singleton03();
		}
		return instance;
	}
}
