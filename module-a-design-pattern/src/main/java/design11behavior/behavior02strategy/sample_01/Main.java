package design11behavior.behavior02strategy.sample_01;

public class Main {
	public static void main(String[] args) {
		Context ctx = new Context(new StrategyImplA());
		ctx.doMethod();
		
		ctx = new Context(new StrategyImplB());
		ctx.doMethod();
		
		ctx = new Context(new StrategyImplC());
		ctx.doMethod();
	}
}
