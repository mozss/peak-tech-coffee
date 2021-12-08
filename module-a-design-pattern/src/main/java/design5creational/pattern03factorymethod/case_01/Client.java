package design5creational.pattern03factorymethod.case_01;

/**
 * 测试类
 */
public class Client {
	public static void main(String[] args) {
		IWorkFactory iWorkFactoryImplStudent = new IWorkFactoryImplStudent();
		IWorkFactory iWorkFactoryImplTeacher = new IWorkFactoryImplTeacher();
		
		iWorkFactoryImplStudent.getWork().doWork();
		iWorkFactoryImplTeacher.getWork().doWork();
	}
}
