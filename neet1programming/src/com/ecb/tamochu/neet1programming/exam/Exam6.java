package com.ecb.tamochu.neet1programming.exam;

public class Exam6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 関数hogeは何をしている関数か答えよ
		//1~nの総和を求める関数
		// 正解。再帰関数と呼ばれるものでプログラムを書く量が抑えられる場合があります。
		System.out.println(hoge(100));
	}

	/**
	 * 関数hoge
	 * @param foo
	 * @return
	 */
	public static int hoge (int foo) {
		if (foo <= 0) {
			return 0;
		}
		return foo + hoge(foo - 1);
	}
}
