package design7structural.structural03bridge.sample_01;

public abstract class Person {
	private Clothing clothing;
	private String sexType;
	
	public Clothing getClothing(){
		return clothing;
	}
	
	public void setClothing(Clothing clothing) {
		this.clothing = clothing;
	}
	
	public String getSexType() {
		return sexType;
	}
	
	public void setSexType(String sexType) {
		this.sexType = sexType;
	}
	
	public abstract void dress();
}
