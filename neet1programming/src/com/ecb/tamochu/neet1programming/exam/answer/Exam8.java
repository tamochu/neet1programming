package com.ecb.tamochu.neet1programming.exam.answer;

public class Exam8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 九九の答えを二次元配列に格納せよまた表示せよ
		int kuku[][] = new int [9][9];
		for(int a = 1; a <= 9; a++){
			for (int b = 1;b <= 9; b++){
				kuku[a - 1][b - 1] = a*b;
			}
		}
		for(int a = 0; a < kuku.length; a++){
			for(int b = 0; b < kuku[a].length; b++){
				System.out.print(kuku[a][b]+" ");
			}
			System.out.println();
		}

	}
}
