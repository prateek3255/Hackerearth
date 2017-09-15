import java.util.*;
public class HelpFredo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int max=1,min=0,p=1;
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
			if(i==0)
				min=a[i];
			if(max<a[i])
				max=a[i];
			if(min>a[i])
				min=a[i];
			p=p*a[i];
		}
		int mid,f1=0;
		while(true){
			mid=(max+min)/2;
			if(Math.pow(mid,n)>p){
				max=mid-1;
				if(f1==1)
					break;
			}
			if(Math.pow(mid, n)<p){
				min=mid+1;
				f1=1;
			}
		}
		System.out.println(mid);
	}

}
