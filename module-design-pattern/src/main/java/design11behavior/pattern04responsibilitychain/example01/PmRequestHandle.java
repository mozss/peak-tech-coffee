package design11behavior.pattern04responsibilitychain.example01;


public class PmRequestHandle implements RequestHandle {
	RequestHandle rh;
	
	public PmRequestHandle(RequestHandle rh) {
		this.rh = rh;
	}
	
	@Override
	public void handleRequest(Request request) {
		if (request instanceof AddMoneyRequest){
			System.out.println("要加薪, 项目经理审批");
		}else {
			rh.handleRequest(request);
		}
	}
}
