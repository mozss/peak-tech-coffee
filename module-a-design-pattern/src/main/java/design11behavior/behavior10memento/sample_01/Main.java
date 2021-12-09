package design11behavior.behavior10memento.sample_01;

public class Main {
	public static void main(String[] args) {
		Originator org = new Originator();
		org.setState("开会中");
		
		Caretaker ctk = new Caretaker();
		//将数据封装在Caretaker
		ctk.setMemento(org.createMemento());
		
		org.setState("睡觉中");
		//显示
		org.showState();
		//将数据重新导入
		org.setMemento(ctk.getMemento());
		org.showState();
	}
}
