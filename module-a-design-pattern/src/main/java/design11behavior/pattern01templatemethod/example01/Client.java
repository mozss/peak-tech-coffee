package design11behavior.pattern01templatemethod.example01;

public class Client {
	public static void main(String[] args) {
		Template temp = new TemplateConcrete();
		temp.update();
	}
}
