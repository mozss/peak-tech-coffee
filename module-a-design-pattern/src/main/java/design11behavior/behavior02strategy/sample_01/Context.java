package design11behavior.behavior02strategy.sample_01;

public class Context {
	Strategy stra;
	
	public Context(Strategy stra) {
		this.stra = stra;
	}
	
	public void doMethod(){
		stra.method();
	}
}
