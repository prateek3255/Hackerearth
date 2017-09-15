import java.util.*;
public class FredoAndGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n,a,flag=0,t;
		int i=0;
		t=in.nextInt();
		for(int j=0;j<t;j++){
		a=in.nextInt();
		n=in.nextInt();
		int arr[]=new int[n];
		flag=0;
		for(i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		i=0;
		while(a!=0){
			if(i<n){
				if(arr[i]==0)
					a=a-1;
				else
					a=a+2;
			}
			else{
				flag=1;
				break;
			}
			i=i+1;
		}
		if(flag==1)
			System.out.println("Yes "+a);
		else
			System.out.println("No "+i);
		}
		
	}

}
