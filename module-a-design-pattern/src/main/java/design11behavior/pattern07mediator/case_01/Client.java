package design11behavior.pattern07mediator.case_01;

public class Client {
	public static void main(String[] args) {
		Mediator med = new ConcreteMediator();
		//老板来了
		med.notice("boss");
		//客户来了
		med.notice("client");
	}
}
