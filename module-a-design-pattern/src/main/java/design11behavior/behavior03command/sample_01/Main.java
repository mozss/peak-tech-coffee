package design11behavior.behavior03command.sample_01;

public class Main {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command cmd = new CommandImpl(receiver);
		Invoker i = new Invoker();
		i.setCommand(cmd);
		i.execute();
	}
}
