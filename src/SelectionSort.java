import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n,x;
	        Scanner in=new Scanner(System.in);
	        n=in.nextInt();
	        x=in.nextInt();
	        int i=0,j=0,min=0,temp;
	        int a[]=new int[n];
	        for(i=0;i<n;i++){
	            a[i]=in.nextInt();
	            
	        }
	        for(i=0;i<x;i++){
	            min=i;
	            for(j=i+1;j<n;j++){
	                if(a[j]<a[min])
	                    min=j;
	            }
	            temp=a[i];
	            a[i]=a[min];
	            a[min]=temp;
	        }
	        for(i=0;i<n;i++)
	            System.out.print(a[i]+" ");

	}

}
