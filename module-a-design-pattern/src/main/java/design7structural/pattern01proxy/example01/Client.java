package design7structural.pattern01proxy.example01;

public class Client {
	public static void main(String[] args) {
		Object obj = new ProxyObject();
		obj.action();
	}
}
