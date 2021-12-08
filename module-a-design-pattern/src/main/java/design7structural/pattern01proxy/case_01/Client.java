package design7structural.pattern01proxy.case_01;

public class Client {
	public static void main(String[] args) {
		Object obj = new ProxyObject();
		obj.action();
	}
}
