package com.wuzhanmeng.cjProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class cjlibProxy implements MethodInterceptor {

	 Enhancer enhancer =new Enhancer();
	 
	public Object getProxy(Class<?> cls){
		
		
		//���ô���������ࣨĿ���ࣩ
		enhancer.setSuperclass(cls);
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	/**
	 * ��������Ŀ����ķ����ĵ���
	 */
	@Override
	public Object intercept(Object obj, Method arg1, Object[] arg2, MethodProxy proxy) throws Throwable {
		
		System.out.println("xxxxxxxxxx");
		
		proxy.invokeSuper(obj, arg2);
		
		System.out.println("dddddddddddd");
		return null;
	}

}
