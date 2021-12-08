package design5creational.pattern04abstractfactory.case_01;

/**
 * 抽象工厂类
 */
public interface IAnimalFactory {
	/**
	 *
	 * @return
	 */
	ICat creatCat();
	
	/**
	 * @return
	 */
	IDog CreatDog();
}
