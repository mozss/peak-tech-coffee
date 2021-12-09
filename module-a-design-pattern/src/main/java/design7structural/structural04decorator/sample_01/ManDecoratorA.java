package design7structural.structural04decorator.sample_01;

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
