package design7structural.pattern01proxy.example01;

public class ObjectImpl implements Object {
	@Override
	public void action() {
		System.out.println("===========");
		System.out.println("这是被代理的类");
		System.out.println("===========");
	}
}
