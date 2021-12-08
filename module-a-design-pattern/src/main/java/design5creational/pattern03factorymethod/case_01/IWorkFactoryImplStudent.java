package design5creational.pattern03factorymethod.case_01;

/**
 * IWorkFactory的实现类
 */
public class IWorkFactoryImplStudent implements IWorkFactory {
	@Override
	public Work getWork() {
		return new WorkStudent();
	}
}
