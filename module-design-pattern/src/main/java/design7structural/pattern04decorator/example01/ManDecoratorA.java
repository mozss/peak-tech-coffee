package design7structural.pattern04decorator.example01;

public class ManDecoratorA extends Decorator {
	@Override
	public void eat() {
		super.eat();
		reEat();
		System.out.println("ManDecoratorA类");
	}
	
	private void reEat() {
		System.out.println("再吃一顿");
	}
}
