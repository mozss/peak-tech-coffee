package design7structural.structural03bridge.sample_01;

public class Trouser extends Clothing {
	@Override
	public void personDressCloth(Person person) {
		System.out.println(person.getSexType()+"穿上裤子");
	}
}
