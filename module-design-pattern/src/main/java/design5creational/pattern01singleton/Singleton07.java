package design5creational.pattern01singleton;

/**
 * 通过枚举实现线程最安全的方式
 */
public class Singleton07 {
	
	private Singleton07(){}
	
	private enum Singleton{
		INSTANCE;
		
		private Singleton07 singleton;
		
		//JVM保证这个方法只会调用一次
		Singleton(){
			singleton = new Singleton07();
		}
		
		public Singleton07 getInstance() {
			return singleton;
		}
	}
	
	public static Singleton07 getInstance() {
		return Singleton.INSTANCE.getInstance();
	}
}
