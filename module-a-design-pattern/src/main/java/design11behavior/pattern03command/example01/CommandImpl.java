package design11behavior.pattern03command.example01;

public class CommandImpl extends Command {
	public CommandImpl(Receiver receiver) {
		super(receiver);
	}
	
	@Override
	public void execute() {
		receiver.receive();
	}
}
