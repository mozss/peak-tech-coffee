package design11behavior.behavior10memento.sample_01;

public class Caretaker {
	private Memento memento;
	
	public Memento getMemento(){
		return this.memento;
	}
	
	public void setMemento(Memento memento){
		this.memento = memento;
	}
}
