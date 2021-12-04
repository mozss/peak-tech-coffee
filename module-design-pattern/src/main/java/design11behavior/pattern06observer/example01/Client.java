package design11behavior.pattern06observer.example01;

public class Client {
	public static void main(String[] args) {
		Policeman thPol = new TianHePoliceman();
		Policeman hpPol = new HuangPuPoliceman();
		
		Citizen citizen = new HuangPuCitizen(hpPol);
		citizen.sendMessage("unnormal");
		citizen.sendMessage("normal");
		
		System.out.println("==========");
		citizen = new TianHeCitizen(thPol);
		citizen.sendMessage("normal");
		citizen.sendMessage("unnormal");
	}
}
