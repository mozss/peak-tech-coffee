package design5creational.pattern03factorymethod.example01;

/**
 * IWorkFactory的实现类
 */
public class IWorkFactoryImplStudent implements IWorkFactory {
	@Override
	public Work getWork() {
		return new WorkStudent();
	}
}
