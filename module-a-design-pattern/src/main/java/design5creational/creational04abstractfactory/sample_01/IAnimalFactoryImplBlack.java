package design5creational.creational04abstractfactory.sample_01;

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
