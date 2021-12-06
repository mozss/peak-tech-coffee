package design11behavior.pattern08iterator.example01;

public interface List {
	Iterator iterator();
	Object get(int index);
	int getSize();
	void add(Object obj);
}
