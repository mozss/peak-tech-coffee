package design5creational.creational04abstractfactory.sample_01;

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
