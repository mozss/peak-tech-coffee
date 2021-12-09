package pattern03_guarded_suspension.src.sample_01;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 用于存放请求的RequestQueue类
 */
public class RequestQueue {
	private final Queue<Request> queue = new LinkedList<Request>();
	
	/**
	 * 取出最先存放的RequestQueue的一个请求
	 * @return
	 */
	public synchronized Request getRequest() {
		while (queue.peek() == null) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		return queue.remove();
	}
	
	/**
	 * 添加一个请求
	 * @param request
	 */
	public synchronized void putRequest(Request request) {
		queue.offer(request);
		notifyAll();
	}
}
