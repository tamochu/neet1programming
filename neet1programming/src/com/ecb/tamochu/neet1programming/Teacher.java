package com.ecb.tamochu.neet1programming;

public class Teacher {
	String subject;
	String name;
	
	String getSubject() {
		return "おはようございます。" + subject + "の授業を始めます";
	}
	
	public static void main(String[] args) {
		Teacher[] teachers = new Teacher[3];
		
		Teacher takesi = new Teacher();
		takesi.name = "takesi";
		takesi.subject = "数学";
		teachers[0] = takesi;
		
		Teacher john = new Teacher();
		john.name = "john";
		john.subject = "国語";
		teachers[1] = john;
		
		Teacher suzuki = new Teacher();
		suzuki.name = "suzuki";
		suzuki.subject = "理科";
		teachers[2] = suzuki;
		
		aisatsu(teachers);
	}
	public static void aisatsu(Teacher[] teachers){
		for (Teacher teacher : teachers){
			System.out.println(teacher.getSubject());
		}
	}

}
