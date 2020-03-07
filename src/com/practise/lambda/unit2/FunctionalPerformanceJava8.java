package com.practise.lambda.unit2;

import java.util.function.BiConsumer;

public class FunctionalPerformanceJava8 {

	public static void main(String[] args) {
		int [] numbers = {1,2,3,4};
		int key = 0;

		perform(numbers,key, (v,k)->System.out.println(v+k));

	}

	private static void perform(int[] numbers, int key, BiConsumer<Integer, Integer> cons) {
		for(int i:numbers) {
			cons.accept(i, key);
		}
		
	}

}
