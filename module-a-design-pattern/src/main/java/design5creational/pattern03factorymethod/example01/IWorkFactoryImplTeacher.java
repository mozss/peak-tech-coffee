package design5creational.pattern03factorymethod.example01;

/**
 * IWorkFactory的实现类
 */
public class IWorkFactoryImplTeacher implements IWorkFactory {
	@Override
	public Work getWork() {
		return new WorkTeacher();
	}
}
