package com.zxjy.zoosystem.animals;

import java.util.Iterator;

public class AnimalArr {
	
	public static Animal[] animal = new Animal[10];
	
	// 统计已经放了多少只动物
	public int animalCount() {
		int num = 0;
		for (int i = 0; i < animal.length; i++) {
			if(animal[i] != null) {
				num++;
			}
		}
		return num;
	}
	// 可以往里面加入动物(只要是动物就可以)
	public static void animalAdd(Cat a) {
		for (int i = 0; i < animal.length; i++) {
			if (animal[i] == null) {
				animal[i] = a;
				System.out.println(a.getName()+"小猫信息添加成功");
				break;
			}
		}
		
	}
	public static void animalAdd(Dog a) {
		for (int i = 0; i < animal.length; i++) {
			if (animal[i] == null) {
				animal[i] = a;
				System.out.println(a.getName()+"狗狗信息添加成功");
				break;
			}
		}
		
	}
	
	// 可以删除动物，删除后返回被删除的动物信息
	public Animal deleteAnimal(int number) {
		Animal a = new Cat();
		for (int i = 0; i < animal.length; i++) { 
			if (animal[i] != null && animal[i].getNumber() == number) {
				a = animal[i];
				animal[i] = null;
			}
		}
		return a;
	}
	// 将所有动物信息打印出来
	public void showAnimalMsg() {
		String str = null; // 这里最好用StringBffer 拼接效率更高
		for (int i = 0; i < animal.length; i++) {
			if (animal[i] != null) {
				
				if (animal[i] instanceof Cat) { // 判断是否为猫
					Cat c = (Cat) animal[i];
					str = "编号："+c.getNumber()+"\t"+"姓名：" + c.getName() +"\t"+"性别："+c.getSex()+"\t"
					+"品种："+c.getType()+"\t体重"+c.getWeight()+"\t爪子锋利程度"+c.getClawKeen();
					
				}
				else if (animal[i] instanceof Dog){ // 判断是否为狗
					Dog d = (Dog) animal[i];
					str = "编号："+d.getNumber()+"\t"+"姓名：" + d.getName() +"\t"+"性别："+d.getSex()+"\t"
					+"品种："+d.getType()+"\t体重"+d.getWeight()+"\t爪子锋利程度"+d.getToothKeen(); 
				}
			}
			System.out.println(str); // 输出
		}
	}
}
