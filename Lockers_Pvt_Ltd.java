package program.java.assessment_1;
import java.io.File;
import java.util.*;
import java.util.Scanner;

public class Lockers_Pvt_Ltd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
        //Take user Option from the below mentioned Menu
        System.out.println("****************************************************************");
        System.out.println("*****************  Developer : Kota Sahith  ********************");
        System.out.println("****************************************************************");
        System.out.println("*********************  LockedMe.com  ***************************");
        System.out.println("****************************************************************");
        System.out.println("Directory : g:\\LockedMe");
        System.out.println("****************************************************************");
        System.out.println();
        mainMenu();
	}
	
    public static void mainMenu() {    
    	 Scanner input = new Scanner(System.in);
        int num;
        System.out.println("");
        System.out.println("*********************  Main Menu  ***************************");
        System.out.println("Select Your Choice:");
        System.out.println("1) Displaying the current files in ascending order");
        System.out.println("2) Details of user interface(More Options)");
        System.out.println("3) Close the application");
        try {
        num = input.nextInt();   
           switch(num)
           {    
           case 1: Sort_File objsort = new Sort_File();
                   objsort.sortfile();  
                   mainMenu();
                   break;
           case 2: subMenu();
        	       break;
           case 3: System.exit(0);
           default: System.out.println("Please select a valid option"); 
           }
        }
        catch(InputMismatchException e)
        {
     	   System.out.println("Please enter the correct option");
     	  mainMenu();
        }
     }
    
    public static void subMenu() {
    	Scanner input = new Scanner(System.in);
        int sub;
    	try {
     	   System.out.println("\t Select Your Choice:");
            System.out.println("\t 1) Adding a file");
            System.out.println("\t 2) Deleting a file");
            System.out.println("\t 3) Searching a file");
            System.out.println("\t 4) Exit");
            sub = input.nextInt();
            
     	               switch(sub)
     	               {    
                              case 1: Add_File objadd = new Add_File();
                                      objadd.addfile();
                                      subMenu();
                                      break;  
                              case 2: Delete_File objdel = new Delete_File();
                                      objdel.deletefile();
                                      subMenu();
                                      break;            
                              case 3: Search_File objsea = new Search_File();
                                      objsea.searchfile();
                                      subMenu();
                                      break;
                              case 4: mainMenu();
                                      break;
                              default: System.out.println("Please select a valid option");  
                         }
     	   }
           catch(InputMismatchException e)
           {
        	   System.out.println("Please enter the correct option");
        	   subMenu();
           }
    }
}