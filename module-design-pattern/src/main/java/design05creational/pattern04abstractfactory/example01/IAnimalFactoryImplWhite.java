package design05creational.pattern04abstractfactory.example01;

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
