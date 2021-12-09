package design7structural.structural03bridge.sample_01;

public class Main {
	public static void main(String[] args) {
		Person man = new Man();
		Person lady = new Lady();
		
		Clothing jacket = new Jacket();
		Clothing trouser = new Trouser();
		
		jacket.personDressCloth(man);
		trouser.personDressCloth(man);
		
		jacket.personDressCloth(lady);
		trouser.personDressCloth(lady);
	}
}
