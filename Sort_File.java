package program.java.assessment_1;

import java.io.File;
import java.util.*;

public class Sort_File {

	public void sortfile() {
		// TODO Auto-generated method stub
		try {
      	  File file = new File("g:\\LockedMe");
      	 String[] s =file.list();
      	 int size = s.length;  
      	 if(size!=0)// To Check if the directory is empty
      	 {
      		//logic for sorting
      	      for(int i = 0; i<size-1; i++)   
      	        {  
      	          for (int j = i+1; j<s.length; j++)   
      	           {  
      	              //compares each elements of the array to all the remaining elements  
      	              if(s[i].compareTo(s[j])>0)   
      	               {  
      	                 //swapping array elements  
      	                 String temp = s[i];  
      	                 s[i] = s[j];  
      	                 s[j] = temp;  
      	               }  
      	            }  
      	         } 
        	 //prints the sorted array in ascending order  
        	 for(String s1:s)
        	 {
        		System.out.println(s1);
        	 }
      	 }
      	 else
      	 {
      		 System.out.println("No files in the directory");
      	 }
        }
        catch(Exception e)
        {
      	  e.getStackTrace();
        } 

	}

}
