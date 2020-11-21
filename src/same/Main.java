package prolem;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class uc1 {
		
	public static void main(String[] args) {
		// Start
			Scanner	s=new Scanner(System.in);
			Random rand=new Random();
			System.out.print("Enter no of emmp = ");
			int noOfEmp=s.nextInt();
			
		for (int i=1;i<=noOfEmp;i++ )
		{
			int a=rand.nextInt(2);
			
				if(a==1)
				{
					System.out.println("Present");
				}
				else 
					System.out.println("Absent");
		}
		
		
		
		

	}

}
