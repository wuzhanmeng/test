package com.wuzhanmeng.jdkProxy;

public class Car implements moveHandel {

	@Override
	public void move() {

		try {
			Thread.sleep(500);
			System.out.println("����������ʻ����������������");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
