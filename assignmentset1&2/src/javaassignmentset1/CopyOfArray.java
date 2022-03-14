package javaassignment;

import java.util.Arrays;

public class CopyOfArray {

     public static void main(String[] args) {
    	 int[] org = new int[] {9, 8, 7};
    	 
    	      System.out.println("original Array");
    	      for (int i = 0; i < org.length; i++)
    	    	  System.out.print(org[i] + " ");
    	      
    	      
    	      int[] copy = Arrays.copyOf(org, 5);
    	      
    	      copy[3] = 5;
    	      copy[4] = 4;
    	     
    	      System.out.println("\nNew array copy after modification:");
    	      for (int i = 0; i < copy.length; i++)
    	    	  System.out.print(copy[i] + " ");
		
	}
}
