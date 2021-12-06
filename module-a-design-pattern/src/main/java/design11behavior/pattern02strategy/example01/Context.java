package design11behavior.pattern02strategy.example01;

public class Context {
	Strategy stra;
	
	public Context(Strategy stra) {
		this.stra = stra;
	}
	
	public void doMethod(){
		stra.method();
	}
}
