package design7structural.structural03bridge.sample_01;

public class Jacket extends Clothing {
	@Override
	public void personDressCloth(Person person) {
		System.out.println(person.getSexType() + "穿上夹克");
	}
}
