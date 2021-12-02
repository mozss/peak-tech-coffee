package design5creational.pattern05builder.example01;

public class Client {
	public static void main(String[] args) {
		PersonDirector pd = new PersonDirector();
		Person person = pd.constructPerson(new ManBuilder());
		
		System.out.println(person.getBody());
		System.out.println(person.getHead());
		System.out.println(person.getFoot());
	}
}
