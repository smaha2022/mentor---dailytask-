package test4com.test;

import java.util.Scanner;

public class LongestCommonPrefix 
{
            public static String longestCommonPrefix(String[] strs)
              {
		        if (strs == null || strs.length == 0)
		        {
		            return "";
		        }
		     String prefix = strs[0];
		        for (int i = 1; i < strs.length; i++)
		        {
		            while (strs[i].indexOf(prefix) != 0) 
		            {
		                prefix = prefix.substring(0, prefix.length() - 1);
		                if (prefix.isEmpty()) 
		                {
		                    return "";
		                }
		            }
		        }
		        return prefix;
		    }

		    public static void main(String[] args) 
		    {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a set of strings : ");
		        String str = sc.nextLine();
		        
		        String[] strs = str.split(" ");
		        String lcp = longestCommonPrefix(strs);
		        
		        System.out.println("The longest common prefix is: " + lcp);
		    }
	}
