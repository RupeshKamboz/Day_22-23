package prolem;

import java.util.Random;


public class uc4 {

	
	public static void main(String[] args) {
		// Start
				int perhr=20;
				long[] array=new long[21];
				long[] totalsum=new long[30];
				totalsum[0]=0;	
					Random rand=new Random();
					
					
				for (int i=1;i<21;i++ )
				{	System.out.println("Day "+i +" ");
					int a=rand.nextInt(8);
					//System.out.println(" A   = "+a);
					
					switch(a+1)
					{
				     case 1:
				    		array[i]=20;
							totalsum[i]=(totalsum[(i-1)] + array[i]);
							System.out.println("Todays Wage = "+totalsum[i]);
							break;
				     
				     case 2:
				    	 	array[i]=40;
							totalsum[i]=(totalsum[(i-1)] + array[i]);
							System.out.println("Todays Wage = "+totalsum[i]);
							break;
				     case 3:
				    	 	array[i]=60;
							totalsum[i]=(totalsum[(i-1)] + array[i]);
							System.out.println("Todays Wage = "+totalsum[i]);
							break;
				     case 4:
				    	 
				    	 	array[i]=80;
							totalsum[i]=(totalsum[(i-1)] + array[i]);
							System.out.println("Todays Wage = "+totalsum[i]);
							break;
				     case 5:
				    	 	array[i]=100;
							totalsum[i]=(totalsum[(i-1)] + array[i]);
							System.out.println("Todays Wage = "+totalsum[i]);
							break;
				     case 6:
				    	 	array[i]=120;
							totalsum[i]=(totalsum[(i-1)] + array[i]);
							System.out.println("Todays Wage = "+totalsum[i]);
							break;
				     case 7:
				    	 	array[i]=140;
							totalsum[i]=(totalsum[(i-1)] + array[i]);
							System.out.println("Todays Wage = "+totalsum[i]);
							break;
				    	 
				     case 8:
				    	 	array[i]=160;
							totalsum[i]=(totalsum[(i-1)] + array[i]);
							System.out.println("Todays Wage = "+totalsum[i]);
							break;
				    	 
				     default:
				    	 System.out.println("enter 1-8 ");
				    	 break;
				}

						
						
				}
				
				
				
				

				

	}

}
