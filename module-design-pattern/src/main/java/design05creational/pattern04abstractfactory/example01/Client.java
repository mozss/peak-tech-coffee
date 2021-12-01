package design05creational.pattern04abstractfactory.example01;

/**
 * 测试类
 */
public class Client {
	public static void main(String[] args) {
		//黑色系动物的创建
		IAnimalFactory iAnimalFactoryImplBlackAnimal= new IAnimalFactoryImplBlack();
		
		ICat blackCat = iAnimalFactoryImplBlackAnimal.creatCat();
		blackCat.eat();
		IDog blackDog = iAnimalFactoryImplBlackAnimal.CreatDog();
		blackDog.eat();
		
		System.out.println("===============");
		
		//白色系动物的创建
		IAnimalFactory iAnimalFactoryImplWhite = new IAnimalFactoryImplWhite();
		
		ICat whiteCat = iAnimalFactoryImplWhite.creatCat();
		whiteCat.eat();
		IDog whiteDog = iAnimalFactoryImplWhite.CreatDog();
		whiteDog.eat();
		
	}
}
