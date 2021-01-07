package primeNumber;

import java.util.Scanner;

public class PrimeNumberJudege {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//判定したい数字の入力
		System.out.println("数字を入力してください");
		int num = sc.nextInt();
		String sentence = "素数と判定しました。";

		System.out.println("入力した数字は" + num +"です");

		//素数か判定する
		for(int i = 2; i < num; i++){
			if(num % i == 0){
				sentence = "素数ではありません";
				break;
			}
		}

		System.out.println(num + sentence);
	}

}
