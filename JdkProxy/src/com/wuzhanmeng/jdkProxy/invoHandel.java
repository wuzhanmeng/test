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
		System.out.println("������ʼ��ʻ������������������");		
		
		method.invoke(tag);
		
		long endTimer=System.currentTimeMillis();
		
		System.out.println("������ʻ��ϣ�     ��ʻʱ��"+(endTimer-startTime)+"����");
		
		return null;
	}

}
