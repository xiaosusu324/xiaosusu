package com.zxjy.zoosystem.animals;

public class Cat extends Animal {
	public Cat() {}
	public Cat(int number, String name, String sex, String type, int clawKeen, double weight) {
		super(number, name, sex, type, weight); // 获取父类属性
		this.clawKeen = clawKeen; // 获取子类属性ֵ
	}

	private int clawKeen; // 爪子锋利程度

	public int getClawKeen() {
		return clawKeen;
	}

	public void setClawKeen(int clawKeen) {
		this.clawKeen = clawKeen;
	}

}
