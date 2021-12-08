package design11behavior.pattern11interpreter.case_01;


public class Client {
	public static void main(String[] args) {
		Context ctx = new Context();
		ctx.add(new SimpleExpression());
		ctx.add(new AdvanceExpression());
		ctx.add(new SimpleExpression());
		
		for (Expression eps :
				ctx.getList()) {
			eps.interpret(ctx);
		}
	}
}
