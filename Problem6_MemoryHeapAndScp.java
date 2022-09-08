package com.string.assignment;

public class Problem6_MemoryHeapAndScp {
public static void main(String[] args) {
        
        String s1 = new String("prashant"); 

       String s2 = new String("prashant"); 

       String s3 = "prashant"; 

       String s4 = "prashant"; 



       System.out.println("s1: " + s1.hashCode());
        System.out.println("s2: " + s2.hashCode());
        System.out.println("s3: " + s3.hashCode());
        System.out.println("s4: " + s4.hashCode());



       System.out.println(s1.equals(s3)); 
        System.out.println("In Heap memory: " + s1 == s3);



   }

}
