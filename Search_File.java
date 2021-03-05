package program.java.assessment_1;

import java.io.File;
import java.util.Scanner;

public class Search_File {

	public void searchfile() {
		// TODO Auto-generated method stub
		String name;
		int out=0;
		try {
        	  File file = new File("g:\\LockedMe");
        	 String[] s =file.list(); 
        	 int size = s.length;  
          	 if(size!=0)// To Check if the directory is empty
          	 {
         		System.out.println("Enter the file name you want to search");
         		Scanner sc = new Scanner(System.in);
                name = sc.nextLine();
        	      /*Generally file.exists() would help to search/check a file in directory, since we are searching
        	      with case sensitive, i am using .equals for each file after converting into string array*/
        	      for(String s1:s)
        	          {
        		        if(s1.equals(name))
        		        {
        			      out=1;
        			      break;
        		        }
        	          }
        	      if(out==0)
                     {
           	            System.out.println("File not found");
                     }
                   else
                     {
           	            System.out.println("File '"+name+"' found in the directory");
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
