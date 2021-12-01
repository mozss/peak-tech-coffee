package design05creational.pattern04abstractfactory.example01;

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
