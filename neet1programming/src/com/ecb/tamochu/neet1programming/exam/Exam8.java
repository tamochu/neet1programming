package com.ecb.tamochu.neet1programming.exam;

public class Exam8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 九九の答えを二次元配列に格納せよまた表示せよ
		int kuku[][] = new int [10][10];// 九九なので9*9で十分です
		for(int a = 1; a < 10; a++){// a <= 9 としましょう
			for (int b = 1;b < 10; b++){// b <= 9 としましょう
				kuku[a][b] = a*b;
			}
		}
		for(int a = 1; a < 10; a++){
			for(int b = 1; b < 10; b++){
				System.out.print(kuku[a][b]+" ");
			}
			System.out.println();
		}
	}
}
