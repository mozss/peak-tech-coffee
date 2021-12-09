package design7structural.structural02adapter.sample_01;

public class Main {
	public static void main(String[] args) {
		Target target = new Adapter(new Adaptee());
		target.adapteeMethod();
		target.adapterMethod();
	}
}
