package com.wuzhanmeng.jdkProxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CarPoxy implements InvocationHandler {

	private Object tag;
	
	
	
	public CarPoxy(Object tag) {
		super();
		this.tag = tag;
	}



	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("aaaaaaaaaaa1111111");
		
		method.invoke(tag);
		
		System.out.println("bbbbbbbbbbb");
		
		return null;
	}

}
