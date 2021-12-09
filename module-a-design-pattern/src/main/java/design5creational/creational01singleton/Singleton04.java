package design5creational.creational01singleton;

/**
 * 懒汉模式;线程不安全的
 */
public class Singleton04 {
	
	private Singleton04(){}
	
	private static Singleton04 instance = null;
	
	public static Singleton04 getInstance() {
		if (instance == null) {
			synchronized (Singleton04.class){
				if (instance == null) {
					instance = new Singleton04();
				}
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		new Thread(()->{System.out.println(Singleton04.getInstance().hashCode()); }).start();
		new Thread(()->{System.out.println(Singleton04.getInstance().hashCode()); }).start();
		new Thread(()->{System.out.println(Singleton04.getInstance().hashCode()); }).start();
	}
}
