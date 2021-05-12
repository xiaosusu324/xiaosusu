package com.zxjy.zoosystem.adopter;

import java.util.Random;

public class AdopterFactory {	
	public static Random rd = new Random(); // 实例化Random类
	 // 随机生成随机数
	public Object newAdopter() {
		Object ob = null; // 定义一个超类接收
		//Random rd = new Random(); // 实例化Random类
		int num = rd.nextInt(3); // 生成随机数
		switch (num) { // 循环确定返回类名
		case 0:
			Worker wor = (Worker) ob;
			return wor; // 返回工人类
		case 1:
			Farmer far = (Farmer) ob;
			return far; // 返回农名类
		case 2:
			Civiler civ = (Civiler) ob;
			return civ; // 返回公务员类
		default:
			return ob;
		}
	} 



}

