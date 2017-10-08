package com.wuzhanmeng.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class test {
public static void main(String[] args) {
	Car car=new Car();
	InvocationHandler handler =new invoHandel(car);
	Class<?> cls=car.getClass();
//	car.move();
	 moveHandel m=(moveHandel) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),handler);
	 m.move();
}
}
