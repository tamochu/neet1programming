package com.ecb.tamochu.neet1programming.exam.original;

public class Exam12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ソート
		// 以下は選択ソート(選択ソートについてはググること)の穴抜け実装である
		// 適宜コメント部を埋めプログラムを完成させよ
		int[] list = {4, 3, 8, 1};

		selectionSort(list);
	}

	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int min = list[i];
			int min_pos = i;
			for (int n = i + 1; n < list.length; n++) {
				if (/* minより小さい値があれば */) {
					/* minとmin_posをその値に変える */
				}
			}
			/* 最小の値とi番目の値を入れ替える */
		}

		// 結果を表示
		for (int number : list) {
			System.out.print(number);
			System.out.print(",");
		}
		System.out.println();
	}
}
