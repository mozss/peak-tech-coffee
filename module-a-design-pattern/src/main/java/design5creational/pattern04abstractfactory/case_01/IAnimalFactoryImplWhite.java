package design5creational.pattern04abstractfactory.case_01;

public class IAnimalFactoryImplWhite implements IAnimalFactory {
	/**
	 * @return
	 */
	@Override
	public ICat creatCat() {
		return new ICatImplWhiteCat();
	}
	
	/**
	 * @return
	 */
	@Override
	public IDog CreatDog() {
		return new IDogImplWhiteDog();
	}
}
