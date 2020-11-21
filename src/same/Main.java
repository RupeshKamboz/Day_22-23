package prolem;


import java.util.Random;


public class uc2 {
	private static long[] array=new long[21];
	private static long[] totalsum=new long[2];
	private static long[] fullTime=new long[23];
	private static long[] partTime=new long[23];
	
	private static Random random1=new Random();
	private static Random random2=new Random();
	private static Random random3=new Random();
	
	protected static String stringFullTime="\tFull time";
	protected static String stringPartTime="\tPart time";
	protected static String stringAttendPresent="Present";
	protected static String stringAttendAbsent="Absent";
	private static int i;
	private static int partinc=0;
	private static int fullinc=0;
	private static  int att;
	private static int partfull;
	private static int hr;
	private static int  parthr=0;
	private static int fullhr=0;
	private static int totalhr=0;
	
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
		
		new Wage();
	}
	protected static void callMethod()
	{
		for ( i=1;i<21;i++) 
		{		
			att=random1.nextInt(2);
			partfull=random2.nextInt(2);
			hr=random3.nextInt(8);
			attendence();
			employeeWage();
			 
			
			
			
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
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("\t\t\tWelcome To Employee wage");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Days "+"\tAttendance"+"\tFull or Part"+"\tHours"+"\tWage per day\n");
		callMethod();
			
			
						
		
		
		
	
		

		
	}
}
