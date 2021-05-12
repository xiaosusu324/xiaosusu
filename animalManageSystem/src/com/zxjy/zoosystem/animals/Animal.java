package com.zxjy.zoosystem.animals;
/**
 * 动物类，父类，抽象类
 */
public abstract class Animal {
	public Animal(){}
	public Animal(int number, String name, String sex, String type, double weight) {
		this.number = number;
		this.name = name;
		this.sex = sex;
		this.type = type;
		this.weight = weight;
	}
	private int number; // 编号
	private String name; // 姓名
	private String sex; // 性别
	private String type; // 品种
	private double weight; // 体重
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
