package design5creational.pattern02prototype.example01;

/**
 * 原型类的子类, 用于构建原型
 */
public class ConcretePrototype extends Prototype {
	public ConcretePrototype(String name) {
		setName(name);
	}
}
