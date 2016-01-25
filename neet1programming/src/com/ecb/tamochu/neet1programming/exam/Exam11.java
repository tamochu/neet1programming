package com.ecb.tamochu.neet1programming.exam;

public class Exam11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ソート
		// 以下はバブルソート(バブルソートについてはググること)の穴抜け実装である
		// 適宜コメント部を埋めプログラムを完成させよ
		int[] list = {4, 3, 8, 1};
		
		bubbleSort(list);
	}

	public static void bubbleSort(int[] list) {
		for (int i = 0; i < list.length; i++) {
			for (int n = list.length - 1; n > i; n--) {
				if (list[n] < list[n - 1]) {
					// 比較対象の数が一つ前より小さければ入れ替える。
					/* 入れ替えの処理を書くこと */
				}
			}
		}
		
		// 結果を表示
		for (int number : list) {
			System.out.print(number);
			System.out.print(",");
		}
		System.out.println();
	}
}
