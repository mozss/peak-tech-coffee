package design11behavior.behavior08iterator.sample_01;

public interface List {
	Iterator iterator();
	Object get(int index);
	int getSize();
	void add(Object obj);
}
