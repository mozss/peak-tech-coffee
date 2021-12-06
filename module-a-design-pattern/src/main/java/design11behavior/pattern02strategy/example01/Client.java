package design11behavior.pattern02strategy.example01;

public class Client {
	public static void main(String[] args) {
		Context ctx = new Context(new StrategyImplA());
		ctx.doMethod();
		
		ctx = new Context(new StrategyImplB());
		ctx.doMethod();
		
		ctx = new Context(new StrategyImplC());
		ctx.doMethod();
	}
}
