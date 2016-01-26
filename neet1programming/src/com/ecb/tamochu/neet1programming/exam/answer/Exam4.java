package com.ecb.tamochu.neet1programming.exam.answer;

public class Exam4 {
	static final char[] chars = {
		'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' ','.',',','-'
	};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 配列の操作Caesar暗号（穴埋め）
		// 以下の文字列はシーザー暗号である
		// 使われる文字は「abcdefghijklmnopqrstuvwxyz .,-」である
		// 文字中に「person」が含まれることが分かっている
		// 暗号を解読せよ
		// ところどころ必要な処理が抜けているので考えて埋めること
		char[] angou = {'q','d','q','-','g','i','.','q','-','a',' ','z','i','a','t','m','x','x','i','t','m','d','q','i','b','t','q','i','-','u','s','t','b','i',' ','r','i','.','q','m','o','q','r','c','x','i','.','q','b','u','b','u',' ','z','i','r',' ','-','i','b','t','q','i','-','q','p','-','q','a','a','i',' ','r','i','p','m','y','m','s','q','k','i','r',' ','-','i','b','t','q','i','-','q','y',' ','d','m','x','i',' ','r','i','.','c','n','x','u','o','i',' ','r','r','u','o','u','m','x','a','k','i','r',' ','-','i','b','t','q','i','q','z','m','o','b','y','q','z','b','k','i','i','-','q','.','q','m','x','i',' ','-','i','m','y','q','z','p','y','q','z','b','i',' ','r','i','x','m','e','a','k','i',' ','-','p','u','z','m','z','o','q','a','i',' ','-','i','-','q','s','c','x','m','b','u',' ','z','a','i','m','z','p','i','r',' ','-','i',' ','b','t','q','-','i','y','m','b','b','q','-','a',';','i','z',' ','-','i','a','t','m','x','x','i','m','z','g','i','.','q','-','a',' ','z','i','n','q','i','u','z','i','m','z','g','i','e','m','g','i','p','u','a','o','-','u','y','u','z','m','b','q','p','i','m','s','m','u','z','a','b','i','r',' ','-','i','a','.',' ','z','a',' ','-','u','z','s','i','a','c','o','t','i','i','m','i','.','q','b','u','b','u',' ','z','j'};

		// ずらす文字数を0～文字の数だけ回す
		for (int x = 0; x < chars.length; x++) {
			// angouと同じ長さのintの配列を用意する
			int[] indexes = new int[angou.length];

			// angouをすべて何番目の文字かというintの配列に直す
			for (int i = 0; i < angou.length; i++) {
				indexes[i] = (charToIndex(angou[i]) + x) % chars.length;
			}

			// intの配列を文字の配列に直す
			char[] hukugou = new char[angou.length];
			for (int i = 0; i < indexes.length; i++) {
				hukugou[i] = indexToChar(indexes[i]);
			}

			// Stringに格納する
			String newString = String.valueOf(hukugou);
			// 文字列中に「person」が含まれたら正解の文字列
			if (newString.indexOf("person") != -1) {
				// 正解の文字列を出力する。
				System.out.println(newString);
			}
		}


	}

	/**
	 * 渡された文字が何番目の文字か返す関数。
	 * @param c
	 * @return
	 */
	public static int charToIndex(char c) {
		for (int index = 0; index < chars.length; index++) {
			if (c == chars[index]) {
				return index;
			}
		}
		return 0;
	}

	/**
	 * 渡された数番目の文字を返す関数。
	 * @param index
	 * @return
	 */
	public static char indexToChar(int index) {
		return chars[index];
	}
}
