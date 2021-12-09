package design5creational.creational03factorymethod.sample_01;

/**
 * 测试类
 */
public class Main {
	public static void main(String[] args) {
		IWorkFactory iWorkFactoryImplStudent = new IWorkFactoryImplStudent();
		IWorkFactory iWorkFactoryImplTeacher = new IWorkFactoryImplTeacher();
		
		iWorkFactoryImplStudent.getWork().doWork();
		iWorkFactoryImplTeacher.getWork().doWork();
	}
}
