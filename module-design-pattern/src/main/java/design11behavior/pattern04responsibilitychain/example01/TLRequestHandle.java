package design11behavior.pattern04responsibilitychain.example01;

public class TLRequestHandle implements RequestHandle {
	RequestHandle rh;
	
	public TLRequestHandle(RequestHandle rh) {
		this.rh = rh;
	}
	
	@Override
	public void handleRequest(Request request) {
		if(request instanceof LeaveRequest){
			System.out.println("要请假,项目组长审批!");
		}else {
			rh.handleRequest(request);
		}
	}
}
