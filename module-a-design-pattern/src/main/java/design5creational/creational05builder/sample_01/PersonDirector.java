package design5creational.creational05builder.sample_01;

/**
 * Person对象的整体构造器
 */
public class PersonDirector {
	public Person constructPerson(PersonBuilder pb){
		pb.buildHead();
		pb.buildBody();
		pb.buildFoot();
		return pb.buildPerson();
	}
}
