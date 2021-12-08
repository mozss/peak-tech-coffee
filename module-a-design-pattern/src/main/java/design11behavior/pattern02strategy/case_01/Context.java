package design11behavior.pattern02strategy.case_01;

public class Context {
	Strategy stra;
	
	public Context(Strategy stra) {
		this.stra = stra;
	}
	
	public void doMethod(){
		stra.method();
	}
}
