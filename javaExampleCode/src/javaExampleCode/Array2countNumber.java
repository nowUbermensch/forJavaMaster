package javaExampleCode;

import java.util.Random;

/*
 * Random 하게 생성된 10자리 숫자에서 0~9가 몇개 들어가있는지 확인해보자.
 * */
public class Array2countNumber {
		public static void main(String[] args) {
			//java.util.Random 함수를 이용한다. 
			Random random = new Random();
			
			//10자리의 정수형 배열, number를 생성한다.
			int[] number = new int[10]; 
			//숫자가 몇개 있을지 확인할 용도로 쓸 count배열을 생성한다.
			int[] count = new int[10];
			
			//Random함수를 이용하여, number배열에 0~9까지의 랜덤한 숫자를 담아준다.
			System.out.print("랜덤하게 생성된 10자리 숫자 : ");
			for(int i=0; i < number.length ; i++) {
				number[i] = random.nextInt(10) ;
				System.out.print(number[i]);
			}
			
			// TODO Auto-generated method stub///////////
			
			/////////////////////////////////////////////
			System.out.println();
			//출력
			for(int i = 0 ; i < count.length ; i++) {
				System.out.println(i+"의 갯수 : " + count[i]);
			}
			
			
		}
}
