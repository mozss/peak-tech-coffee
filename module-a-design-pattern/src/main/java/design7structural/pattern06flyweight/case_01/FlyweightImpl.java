package design7structural.pattern06flyweight.case_01;

public class FlyweightImpl implements Flyweight {
	@Override
	public void action(int arg) {
		System.out.println("该action的参数值:+" + arg);
	}
}
