package com.streamapi;

import java.util.stream.Stream;

public class RandomNumber {
	public static void main(String[] args) {
	//	Stream.generate(() -> 1000 + (int) (Math.random() * 9000)).limit(5).forEach(s -> System.out.println(s));
		
		
		Stream.generate(Math::random).limit(5).forEach(s -> System.out.println(s));
	}

}
