package com.sample;

import java.util.Arrays;
import java.util.stream.Stream;

public class Operations {

	public static void main(String[] args) {
		Stream stream = Arrays.asList(2, 5, 6, 3, 8, 7, 9, 1).stream();
		printEvenStream(stream);
		printOddStream(stream);
	}

	public static void printEvenStream(Stream<Integer> stream) {
		stream.filter(u -> u % 2 == 0).forEach(System.out::println);
	}

	public static void printOddStream(Stream<Integer> stream) {
		stream.filter(u -> u % 2 == 1).forEach(System.out::println);
	}
}
