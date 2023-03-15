package test4com.test;

import java.util.Scanner;

public class DuplicateNumber {
     
     public static void main(String[]args) {
    	 Scanner scanner=new Scanner(System.in);
    	 System.out.println("Enter the elements count you want to store");
    	 int n=scanner.nextInt();
    	 int[]arr=new int[n];
    	 System.out.println("Enter the number of elements(1 to 100)in array");
    	 int number=scanner.nextInt();
    	 for(int i=0;i<n;i++) {
    		 arr[i]=scanner.nextInt();
    	 }
    	 System.out.println("Duplicate  elements in the array");
    	 for(int i=0;i<arr.length;i++) {
    		 for(int j=i+1;j<arr.length;j++){
    			 if(arr[i]==arr[j])
    				 System.out.println(arr[j]);
    	 }
    	 }
     }
}
