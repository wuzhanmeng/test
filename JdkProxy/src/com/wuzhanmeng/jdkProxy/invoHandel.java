package com.wuzhanmeng.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class invoHandel implements InvocationHandler {

	private Object tag;

	public invoHandel(Object tag) {
		super();
		this.tag=tag;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long startTime =System.currentTimeMillis();
		System.out.println("汽车开始行驶。。。。。。。。。");		
		
		method.invoke(tag);
		
		long endTimer=System.currentTimeMillis();
		
		System.out.println("汽车行驶完毕，     行驶时间"+(endTimer-startTime)+"毫秒");
		
		return null;
	}

}
