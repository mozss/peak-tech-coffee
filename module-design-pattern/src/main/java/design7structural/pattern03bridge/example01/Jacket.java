package design7structural.pattern03bridge.example01;

public class Jacket extends Clothing {
	@Override
	public void personDressCloth(Person person) {
		System.out.println(person.getSexType() + "穿上夹克");
	}
}
