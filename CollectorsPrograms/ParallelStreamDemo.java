package com.CollectorsPrograms;

import java.util.stream.Stream;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		System.out.println("==========Serial Stream===========");
		Stream<Integer> ss=Stream.of(1,2,3,4);
		ss.forEach(i->System.out.println(i+"::"+Thread.currentThread()));
		
		System.out.println("==========Parallel Stream===========");
		Stream<Integer> ps=Stream.of(5,6,7,8);
		ps.forEach(i->System.out.println(i+"::"+Thread.currentThread()));

	}

}
