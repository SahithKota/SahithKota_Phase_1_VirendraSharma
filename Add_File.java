package program.java.assessment_1;

import java.io.File;
import java.util.Scanner;

public class Add_File {

	public void addfile() {
		// TODO Auto-generated method stub
		String name;
		System.out.println("Enter the file name you want to add");
          Scanner sc = new Scanner(System.in);
          name = sc.nextLine();
          try {
      		File file = new File("g:\\LockedMe\\"+name);
      		if(file.createNewFile()) {
      			System.out.println("New file created");
      		}
      		else {
      			if(file.exists())
      			{
      				System.out.println("file already exists");
      			}
      			else
      			{
      				System.out.println("file does not exist");
      			}
      		}
            }
            catch(Exception e)
            {
          	  e.printStackTrace();
            }
	}

}
