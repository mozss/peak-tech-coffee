package design7structural.structural06flyweight.sample_01;

public class FlyweightImpl implements Flyweight {
	@Override
	public void action(int arg) {
		System.out.println("该action的参数值:+" + arg);
	}
}
