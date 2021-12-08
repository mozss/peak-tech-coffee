package design11behavior.pattern06observer.case_01;

public class HuangPuPoliceman implements Policeman {
	@Override
	public void action(Citizen ci) {
		String help = ci.getHelp();
		if (help.equals("normal")){
			System.out.println("黄埔地区,一切正常, 不用出警。");
		}
		if(help.equals("unnormal")){
			System.out.println("黄埔地区,有犯罪行为,警察出动!");
		}
	}
}
