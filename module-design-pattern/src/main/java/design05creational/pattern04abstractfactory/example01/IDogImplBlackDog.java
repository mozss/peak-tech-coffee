package design05creational.pattern04abstractfactory.example01;

public class IDogImplBlackDog implements IDog {
	@Override
	public void eat() {
		System.out.println("这一只黑狗在吃东西");
	}
}
