package design05creational.pattern04abstractfactory.example01;

public class ICatImplBlackCat implements ICat {
	@Override
	public void eat() {
		System.out.println("这一只黑猫在吃东西");
	}
}
