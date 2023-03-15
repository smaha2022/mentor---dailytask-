package test4com.test;

import java.util.Random;
import java.util.Scanner;

public class probability {
     public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("enter the number of elements : ");
	        int n = scanner.nextInt();
	        
	        int[] nums = new int[n];
	        int[] probability = new int[n];
	        
	        System.out.println("enter the elements of array: ");
	        for (int i = 0; i < n; i++) {
	            nums[i] = scanner.nextInt();
	        }
	        
	        System.out.println("Enter the probabilities: ");
	        for (int i = 0; i < n; i++) {
	            probability[i] = scanner.nextInt();
	        }
	        
	      
	        String output = "The solution should return ";
	        for (int i = 0; i < n; i++) {
	            output += nums[i] + " with " + probability[i] + "% probability";
	            if (i != n-1) {
	                output += ", ";
	            }
	        }
	        output += ".";
	        
	        System.out.println(output);
	        
	        scanner.close();
	    }

	}


