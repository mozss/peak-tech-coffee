package design5creational.pattern04abstractfactory.case_01;

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
