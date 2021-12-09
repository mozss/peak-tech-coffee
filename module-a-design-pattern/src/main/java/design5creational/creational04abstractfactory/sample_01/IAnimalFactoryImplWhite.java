package design5creational.creational04abstractfactory.sample_01;

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
