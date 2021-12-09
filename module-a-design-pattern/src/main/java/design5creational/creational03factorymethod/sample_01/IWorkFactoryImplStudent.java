package design5creational.creational03factorymethod.sample_01;

/**
 * IWorkFactory的实现类
 */
public class IWorkFactoryImplStudent implements IWorkFactory {
	@Override
	public Work getWork() {
		return new WorkStudent();
	}
}
