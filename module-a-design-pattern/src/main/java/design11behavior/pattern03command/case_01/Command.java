package design11behavior.pattern03command.case_01;

public abstract class Command {
	protected Receiver receiver;
	
	public Command(Receiver receiver) {
		this.receiver = receiver;
	}
	
	public abstract void execute();
}
