package design5creational.pattern03factorymethod.example01;

/**
 * 实现类Student
 */
public class WorkStudent implements Work{
	@Override
	public void doWork() {
		System.out.println("学生做作业");
	}
}
