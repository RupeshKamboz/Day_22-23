package prolem;

package App;


import java.util.Random;
import java.util.Scanner;


public class uc6 {
	private static long[] array=new long[30];
	private static long[] totalsum=new long[2];
	private static long[] fullTime=new long[30];
	private static long[] partTime=new long[30];
	
	private static Random random1=new Random();
	private static Random random2=new Random();
	private static Random random3=new Random();
	
	protected static String stringFullTime="\tFull time";
	protected static String stringPartTime="\tPart time";
	protected static String stringAttendPresent="Present";
	protected static String stringAttendAbsent="Absent";
	private static int i =0;
	private static int partinc=0;
	private static int fullinc=0;
	private static  int att;
	private static int partfull;
	private static int hr;
	private static int  parthr=0;
	private static int fullhr=0;
	private static int totalhr=0;
	private static int totalhrCondition;
	private static Scanner sc=new Scanner(System.in);
	private static int dayCon=0;
	private static int hrCon=0;
	private static int con=26;
	
	
	
	protected static void  attendence() //Check Attendance and PART Time Or FULL Time
	{
		  
		  if (att==0)//Present
			{
			  System.out.print("Day "+i+"\t"+stringAttendPresent);
				
			}
			
			else if (att==1)
			{
				System.out.print("Day "+i+"\t"+stringAttendAbsent);
		
			}
		
	}
	
	protected static void employeeWage() 
	{
		
		array[i]=(hr+1)*20;
		if (partfull==0)//Full Time
		{	
			++fullinc;
			fullhr=fullhr+(hr+1);
			fullTime[fullinc]=fullTime[fullinc-1]+array[i];
			System.out.println("\t  "+(hr+1)+"\t   "+fullTime[fullinc]);
			
		}
		else
		{
			++partinc;
			parthr=parthr + (hr+1);
			partTime[partinc]=partTime[partinc-1]+array[i];
			System.out.println("\t  "+(hr+1)+"\t   "+partTime[partinc]);
			
		}
		
	}
	protected static void callMethod()
	{
		for (i=1;i<con;i++)
		{		
			if (i==dayCon )
			{
			con=1;
			}
			else if (hrCon>=totalhrCondition)
			{
				con=1;
			}
			
			att=random1.nextInt(2);
			partfull=random2.nextInt(2);
			hr=random3.nextInt(8);
			attendence();
			employeeWage();
			totalhrCondition=parthr+fullhr;
			
			
			
		}
		//Total Wage
		System.out.println("-------------------------------------------------------------------------------");
		totalsum[1]=partTime[partinc]+fullTime[fullinc];
		totalhr=parthr+fullhr;
		System.out.print("\n\nTotal Part Time Wage = "+partTime[partinc]+"\tTotal PartTime hrs = "+parthr);
		System.out.print("\nTotal Full Time Wage = "+fullTime[fullinc]+"\tTotal FullTime hrs = "+fullhr);
		System.out.println("\n-----------------------------------------------------------------------------");
		System.out.println("\n\t Total Wage = "+totalsum[1]+"\t       Total hours = "+totalhr);
		
		
	}



		
	public static void main(String[] args) {
		// Start
		System.out.print("Enter day condition = ");
		dayCon=sc.nextInt();
		System.out.print("\nEnter Hr condition = ");
		hrCon=sc.nextInt();
		
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\tWelcome To Employee wage");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Days "+"\tAttendance"+"\tFull or Part"+"\tHours"+"\tWage per day\n");
		
		callMethod();
			
			
						
		
		
		
	
		

		
	}
}
