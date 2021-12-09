package design5creational.creational03factorymethod.sample_01;

/**
 * 实现类Student
 */
public class WorkStudent implements Work{
	@Override
	public void doWork() {
		System.out.println("学生做作业");
	}
}
