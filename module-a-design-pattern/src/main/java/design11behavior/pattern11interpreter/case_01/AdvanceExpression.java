package design11behavior.pattern11interpreter.case_01;

public class AdvanceExpression extends Expression {
	@Override
	void interpret(Context ctx) {
		System.out.println("这是高级解析器!");
	}
}
