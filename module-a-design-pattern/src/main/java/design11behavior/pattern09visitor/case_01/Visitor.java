package design11behavior.pattern09visitor.case_01;

import java.util.Collection;

public interface Visitor {
	public void visitString(StringElement stringE);
	public void visitFloat(FloatElement floatE);
	public void visitCollection(Collection collection);
	
}
