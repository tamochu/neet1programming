package com.ecb.tamochu.neet1programming.exam.answer;

public class Exam5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 1～100の中の素数を配列に入れたのち表示しなさい
		int[] sosu = new int[100];
		int sosuIndex = 0;
		boolean isSosu;
		for (int i = 2; i <= 100; i++){
			isSosu = true;
			for(int mod = 2; mod < i; mod++){
				if(i % mod == 0){
					isSosu = false;
					break;
				}
			}
			if (isSosu){
				sosu[sosuIndex] = i;
				sosuIndex++;
			}
		}
		for(int nsosu : sosu){
			if (nsosu > 0) {
				System.out.print(nsosu + " ");
			}
		}
	}

}
