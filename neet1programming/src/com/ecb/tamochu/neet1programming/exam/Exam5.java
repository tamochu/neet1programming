package com.ecb.tamochu.neet1programming.exam;

public class Exam5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 1～100の中の素数を配列に入れたのち表示しなさい
		boolean a;
		for (int i=2;i<101;i++){
			a = true;
			for(int b=2;b<=i/2;b++){
				if(i%b == 0){
					a = false;
					break;
				}
			}
			if (a){
				int [] sosu = {i};
				for(int nsosu : sosu){
					System.out.print(nsosu + " ");
				}
			}
		}
	}

}
