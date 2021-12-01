package design05creational.pattern04abstractfactory.example01;

public class ICatImplWhiteCat implements ICat {
	@Override
	public void eat() {
		System.out.println("这一只白猫在吃东西");
	}
}
