package com.practise.lambda.unit2;

import java.util.function.BiConsumer;

public class WrapperLambdaExample {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 0, 4 };
		int key = 10;

		perform(numbers, key, wrapperlambda((v, k) -> System.out.println(k / v)));

	}

	private static BiConsumer<Integer, Integer> wrapperlambda(BiConsumer<Integer, Integer> bicons) {
		return (v,k)->{
			try {
			bicons.accept(v, k);
			}
			catch(Exception e) {
				System.out.println("Arithmetic Exception raised");
			}
		};
	}

	private static void perform(int[] numbers, int key, BiConsumer<Integer, Integer> bicons) {
		for(int i: numbers) {
			bicons.accept(i, key);
		}
	}

	

	
	
	
	 

}
