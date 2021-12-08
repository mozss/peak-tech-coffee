package design11behavior.pattern08iterator.case_01;

public interface List {
	Iterator iterator();
	Object get(int index);
	int getSize();
	void add(Object obj);
}
