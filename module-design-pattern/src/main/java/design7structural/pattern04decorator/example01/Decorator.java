package design7structural.pattern04decorator.example01;

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
