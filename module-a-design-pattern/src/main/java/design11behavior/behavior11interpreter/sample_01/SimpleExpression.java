package design11behavior.behavior11interpreter.sample_01;

public class SimpleExpression extends Expression {
	@Override
	void interpret(Context ctx) {
		System.out.println("这是普通解析器!");
	}
}
