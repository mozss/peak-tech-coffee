package design5creational.pattern03factorymethod.case_01;

/**
 * IWorkFactory的实现类
 */
public class IWorkFactoryImplTeacher implements IWorkFactory {
	@Override
	public Work getWork() {
		return new WorkTeacher();
	}
}
