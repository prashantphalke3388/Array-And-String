package com.array.assignment;

public class Problem10SortByLength {
	 public static void main(String[] args)
     {
          String a[] = { "man", "home", "eat","when","and","Forget","Everything"};


               String temp;



          for (int i = 0; i < a.length; i++)
            {                
                 for (int j = i+1; j < a.length; j++)
                 {
                     if (a[i].length() > a[j].length())
                     {
                        temp = a[i];
                         a[i] = a[j];
                         a[j] = temp;
                    }
                }
                 System.out.println(a[i]);
            }
     }

}
