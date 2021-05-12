package com.zxjy.zoosystem.zoo;

import java.util.Random;

import com.zxjy.zoosystem.animals.AnimalArr;
import com.zxjy.zoosystem.animals.Cat;
import com.zxjy.zoosystem.animals.Dog;

public class AnimalFeeder {
	
	public void feedAnimal() {
		AnimalArr a = new AnimalArr(); // 创建动物方法对象
		Random rd = new Random(); // 创建随机数对象
		for (int i = 0; i < a.animal.length; i++) {
			if (a.animal[i] != null) {
				if (a.animal[i] instanceof Cat) { // 判断是否为猫类型
					if (a.animal[i].getWeight() <= 30) { // 获取当前体重
						a.animal[i].setWeight(a.animal[i].getWeight()+rd.nextInt(3)+0.5);
						System.out.println("给"+a.animal[i].getName()+"猫猫喂养成功，它现在的体重是"+a.animal[i].getWeight());	
					}
					else
						System.out.println("小猫体重已经超过30了，请不要在继续喂食了，太胖了就不好看了");
				}
				else if(a.animal[i] instanceof Dog) {
					if (a.animal[i].getWeight() <= 50) {
						a.animal[i].setWeight(a.animal[i].getWeight()+rd.nextInt(3)+2.5);
					System.out.println("给"+a.animal[i].getName()+"狗狗喂养成功，它现在的体重是"+a.animal[i].getWeight());
					}
					else
						System.out.println("小狗体重已经超过50了，请不要在继续喂食了，太胖了就不好看了");
				}
			}
		}
	}
}
