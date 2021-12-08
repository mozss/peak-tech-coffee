package design7structural.pattern05facade.case_01;

public class Client {
	public static void main(String[] args) {
		ServiceA serviceA = new ServiceAImpl();
		ServiceB serviceB = new ServiceBImpl();
		ServiceC serviceC = new ServiceCImpl();
		
		serviceA.methodA();
		serviceB.methodB();
		System.out.println("==========");
		
		Facade facade = new Facade();
		facade.method_1();
		facade.method_2();
		facade.method_3();
	}
}
