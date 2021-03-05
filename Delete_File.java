package program.java.assessment_1;

import java.io.File;
import java.util.Scanner;

public class Delete_File {

	public void deletefile() {
		// TODO Auto-generated method stub
		String name;
		int out=0;
		 try {
        	  File file = new File("g:\\LockedMe");
        	  String[] s =file.list(); 
         	 /*Generally file.exists() would help to search/check a file in directory, since we are searching
         	 with case sensitive, i am using .equals for each file after converting into string array*/
        	  int size = s.length;  
            	//logic for sorting
            	 if(size!=0)// To Check if the directory is empty
            	 {  
            			System.out.println("Enter the file name you want to delete");
            			Scanner sc = new Scanner(System.in);
            	          name = sc.nextLine();
         	         for(String s1:s)
         	             {
         		             if(s1.equals(name))
         		                {
         			              out=1;
         			              File filedel = new File("g:\\LockedMe\\"+name);
         			              filedel.delete();
         			              break;
         		                }
         	             }
         	         if(out==0)
                        {
          	                System.out.println("File not found in the directory");
                        }
                        else
                        {
          	                System.out.println("File '"+name+"' deleted from the directory");
                        }
            	 }
            	 else {
            		 System.out.println("No files in the directory");
            	 }
           }
           catch(Exception e)
           {
         	  e.getStackTrace();
           }
           
          
	}
}
