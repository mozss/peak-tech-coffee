package design11behavior.pattern10memento.example01;

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
