package com.ecb.tamochu.neet1programming;

public class Sudoku {
	int sudoku[][] = new int[9][9];
	/** sudokuはメンバーに持つようにしました。 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sudoku sudokuInstance = new Sudoku();
		// メンバーとして持っているのでSudokuクラスをインスタンスとして生成します。

		/**
		 * 課題：初期化部分をコンストラクタに入れなさい
		 */

		// 初期化部分ここから
		for (int x = 0; x < 9; x++) {
			for (int y = 0; y < 9; y++) {
				sudokuInstance.sudoku[x][y] = 0;
			}
		}
		// 初期化部分ここまで

		// データ
		sudokuInstance.sudoku[0][1] = 8;
		sudokuInstance.sudoku[0][2] = 3;
		sudokuInstance.sudoku[0][4] = 5;
		sudokuInstance.sudoku[0][5] = 1;
		sudokuInstance.sudoku[0][6] = 7;
		sudokuInstance.sudoku[0][7] = 4;
		sudokuInstance.sudoku[0][8] = 6;

		sudokuInstance.sudoku[1][1] = 6;
		sudokuInstance.sudoku[1][5] = 8;
		sudokuInstance.sudoku[1][8] = 1;

		sudokuInstance.sudoku[2][3] = 7;
		sudokuInstance.sudoku[2][8] = 9;

		sudokuInstance.sudoku[3][0] = 1;
		sudokuInstance.sudoku[3][2] = 9;
		sudokuInstance.sudoku[3][3] = 2;
		sudokuInstance.sudoku[3][4] = 8;
		sudokuInstance.sudoku[3][6] = 4;
		sudokuInstance.sudoku[3][8] = 5;

		sudokuInstance.sudoku[4][1] = 7;
		sudokuInstance.sudoku[4][3] = 4;
		sudokuInstance.sudoku[4][4] = 9;
		sudokuInstance.sudoku[4][7] = 2;
		sudokuInstance.sudoku[4][8] = 3;

		sudokuInstance.sudoku[5][0] = 5;
		sudokuInstance.sudoku[5][1] = 2;
		sudokuInstance.sudoku[5][5] = 6;

		sudokuInstance.sudoku[6][0] = 3;
		sudokuInstance.sudoku[6][1] = 4;
		sudokuInstance.sudoku[6][3] = 5;
		sudokuInstance.sudoku[6][4] = 2;
		sudokuInstance.sudoku[6][5] = 9;
		sudokuInstance.sudoku[6][6] = 6;
		sudokuInstance.sudoku[6][8] = 7;

		sudokuInstance.sudoku[7][0] = 7;
		sudokuInstance.sudoku[7][2] = 5;
		sudokuInstance.sudoku[7][3] = 6;
		sudokuInstance.sudoku[7][4] = 1;
		sudokuInstance.sudoku[7][6] = 3;
		sudokuInstance.sudoku[7][7] = 8;

		sudokuInstance.sudoku[8][0] = 6;
		sudokuInstance.sudoku[8][1] = 1;
		sudokuInstance.sudoku[8][2] = 2;
		sudokuInstance.sudoku[8][3] = 8;
		sudokuInstance.sudoku[8][7] = 9;
		sudokuInstance.sudoku[8][8] = 4;

		sudokuInstance.print();
		Sudoku.printState(sudokuInstance);
		// ちなみにこのSudoku.はクラス内の記述なので省略できます。
		// printState(sudokuInstance);
	}

	/**
	 * メンバー関数print。
	 * メンバーなのでメンバー変数にアクセスできます。
	 */
	public void print(){
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

	/**
	 * スタティック関数printState。
	 * スタティック関数は引数として与えられたものしか
	 * 基本的にはアクセスできません。
	 * @param instance
	 */
	public static void printState(Sudoku instance){
		System.out.println("+---------+");
		for(int a = 0; a < instance.sudoku.length; a++){
			System.out.print("|");
			for(int b = 0; b < instance.sudoku[a].length; b++){
				if(instance.sudoku[a][b] != 0){
					System.out.print(instance.sudoku[a][b]);
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

