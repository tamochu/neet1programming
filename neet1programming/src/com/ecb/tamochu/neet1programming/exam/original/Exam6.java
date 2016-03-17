package com.ecb.tamochu.neet1programming.exam.original;

public class Exam6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 関数hogeは何をしている関数か答えよ
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
