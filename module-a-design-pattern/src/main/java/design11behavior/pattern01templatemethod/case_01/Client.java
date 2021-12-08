package design11behavior.pattern01templatemethod.case_01;

public class Client {
	public static void main(String[] args) {
		Template temp = new TemplateConcrete();
		temp.update();
	}
}
