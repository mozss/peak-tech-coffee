package design7structural.pattern03bridge.case_01;

public class Lady extends Person {
	public Lady() {
		setSexType("女人");
	}
	
	@Override
	public void dress() {
		Clothing clothing = getClothing();
		clothing.personDressCloth(this);
	}
	
}
