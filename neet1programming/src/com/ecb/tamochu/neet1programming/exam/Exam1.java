package com.ecb.tamochu.neet1programming.exam;

public class Exam1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ここで1から100を計算する。
		int sum;
		sum = 0; // 宣言と初期化をまとめて int sum = 0;でも可
		for(int i=1;i<101;i++){ // i <= 100としましょう
			sum = sum + i; // sum += i;でも可
		}
		System.out.println(sum);

	}

}
