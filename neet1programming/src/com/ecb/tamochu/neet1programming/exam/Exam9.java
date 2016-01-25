package com.ecb.tamochu.neet1programming.exam;

public class Exam9 {
	String name;
	int age;
	// おそらくググったものを参考にしたのでしょうが
	// publicはアクセス修飾子といいます。細かい説明はのちほど行います
	// 今のところつけてもつけなくても問題ありませんがここにpublicをつけたのはとても良いです
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
		takesi.name = "takesi";// せっかく作ったsetNameメソッドを使いましょう
		persons[0] = takesi;

		Exam9 john = new Exam9();
		john.name = "john";// 同上
		persons[1] = john;

		hyouji(persons);

	}
	public static void hyouji (Exam9[] persons){
		for (Exam9 person : persons){
			System.out.println(person.getName());
		}
	}

}
