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

		// データ
		sudoku[0][1] = 8;
		sudoku[0][2] = 3;
		sudoku[0][4] = 5;/* ここに適切な数字を入れる */;
		sudoku[0][5] = 1;
		sudoku[0][6] = 7;
		sudoku[0][7] = 4;
		sudoku[0][8] = 6;

		sudoku[1][1] = 6;
		sudoku[1][5] = 8;
		sudoku[1][8] = 1;

		sudoku[2][3] = 7;
		sudoku[2][8] = 9;

		sudoku[3][0] = 1;
		sudoku[3][2] = 9;
		sudoku[3][3] = 2;
		sudoku[3][4] = 8;
		sudoku[3][6] = 4;
		sudoku[3][8] = 5;

		sudoku[4][1] = 7;
		sudoku[4][3] = 4;
		sudoku[4][4] = 9;
		sudoku[4][7] = 2;
		sudoku[4][8] = 3;

		sudoku[5][0] = 5;
		sudoku[5][1] = 2;
		sudoku[5][5] = 6;

		sudoku[6][0] = 3;
		sudoku[6][1] = 4;
		sudoku[6][3] = 5;
		sudoku[6][4] = 2;
		sudoku[6][5] = 9;
		sudoku[6][6] = 6;
		sudoku[6][8] = 7;

		sudoku[7][0] = 7;
		sudoku[7][2] = 5;
		sudoku[7][3] = 6;
		sudoku[7][4] = 1;
		sudoku[7][6] = 3;
		sudoku[7][7] = 8;

		sudoku[8][0] = 6;
		sudoku[8][1] = 1;
		sudoku[8][2] = 2;
		sudoku[8][3] = 8;
		sudoku[8][7] = 9;
		sudoku[8][8] = 4;

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
		System.out.println("+---------+");

		for(int a = 0; a < sudoku.length; a++){
			System.out.print("|");
			for(int b = 0; b < sudoku[a].length; b++){
				if(sudoku[a][b] != 0){
					System.out.print(sudoku[a][b]);
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println("+---------+");
	}

}
