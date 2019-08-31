import java.util.*;

public class Main
{
	
	public static void main(String[] args)
	{   
		 int low,high,middle,n;
		Scanner s=new Scanner(System.in);
		System.out.println("ent3r no.of ele");
		n=s.nextInt();		
		int search;
		  low=0;
		  high=n-1;
		  middle=low+high/2;
		  int a[]=new int[n];
		  System.out.println("enter the ele");
		  for(int i=0;i<n;i++){
			a[i]=s.nextInt();  
		  }
		  System.out.println("enter ele 2 find");
		  search=s.nextInt();
		  while(low<=high){
			  if(a[middle]==search){
				  System.out.println( middle);
			  }else if(a[middle]<search){
				  high=middle-1;
			  }else if(a[middle]>search){
				  low=middle+1;
			  }
		  }
		  
		  
		  
		 
	}
}
