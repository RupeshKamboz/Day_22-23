package same;


import java.util.Random;


public class Wage extends Main {
	
	
	Wage()
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
	
		
	}
}
