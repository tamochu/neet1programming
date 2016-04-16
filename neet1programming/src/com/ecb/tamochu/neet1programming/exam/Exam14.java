package com.ecb.tamochu.neet1programming.exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exam14 {
	static int answer;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO CUI対話式ゲーム
		// @see http://okwave.jp/qa/q7308996.html
		// 下のcalc関数を以下の挙動ができるようにしなさい。（上から順に実装すること）
		// 1.「bye」と入力したらプログラムを終了する。
		// 2．それ以外の文字を入力したら「Hello (入力した文字)」と表示する。
		// 3．数を入力したら（1桁前提でよい）数あてモードとなり、answerより小さい場合は「small」、answerより大きい場合は「big」answerと同じなら「equal」と表示する。
		// 4.「change」を入力したもしくは数を当てた場合「new game」と表示し、answerに抵当な1桁の数を入れる。

		answer = 5;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("INPUT : ");
			String line;
			while ((line = br.readLine()) != null) { // ユーザの一行入力を待つ
				if (calc(line)) {
					break;
				}
			}
			br.close();
		} catch (Exception e) {
			e.getStackTrace();
			System.exit(-1); // プログラムを終了
		}
		System.out.println("bye");
	}

	/**
	 * 処理本体。
	 * @param line 入力k文字列
	 * @return 終了するときはtrueそれ以外ならfalse。
	 */
	private static boolean calc(String line) {
		// 文字列の比較には絶対==は使いません。equalsメソッドを呼びましょう。
		if (line.equals("bye")) {
			// breakはループ中で使う予約語です。
			// この関数内ではループを抜けたいときはtrueを返します。
			return true;
		}else if(line.equals("0")|| line.equals("1")||line.equals("2")|| line.equals("3")||line.equals("4")|| line.equals("5")||line.equals("6")|| line.equals("7")||line.equals("8")|| line.equals("9")){
			if(line.equals > answer){
				System.out.println("small");
			}
				
	
		// ヒントここにelse ifを加えますが1桁の数字前提なので
		// } else if(line.equals("0") || line.equals("1") || …) {
		// と書いてしまって構いません。
		} else {
			// lineを表示しましょう。
			System.out.println("Hello" + line);
		}

		return false;
	}
}
