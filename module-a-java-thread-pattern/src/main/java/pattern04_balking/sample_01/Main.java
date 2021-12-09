package pattern04_balking.sample_01;

public class Main {
	public static void main(String[] args) {
		Data data = new Data("data.txt","(empty)");
		new ChangerThread("ChangerThread",data).start();
		new SaverThread("SaverThread",data).start();
	}
}
