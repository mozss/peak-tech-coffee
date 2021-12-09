package design5creational.creational02prototype.sample_01;

/**
 * 原型类, 需要实现Cloneable接口
 */
public class Prototype implements Cloneable{
	
	private String name;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	
	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
