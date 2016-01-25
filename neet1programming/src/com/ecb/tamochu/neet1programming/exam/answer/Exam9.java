package com.ecb.tamochu.neet1programming.exam.answer;

public class Exam9 {
	String name;
	int age;
	public void setName(String newname){
		name = newname;
	}
	public String getName(){
		return name;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO このクラスを何かのオブジェクトにしなさい
		// ただしこのクラスにはname変数（メンバー）を持ち
		// getNameメソッド（関数）から取得できるようにすること
		// またsetNameメソッド（関数）からname変数を変更できるようにすること
		// クラス名はExam9のままでよい

		Exam9[] persons = new Exam9[2];

		Exam9 takesi = new Exam9();
		takesi.setName("takesi");
		persons[0] = takesi;

		Exam9 john = new Exam9();
		john.setName("john");
		persons[1] = john;

		hyouji(persons);

	}
	public static void hyouji (Exam9[] persons){
		for (Exam9 person : persons){
			System.out.println(person.getName());
		}
	}

}
