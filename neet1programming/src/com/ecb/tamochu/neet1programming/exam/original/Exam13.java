package com.ecb.tamochu.neet1programming.exam.original;

public class Exam13 {

	/** 精度 */
	final static double accuracy = 0.00000001;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 平方根
		// √2を小数点8桁の精度で計算しなさい。
		// つまり1.41421355～1.41421357の少数を表示できれば良い
		// ただし求める方法はいかにある関数を実装することで行うこと

		long start = System.currentTimeMillis();
		double x = mysqrt(2.0);
		long end = System.currentTimeMillis();
		System.out.println(x);
		System.out.println("time:" + (end - start) + "ms");
		
		start = System.currentTimeMillis();
		x = mysqrt2(2.0);
		end = System.currentTimeMillis();
		System.out.println(x);
		System.out.println("time:" + (end - start) + "ms");
		
		
	}




	/**
	 * 精度の何倍か一つずつ調べる（参考）。
	 * @param x
	 * @return
	 */
	private static double mysqrt(double x) {
		double y = 0.0;
		int n = 0;

		while (true) {
			y = accuracy * n;

			if (compareToSquare(x, y)) {
				break;
			}
			n++;
		}

		return y;
	}
	
	/**
	 * mysqrtを参考にしながらここを実装すること。
	 * @param x
	 * @return
	 */
	private static double mysqrt2(double x) {
		double y = 0.0;
		
		/*
		 ここに実装する
		*/
		
		return y;
	}

	/**
	 * yの二乗がxより大きいか調べる。
	 * @param x
	 * @param y
	 * @return
	 */
	private static boolean compareToSquare(double x, double y) {
		return y * y > x;
	}
}
