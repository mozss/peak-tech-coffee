package design7structural.structural02adapter.sample_01;

/**
 * Adapter: 对Target Adaptee适配
 */
public class Adapter implements Target {
	
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void adapteeMethod() {
		adaptee.adapteeMethod();
	}
	
	@Override
	public void adapterMethod() {
		System.out.println("Adapter method!");
	}
	
}
