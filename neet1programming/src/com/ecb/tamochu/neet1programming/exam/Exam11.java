package com.ecb.tamochu.neet1programming.exam;

public class Exam11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ソート
		// 以下はバブルソート(バブルソートについてはググること)の穴抜け実装である
		// 適宜コメント部を埋めプログラムを完成させよ
		//数値のソートとは？...複数の数値から成る列を、何らかの順序性に基いて順番通りになるよう並べ替えること。
		//小さい順に並べる...4,3を比較する4<3 4,8を比較する4<8 4,1を比較する4>1この時点で8<4<1,3 1,3を比較する1<3よって8<4<3<1
		//ソートの実装方法...1.隣り合う要素の代償を比較しながら整列させる2.配列された要素から、最大値やまたは最小値を探索し配列最後の要素と入れ替えをおこなう3.ピボットと呼ぶ要素を軸に分割を繰り返して整列を行う
		int[] list = {4, 3, 8, 1};
		
		bubbleSort(list);
	}

	public static void bubbleSort(int[] list) {
		for (int i = 0; i < list.length; i++) {
			for (int n = list.length - 1; n > i; n--) {
				if (list[n] < list[n - 1]) {
					// 比較対象の数が一つ前より小さければ入れ替える。
					/* 入れ替えの処理を書くこと */
					if(list[n] < list[n-1]){
						int t = list[n];
						list[n] = list[n-1];
						list[n-1] = t; 
					}
					
					
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
