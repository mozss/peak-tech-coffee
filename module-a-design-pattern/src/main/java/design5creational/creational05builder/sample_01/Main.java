package design5creational.creational05builder.sample_01;

public class Main {
	public static void main(String[] args) {
		PersonDirector pd = new PersonDirector();
		Person person = pd.constructPerson(new ManBuilder());
		
		System.out.println(person.getBody());
		System.out.println(person.getHead());
		System.out.println(person.getFoot());
	}
}
