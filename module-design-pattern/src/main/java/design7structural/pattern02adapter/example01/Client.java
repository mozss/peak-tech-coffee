package design7structural.pattern02adapter.example01;

public class Client {
	public static void main(String[] args) {
		Target target = new Adapter(new Adaptee());
		target.adapteeMethod();
		target.adapterMethod();
	}
}