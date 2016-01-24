package com.ecb.tamochu.neet1programming.exam.answer;

public class Exam6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 関数hogeは何をしている関数か答えよ
		System.out.println(sum(100));
	}

	/**
	 * 1から引数までの和を返す再帰関数。
	 * @param till
	 * @return
	 */
	public static int sum (int till) {
		if (till <= 0) {
			return 0;
		}
		return till + sum(till - 1);
	}
}
