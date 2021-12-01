package design05creational.pattern04abstractfactory.example01;

public class IAnimalFactoryImplBlack implements IAnimalFactory {
	/**
	 * @return
	 */
	@Override
	public ICat creatCat() {
		return new ICatImplBlackCat();
	}
	
	/**
	 * @return
	 */
	@Override
	public IDog CreatDog() {
		return new IDogImplBlackDog();
	}
}
