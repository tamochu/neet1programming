package com.ecb.tamochu.neet1programming.exam;

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
				if (list[n] < min){
					/* 比較するのはlist[i]でなくlist[n]です */
					min = list[n];
					/* minはlist[n]になります */
					min_pos = n;
					/* min_posはnになります */
				}

			}
			list[i] = min_pos;

			/* 最小の値とi番目の値を入れ替える */
//			int tmp = list[i];
//			list[i] = min;
//			list[min_pos] = tmp;
			// ここはi番目の数とmin_pos番目の数を入れ替えましょう。minはもう使いません




		}

		// 結果を表示
		for (int number : list) {
			System.out.print(number);
			System.out.print(",");
		}
		System.out.println();
	}
}
