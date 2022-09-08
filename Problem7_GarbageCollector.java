package com.string.assignment;

public class Problem7_GarbageCollector {
	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String[] args) {
//		
		Problem7_GarbageCollector s2 = new Problem7_GarbageCollector();//reference
		Problem7_GarbageCollector s3 = new Problem7_GarbageCollector();
		s2=s3;
		System.gc();

	}

}
