package com.ecb.tamochu.neet1programming;

public class PrintUtil {

	public static void printName(Human x) {
		System.out.println(Student.name);

	}
	public static void printName(Teacher x){
		System.out.println("Mr." + Teacher.name);
		
	}
	Student student = new Student();
	student.name = "takesi";
	PrintUtil.printName(student);

}
