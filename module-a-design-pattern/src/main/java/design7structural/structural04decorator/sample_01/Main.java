package design7structural.structural04decorator.sample_01;

public class Main {
	public static void main(String[] args) {
		Man man = new Man();
		
		ManDecoratorA md_a = new ManDecoratorA();
		ManDecoratorB md_b = new ManDecoratorB();
		
		md_a.setPerson(man);
		md_b.setPerson(md_a);
		md_b.eat();
	}
}
