package design11behavior.pattern10memento.example01;

public class Client {
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
