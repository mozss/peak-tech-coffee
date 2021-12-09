package design11behavior.behavior10memento.sample_01;

public class Memento {
	private String state;
	
	public Memento(String state){
		this.state = state;
	}
	
	public String getState(){
		return state;
	}
	
	public void setState(String state){
		this.state = state;
	}
}
