package com.zxjy.zoosystem.zoo;

import java.util.Scanner;

import com.zxjy.zoosystem.animals.Animal;
import com.zxjy.zoosystem.animals.AnimalArr;
import com.zxjy.zoosystem.animals.Cat;
import com.zxjy.zoosystem.animals.Dog;

public class AnimalHome {
	
	public static void start() {
		System.out.println("--------欢迎来到动物园管理系统--------");
		System.out.println("\t由特仑苏有机奶为您服务，我们的系统功能如下：");
		System.out.println("--------------------------------------------------");
		System.out.println("\t1.添加小动物信息;\t\t2.删除小动物信息;\n"
				+ "\t3.显示小动物信息;\t\t4.查询小动物信息\n"
				+ "\t5.给动物喂养食物");
		System.out.println("请管理员大人输入您要进行的操作所对应的编号：");
		AnimalArr a = new AnimalArr();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println("请输入您要加入的动物编号\n"
					+ "1--“小猫”,2--“小狗”");
			int n1 = sc.nextInt();
			if (n1==1) {
				Cat c = new Cat();
				System.out.println("请您 输入小猫的信息：");
				System.out.println("请输入编号：");
				int number = sc.nextInt();
				c.setNumber(number);
				System.out.println("请输入姓名：");
				String name = sc.next();
				c.setName(name);
				System.out.println("请输入性别：");
				String sex = sc.next(); // 输入性别
				c.setSex(sex);
				System.out.println("请输入品种：");
				String type = sc.next();
				c.setType(type);
				System.out.println("请输入体重：");
				double weight = sc.nextDouble();
				c.setWeight(weight);
				System.out.println("请输入爪子锋利程度：");
				int clawKeen = sc.nextInt();
				c.setClawKeen(clawKeen);
				a.animalAdd(c);
			}
			else if (n==2) {
				Dog d = new Dog();
		 		System.out.println("请您 输入狗狗的信息：");
				System.out.println("请输入编号：");
				int number1 = sc.nextInt();
				d.setNumber(number1);
				System.out.println("请输入姓名：");
				String name1 = sc.next();
				d.setName(name1);
				System.out.println("请输入性别：");
				String sex1 = sc.next(); // 输入性别
				d.setSex(sex1);
				System.out.println("请输入品种：");
				String type1 = sc.next();
				d.setType(type1);
				System.out.println("请输入体重：");
				double weight1 = sc.nextDouble();
				d.setWeight(weight1);
				System.out.println("请输入牙齿锋利程度：");
				int clawKeen1 = sc.nextInt();
				d.setToothKeen(clawKeen1);
				a.animalAdd(d);
			}
		}
		else if (n==2) {
			System.out.println("请输入您要删除小动物的编号：");
			int number = sc.nextInt();
			Animal animals = a.deleteAnimal(number);
				if (animals instanceof Cat) {
					animals = new Cat();
					System.out.println(animals);
			}
				else if (animals instanceof Dog) {
					animals = new Dog();
					System.out.println(animals);
			}
		}
		else if (n==3) {
			a.showAnimalMsg();
		}
		else if (n==4) {
			AnimalProtector ap = new AnimalProtector();
			Object ob = ap.discoverAnimal();
			System.out.println(ob);
		}
		else if (n==5) {
			AnimalFeeder af = new AnimalFeeder();
			af.feedAnimal();
		}
		
		
			
	}
}
