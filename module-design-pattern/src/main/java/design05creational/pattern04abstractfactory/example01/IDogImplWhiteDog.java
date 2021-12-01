package design05creational.pattern04abstractfactory.example01;

public class IDogImplWhiteDog implements IDog {
	@Override
	public void eat() {
		System.out.println("这一只白狗在吃东西");
	}
}
