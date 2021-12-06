package design7structural.pattern04decorator.example01;

public class ManDecoratorB extends Decorator {
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("==========");
		System.out.println("ManDecoratorB类");
	}
}