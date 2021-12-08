package design5creational.pattern04abstractfactory.case_01;

public class IDogImplBlackDog implements IDog {
	@Override
	public void eat() {
		System.out.println("这一只黑狗在吃东西");
	}
}
