package design11behavior.pattern04responsibilitychain.example01;

public interface RequestHandle {
	//这是需要注意的是, 引入org.omg.CORBA.Request包
	void handleRequest(Request request);
}
