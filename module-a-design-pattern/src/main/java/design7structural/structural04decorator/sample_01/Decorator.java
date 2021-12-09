package design7structural.structural04decorator.sample_01;

public abstract class Decorator implements Person {
	protected Person person;
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@Override
	public void eat() {
		person.eat();
	}
}
