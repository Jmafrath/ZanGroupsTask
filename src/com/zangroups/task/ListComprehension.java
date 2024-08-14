package com.zangroups.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListComprehension {
	public static void main(String[] args) {
		List<Integer> li1= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> li2= new ArrayList<Integer>();
		for (Integer res : li1) {
			li2.add(res*res);
			}
		System.out.println(li2);
	}

}
