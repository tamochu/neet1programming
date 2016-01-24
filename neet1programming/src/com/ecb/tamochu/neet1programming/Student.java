package com.ecb.tamochu.neet1programming;

public class Student extends Human {
	int grade;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student[] students = new Student[3];

		Student takesi = new Student();
		takesi.name = "takesi";
		takesi.grade = 1;
		students[0] = takesi;

		Student john = new Student();
		john.name = "john";
		john.grade = 2;
		students[1] = john;

		Student suzuki = new Student();
		suzuki.name = "suzuki";
		suzuki.grade = 3;
		students[2] = suzuki;

		shoukai(students);
	}

	/**
	 * 自己紹介関数。
	 * @param students
	 */
	public static void shoukai(Student[] students) {
		for (Student student : students) {
			System.out.println(student.getName());
		}
	}
}
