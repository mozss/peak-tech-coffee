package design7structural.pattern02adapter.case_01;

public class Client {
	public static void main(String[] args) {
		Target target = new Adapter(new Adaptee());
		target.adapteeMethod();
		target.adapterMethod();
	}
}
