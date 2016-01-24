package com.ecb.tamochu.neet1programming.exam;

public class Exam2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO fizzbuzz問題。
		// Q1.1～100の数字を表示しなさい。表示は↓の関数を使う
		
		// 全体的にもう少しスペースを入れましょう 「i=1」→「i = 1」等
		
		// 一行の場合もforは{}をつけたほうが良いです
		for (int i=1;i<101;i++)
		System.out.println(i);

		// Q2.1～100の数字を表示しつつ3の倍数なら「fizz」と表示しなさい。
		for (int i=1;i<101;i++){
			if (i%3 == 0){
				System.out.println("fizz");
			} else System.out.println(i);
			// else句も一行であっても{}をつけたほうが良いです

		}


		// Q3.1～100の数字を表示しつつ5の倍数なら「buzz」と表示しなさい。
		for (int i=1;i<101;i++){
			if (i%5==0){
				System.out.println("buzz");
			}else{
				System.out.println(i);
			}
		}

		// Q4.1～100の数字を表示しつつ3の倍数なら「fizz」5の倍数なら「buzz」3と5の倍数なら「fizzbuzz」と表示しなさい。
		for (int i=1;i<101;i++){
			if (i%3==0 && i%5==0){
				System.out.println("fizzbuzz");
			}else if (i%3==0){
				System.out.println("fizz");
			}else if (i%5==0){
				System.out.println("buzz");
			}else{
				System.out.println(i);
			}
		}

	}

}
