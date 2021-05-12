package com.zxjy.zoosystem.zoo;

import java.util.Scanner;

import com.zxjy.zoosystem.adopter.AdopterFactory;
import com.zxjy.zoosystem.animals.AnimalArr;
import com.zxjy.zoosystem.animals.Cat;
import com.zxjy.zoosystem.animals.Dog;

/**
 * 动物保护者
 */
public class AnimalProtector {

	public Object discoverAnimal() {
		
		int n = new AdopterFactory().rd.nextInt(2)+1; // 调用领养者类中的随机对象
		AnimalArr a = new AnimalArr(); // 创建动物管理对象
		Scanner sc = new Scanner(System.in); // 创建扫描器对象
		Object ob = null; // 定义一个超类接收
//		switch (n) {
//		case 1:
//			Cat c = new Cat();
//			System.out.println("请您 输入小猫的信息：");
//			System.out.println("请输入编号：");
//			int number = sc.nextInt();
//			c.setNumber(number);
//			System.out.println("请输入姓名：");
//			String name = sc.next();
//			c.setName(name);
//			System.out.println("请输入性别：");
//			String sex = sc.next(); // 输入性别
//			c.setSex(sex);
//			System.out.println("请输入品种：");
//			String type = sc.next();
//			c.setType(type);
//			System.out.println("请输入体重：");
//			double weight = sc.nextDouble();
//			c.setWeight(weight);
//			System.out.println("请输入爪子锋利程度：");
//			int clawKeen = sc.nextInt();
//			c.setClawKeen(clawKeen);
//			a.animalAdd(c);
//		
//			break;
//		case 2:
//			Dog d = new Dog();
//			System.out.println("请您 输入狗狗的信息：");
//			System.out.println("请输入编号：");
//			int number1 = sc.nextInt();
//			d.setNumber(number1);
//			System.out.println("请输入姓名：");
//			String name1 = sc.next();
//			d.setName(name1);
//			System.out.println("请输入性别：");
//			String sex1 = sc.next(); // 输入性别
//			d.setSex(sex1);
//			System.out.println("请输入品种：");
//			String type1 = sc.next();
//			d.setType(type1);
//			System.out.println("请输入体重：");
//			double weight1 = sc.nextDouble();
//			d.setWeight(weight1);
//			System.out.println("请输入牙齿锋利程度：");
//			int clawKeen1 = sc.nextInt();
//			d.setToothKeen(clawKeen1);
//			a.animalAdd(d);
//			break;
//
//		default:
//			break;
//		}
	
		switch (n) {
		case 1:
			Cat c = new Cat();
			System.out.println("请您 输入小猫的信息：");
			System.out.println("请输入编号：");	
			int number = sc.nextInt();
			c.setNumber(number);
			for (int i = 0; i < a.animal.length; i++) {
				if (a.animal[i] != null && a.animal[i].getNumber() == number) {
						return c;		
				}
			}
			return ob;
		case 2:
			Dog d = new Dog();
			System.out.println("请您 输入小猫的信息：");
			System.out.println("请输入编号：");	
			int number1 = sc.nextInt();
			d.setNumber(number1);
			for (int i = 0; i < a.animal.length; i++) {
				if (a.animal[i] != null && a.animal[i].getNumber() == number1) {
						return d;		
				}
			}
			return ob;

		default:
			return ob;
		}
		
	}
	
	
	
}
