package design5creational.pattern03factorymethod.case_01;

/**
 * work的实现类TeacherWork
 */
public class WorkTeacher implements Work{
	@Override
	public void doWork() {
		System.out.println("老师批改作业");
	}
}
