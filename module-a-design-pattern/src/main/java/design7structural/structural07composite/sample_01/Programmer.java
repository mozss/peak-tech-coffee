package design7structural.structural07composite.sample_01;

public class Programmer extends Employer {
	public Programmer(String name){
		setName(name);
		//表示没有下属
		employers = null;
	}
	
	@Override
	public void add(Employer employer) {
	
	}
	
	@Override
	public void delete(Employer employer) {
	
	}
}
