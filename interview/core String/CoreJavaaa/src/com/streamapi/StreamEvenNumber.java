package com.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamEvenNumber {
	
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		l.stream().forEach(i->{
			if(i%2==0) {
				
				System.out.println("even " + " " +i);
			}else {
				System.out.println("odd " + " " +i);
			}
		});
		
	
	}

}
