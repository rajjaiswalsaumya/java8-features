package com.sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StreamListSample {
	public static void main(String[] args) {
		List l1 = new ArrayList<>();

		l1.add("Raj");
		l1.add("Vinay");
		l1.add("Sudipa");
		l1.add("Mandar");
		l1.add("Surbhi");
		l1.add("Mandar");
		l1.add("Ayaz");
		l1.add("Mandar");

		System.out.println(l1);

		HashSet set = new HashSet(l1);
		System.out.println(set);
	}
}
