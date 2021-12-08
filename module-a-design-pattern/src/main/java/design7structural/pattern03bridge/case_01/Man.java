package design7structural.pattern03bridge.case_01;

public class Man extends Person {
	public Man() {
		setSexType("男人");
	}
	
	@Override
	public void dress() {
		Clothing clothing = getClothing();
		clothing.personDressCloth(this);
	}
}
