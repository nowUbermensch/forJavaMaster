package javaExampleAnswer;

/*
 * 배열에 담긴 값들 중에 최대값과 최소값을 구해보자.
 * */
public class Array1MinMax {

	public static void main(String[] args) {
		//score 라는 int형 배열을 생성, 초기화 한다.
		int[] score = {10,90,66,88,24};
		//score 의 0 번 index에 있는 값으로 min / max 를 초기화 해준다.		
		int min = score[0];
		int max = score[0]; 
		//Q. min / max 의 값은?
		System.out.println("init. min :"+min+" init. max : "+max);
		
		// TODO Auto-generated method stub///////////
		for(int i = 1 ; i < score.length ; i++ ) {
			if(score[i] < min) {
				min = score[i];
			}
			if(score[i] > max) {
				max = score[i];
			}
		}
		//////////////////////////////////////////////
		
		System.out.println("Min Score : "+min);
		System.out.println("Max Score : "+max);
		
	}

}
