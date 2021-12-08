package design11behavior.pattern03command.case_01;

public class Invoker {
	private Command command;
	
	public void setCommand(Command command){
		this.command = command;
	}
	
	public void execute(){
		command.execute();
	}
}
