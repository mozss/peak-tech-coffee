package design11behavior.behavior07mediator.sample_01;

public class Main {
	public static void main(String[] args) {
		Mediator med = new ConcreteMediator();
		//老板来了
		med.notice("boss");
		//客户来了
		med.notice("client");
	}
}
