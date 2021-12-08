package design5creational.pattern04abstractfactory.case_01;

public class ICatImplBlackCat implements ICat {
	@Override
	public void eat() {
		System.out.println("这一只黑猫在吃东西");
	}
}
