package design11behavior.pattern03command.example01;

public class Client {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command cmd = new CommandImpl(receiver);
		Invoker i = new Invoker();
		i.setCommand(cmd);
		i.execute();
	}
}
