package design11behavior.behavior04responsibilitychain.sample_01;


public class HrRequestHandle implements RequestHandle {
	@Override
	public void handleRequest(Request request) {
		if(request instanceof DimissionRequest){
			System.out.println("要离职,人事审批");
		}
		System.out.println("请求完毕");
	}
}
