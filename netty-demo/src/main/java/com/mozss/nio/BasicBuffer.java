package com.mozss.nio;

import java.nio.IntBuffer;

public class BasicBuffer {
	public static void main(String[] args) {
		//简单举例说明buffer的使用
		
		//Buffer有很多的类型, 这里我们创建一个Buffer,大小为5,可以存放5个int
		IntBuffer intBuffer = IntBuffer.allocate(5);
		
//		//向buffer中存放数据, 可以是for循环来添加
//		intBuffer.put(11);
//		intBuffer.put(12);
//		intBuffer.put(13);
//		intBuffer.put(14);
//		intBuffer.put(15);
		
		//这是使用获取buffer容量的方法,capacity()
		for (int i = 0; i < intBuffer.capacity(); i++) {
			intBuffer.put(i * 2);
		}
		
		//如何从Buffer中获取数据呢? 这里使用flip()方法,进行读写切换
		intBuffer.flip();
		
		//hasRemaining()方法判断是否还有剩余的
		while (intBuffer.hasRemaining()){
			System.out.println(intBuffer.get());
		}
		
		
	}
}
