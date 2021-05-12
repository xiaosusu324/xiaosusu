package com.zxjy.zoosystem.animals;

public class Dog extends Animal {
	public Dog() {}
	public Dog(int number, String name, String sex, String type, int toothKeen, double weight) {
		super(number, name, sex, type, weight); // 获取父类属性
		this.toothKeen = toothKeen;
	}

	private int toothKeen; // 爪子锋利程度

	public int getToothKeen() {
		return toothKeen;
	}

	public void setToothKeen(int toothKeen) {
		this.toothKeen = toothKeen;
	}
}
