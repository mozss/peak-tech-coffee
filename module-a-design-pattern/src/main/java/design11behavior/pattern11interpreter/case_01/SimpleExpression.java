package design11behavior.pattern11interpreter.case_01;

public class SimpleExpression extends Expression {
	@Override
	void interpret(Context ctx) {
		System.out.println("这是普通解析器!");
	}
}
