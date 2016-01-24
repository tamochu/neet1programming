package com.ecb.tamochu.neet1programming.exam;

public class Exam5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 1～100の中の素数を配列に入れたのち表示しなさい
		// 演算子の間にもスペースを入れるようにすると見やすいです。
		// 「i/2」→「i / 2」
		boolean a; // なるべく何を意味する変数かわかる変数名にしましょうisSosu等
		for (int i = 2; i <= 100; i++){
			a = true;
			for(int b = 2; b <= i/2; b++){ // i/2までとしたのは良いですね
				if(i%b == 0){
					a = false;
					break;
				}
			}
			if (a){
				int [] sosu = {i};
				for(int nsosu : sosu){// 拡張for文を使ったのはとても良いです
					System.out.print(nsosu + " ");
				}
			}
		}
	}

}
