package design11behavior.behavior03command.sample_01;

public abstract class Command {
	protected Receiver receiver;
	
	public Command(Receiver receiver) {
		this.receiver = receiver;
	}
	
	public abstract void execute();
}
