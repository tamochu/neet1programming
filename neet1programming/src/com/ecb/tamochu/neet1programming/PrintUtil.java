package com.ecb.tamochu.neet1programming;

public class PrintUtil {

	public static void printName(Human x) {
//		System.out.println(Student.name);
		// 引数のxにアクセスしましょう
		System.out.println(x.name);

	}
	public static void printName(Teacher x){
//		System.out.println("Mr." + Teacher.name);
		// 引数のxにアクセスしましょう
		System.out.println("Mr." + x.name);

	}
//	Student student = new Student();
//	student.name = "takesi";
//	PrintUtil.printName(student);
	// main関数の中で処理しましょう。今回はPrintTestクラスを作りました。

}
