package design11behavior.pattern06observer.example01;

public class HuangPuCitizen extends Citizen {
	public HuangPuCitizen(Policeman pol) {
		setPolicemen();
		register(pol);
	}
	
	@Override
	public void sendMessage(String help) {
		setHelp(help);
		for (int i = 0; i < pols.size(); i++) {
			Policeman pol = (Policeman) pols.get(i);
			//通知行动
			pol.action(this);
		}
	}
}
