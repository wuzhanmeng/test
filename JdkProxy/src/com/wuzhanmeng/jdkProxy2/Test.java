package com.wuzhanmeng.jdkProxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		
		Car car =new Car();
		
		Class<?> cls =car.getClass();
		
		InvocationHandler h =new CarPoxy(car);
		
		CarInter c =(CarInter) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
		c.move();
	}
}
