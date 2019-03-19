package com.sample;

import java.util.stream.Stream;

public class LazyStream {
	public static void main(String[] args) {
		Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5)
				.filter(i -> i % 2 == 0);

		System.out.println(integerStream);

	}
}
