package com.wuzhanmeng.jdkProxy;

public class Car implements moveHandel {

	@Override
	public void move() {

		try {
			Thread.sleep(500);
			System.out.println("汽车正在行驶。。。。。。。。");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
