package design7structural.pattern07composite.case_01;

public class ProjectAssistant extends Employer {
	
	public ProjectAssistant(String name) {
		setName(name);
		//项目助理,表示没有下属了
		employers = null;
	}
	
	@Override
	public void add(Employer employer) {
	
	}
	
	@Override
	public void delete(Employer employer) {
	
	}
}
