package design05creational.pattern01singleton;

/**
 * @deprecated 懒汉模式;线程安全的
 */
public class Singleton05 {
	
	private Singleton05(){}
	
	//volatile + 双重检测机制来禁止指令重排
	private volatile static Singleton05 instance = null;
	
	public static Singleton05 getInstance() {
		if (instance == null) {
			synchronized (Singleton05.class){
				if (instance == null) {
					instance = new Singleton05();
				}
			}
		}
		return instance;
	}
}
