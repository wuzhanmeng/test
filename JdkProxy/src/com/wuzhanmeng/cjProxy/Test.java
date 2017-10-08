package com.wuzhanmeng.cjProxy;

public class Test {

	public static void main(String[] args) {
		
		cjlibProxy proxy=new cjlibProxy();
		Car car=(Car)proxy.getProxy(Car.class);
		car.move();
	}

}
