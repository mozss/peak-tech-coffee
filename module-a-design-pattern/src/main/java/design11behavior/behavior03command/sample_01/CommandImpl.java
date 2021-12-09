package design11behavior.behavior03command.sample_01;

public class CommandImpl extends Command {
	public CommandImpl(Receiver receiver) {
		super(receiver);
	}
	
	@Override
	public void execute() {
		receiver.receive();
	}
}
