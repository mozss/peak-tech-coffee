package design5creational.creational02prototype.sample_01;


public class Main {
	public static void main(String[] args) {
		design5creational.creational02prototype.sample_01.Prototype pro_1 = new ConcretePrototype("prototype_1");
		design5creational.creational02prototype.sample_01.Prototype pro_2 = (Prototype)pro_1.clone();
		//通过执行, 发现pro_1和pro_2的均输出"prototype_1"
		System.out.println(pro_1.getName());
		System.out.println(pro_2.getName());
	}
}
