package pattern03_guarded_suspension.src.sample_01;

/**
 * 表示请求的类
 */
public class Request {
	private final String name;
	
	public Request(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Request{" +
				       "name='" + name + '\'' +
				       '}';
	}
}
