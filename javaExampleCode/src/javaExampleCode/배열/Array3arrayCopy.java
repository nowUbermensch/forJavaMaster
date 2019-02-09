package javaExampleCode.배열;

import java.util.Random;

public class Array3arrayCopy {

	public static void main(String[] args) {
		/*
		int[] score = new int[10];
		Random random = new Random();
		
		for(int i = 0 ; i <score.length ; i++) {
			score[i] = random.nextInt(100)+1;
			System.out.println(score[i]);
		}
		System.out.println("****");
		//1. for 문을 이용해서 짝수칸에 있는 숫자들만 새로운 배열에 담아보시오.
		int k = 0;
		int[] number = new int[5];
		for(int i = 1; i < score.length; i+=2) {
			
			for(int j = 0 ; j < number.length ; j++) {
			number[j]=score[i];
			}
			System.out.println(number[k]);
			k++;
		}
		

		System.out.println("****");
		
		int result[] = new int[2];
		System.arraycopy(number,0,result, 0, 2);
		
		for(int i=0; i<result.length; i++) {
			
			System.out.println(result[i]);
		}
		
		
		*/



		        int array[] = { 1,2,3,4,5 };
		        int copy[] = new int[5];

		        System.arraycopy(array, 0, copy, 1, 3);

		        for(int i =0;i<array.length;i++)
		                System.out.print(array[i]);
		        System.out.println();
		        for(int i =0;i<copy.length;i++)
		                System.out.print(copy[i]);
		        }

	
				

		
		
		// TODO Auto-generated method stub

	}


