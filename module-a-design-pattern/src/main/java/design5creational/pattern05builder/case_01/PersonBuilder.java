package design5creational.pattern05builder.case_01;

/**
 * Person对象的构造接口
 */
public interface PersonBuilder {
	void buildHead();
	
	void buildBody();
	
	void buildFoot();
	
	Person buildPerson();
}
