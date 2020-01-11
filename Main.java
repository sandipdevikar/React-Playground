import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	int bt[]=new int[10];	
	int at[]=new int[10];	
	int tat[]=new int[10];	
	int wt[]=new int[10];	
	int ct[]=new int[10];	

	int n,sum=0;
	float totalTAT=0,totalWT=0;

	System.out.println("Enter number of processes	");
	
	n=sc.nextInt();


		System.out.println("Enter arrival time and burst time for each process ");

	for(int i=0;i<n;i++)
	{

			System.out.println("Arrival time of process	"+(i+1));
		at[i]=sc.nextInt();
		
			System.out.println("Burst time of process	"+(i+1));
			bt[i]=sc.nextInt();
		
			System.out.println("\n");
	}
		
	//calculate completion time of processes 	

	for(int j=0;j<n;j++)
	{
		sum+=bt[j];
		ct[j]+=sum;
	}

	//calculate turnaround time and waiting times 

	for(int k=0;k<n;k++)
	{
		tat[k]=ct[k]-at[k];
		totalTAT+=tat[k];
	}

	
	for(int k=0;k<n;k++)
	{
		wt[k]=tat[k]-bt[k];
		totalWT+=wt[k];
	}
	
		System.out.println("Solution: \n\n");
		System.out.println("P#\t AT\t BT\t CT\t TAT\t WT\t\n\n");
	
	for(int i=0;i<n;i++)
	{
			System.out.println("P"+(i+1)+"\t"+at[i]+"\t"+bt[i]+"\t"+ct[i]+"\t"+tat[i]+"\t"+wt[i]);
	}
		
		System.out.println("\n\nAverage Turnaround Time = "+totalTAT/n);
	System.out.println("Average WT = "+totalWT/n);
	
	}
}
