package com.ecb.tamochu.neet1programming.exam;

public class Exam10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 数独は9×9のマスに一定の規則で数字を埋めるクイズである
		// Q1.数独のマスの状態を作りなさい
		// ただし数字はintの1～9、空欄はintの0で表すものとする
		int sudoku[][] = new int[9][9];
//		for(int a = 1; a <=9; a++){
//			for(int b = 1; b <= 9; b++){
//
//			}
//		}
		// 初期化は0～(9-1)にアクセスして行います。
		for (int x = 0; x < 9; x++) {
			for (int y = 0; y < 9; y++) {
				sudoku[x][y] = 0;
			}
		}

		for(int a = 0; a < sudoku.length; a++){
			for(int b = 0; b < sudoku[a].length; b++){
				System.out.print(sudoku[a][b] + " ");
			}
			System.out.println();
		}


		// Q2.Q1で作成した状態を表示しなさい
		// 表示は以下のような状態になること
		// +---------+
		// | 83 51746|
		// | 6   8  1|
		// |   7    9|
		// |1 928 4 5|
		// | 7 49  23|
		// |52   6   |
		// |34 5296 7|
		// |7 561 38 |
		// |6128   94|
		// +---------+
	}

}
