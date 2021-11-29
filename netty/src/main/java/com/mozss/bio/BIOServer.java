package com.mozss.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BIOServer {
	public static void main(String[] args) throws Exception{
		/*
		*   思路: 采用线程池的机制
		*       1.创建一个线程池
		*       2.如果有客户端连接,就创建一个线程,与之通信(单独写一个方法)
		*           注意:
		*               使用windows10的telnet客户端进行测试的时候,需要开启telnet服务,
		*               控制面板 --- > 程序(小图标下直接到【程序和功能】) --- >程序和功能
		*                --- >打开或关闭window功能 --- >选择telnet客户端
		*
		*               使用telnet: 需要是ctrl+]去激活, 然后输入命令send + "发送的内容"
		*
		* */
		//创建一个线程池
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		
		//创建ServerSocket(这里需要抛出异常)
		ServerSocket serverSocket = new ServerSocket(6666);
		System.out.println("服务器启动了");
		
		while(true){
			//验证是否阻塞,输出等待信息
			System.out.println("等待连接...");
			
			//开启监听,等待客户端的连接,并且把变量改为final类型的,不可更改
			final Socket socket = serverSocket.accept();
			System.out.println("连接到一个客户端了");
			
			//通过线程池创建一个线程
			newCachedThreadPool.execute(new Runnable() {
				@Override
				public void run() {
					//这里我们重写run方法
					//这里写和客户端通信的内容,由于操作比较多,可以单独写一个方法
					handler(socket);
					
				}
			});
		}
	}
	
	/**
	 * 一个Handler方法,和客户端通讯
	 *  参数Socket, 通讯肯定依赖于socket, 所以参数有Socket
	 * */
	public static void handler(Socket socket){
		
		
		//可以会有异常发生, 需要处理异常
		try {
			//为了验证,每个talent使用不同的线程, 这里我们可以输出线程的id
			System.out.println("线程信息 id = " + Thread.currentThread().getId()
					                   + "名称 = " + Thread.currentThread().getName());
			
			//创建一个byte[]来接收数据
			byte[] bytes = new byte[1024];
			//通过socket获取输入流, 因为涉及到IO操作, 这里需要抛出异常, 所以通过try包起来
			InputStream inputStream = socket.getInputStream();
			//循环读取客户端发送的数据
			while(true){
				//为了验证,每个talent使用不同的线程, 这里我们可以输出线程的id
				System.out.println("线程信息 id = " + Thread.currentThread().getId()
						                   + "名称 = " + Thread.currentThread().getName());
				//验证是否阻塞,输出等待信息
				System.out.println("等待读取...");
				int read = inputStream.read(bytes);
				//什么时候读取完毕呢?
				if(read != -1){
					//说明此时,还可以继续
					//还需要把bytes转成字符串(从0开始,直到下标为read),然后输出
					System.out.println(new String(bytes,0,read)); //输出客户端发送的数据
				} else{
					//说明,读取完毕了
					//跳出循环,结束
					break;
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//无论有无异常, 我们需要在使用之后,关闭socket连接
			System.out.println("关闭和客户端的连接");
			//关闭连接, 就是关闭socket连接,在关闭socket连接的时候,也会处理异常
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
