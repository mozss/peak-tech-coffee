package design5creational.creational04abstractfactory.sample_01;

public class ICatImplWhiteCat implements ICat {
	@Override
	public void eat() {
		System.out.println("这一只白猫在吃东西");
	}
}
