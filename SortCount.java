import java.util.*;
public class SortCount
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=input.nextInt();
		}
		int temp=0;
		for(int i=0;i<n-1;i++){
		    for(int j=0;j<n-i-1;j++){
		        if(arr[j]>arr[j+1]){
		            temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		        }
		    }
		}
		for(int i =0;i<n;i++){
		System.out.print(arr[i]+" ");
		}
	    System.out.println(" ");
		int count_num =input.nextInt();
		int count =0;
		for(int i =0;i<n;i++){
		    if(count_num == arr[i]){
		        count +=1;
		    }
		}
		System.out.println("Occurence of "+count_num+" is : "+count);
	}
}
