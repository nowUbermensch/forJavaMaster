package javaExampleAnswer;

import java.util.Random;

public class JavaRandomFunction {
	public static void main(String[] args) {
		Random random = new Random();
		
	        System.out.println("Double: "+random.nextDouble());
	        System.out.println("Boolean: "+random.nextBoolean());
	        System.out.println("Int: "+random.nextInt());
	        System.out.println("Int(1~10): "+(random.nextInt(10)+1));
		
	}
}
