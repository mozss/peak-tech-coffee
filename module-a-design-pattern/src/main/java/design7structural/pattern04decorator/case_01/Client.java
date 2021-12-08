package design7structural.pattern04decorator.case_01;

public class Client {
	public static void main(String[] args) {
		Man man = new Man();
		
		ManDecoratorA md_a = new ManDecoratorA();
		ManDecoratorB md_b = new ManDecoratorB();
		
		md_a.setPerson(man);
		md_b.setPerson(md_a);
		md_b.eat();
	}
}
