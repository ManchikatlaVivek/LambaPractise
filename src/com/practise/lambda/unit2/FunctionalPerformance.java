package com.practise.lambda.unit2;

public class FunctionalPerformance {
	
	public String toString() {
		return "This is the Functional Performance Class";
		
	}

	public static void main(String[] args) {
		FunctionalPerformance fp = new FunctionalPerformance();
		System.out.println(fp);
		int [] numbers = {1,2,3,4};
		int key = 10;
		
		perform(numbers,key, new Performer() {
			
			@Override
			public void action(int k, int v) {
				System.out.println(k*v);				
			}
		});
	}

	private static void perform(int[] numbers, int value, Performer p ) {
		for(int i:numbers) {
			p.action(i, value);
		}
		
	}

	

}
interface Performer{
	void action(int k, int v);
}
