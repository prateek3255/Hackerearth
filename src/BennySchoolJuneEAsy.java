import java.util.*;
public class BennySchoolJuneEAsy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,x,t,j;
		Scanner in=new Scanner(System.in);
		t=in.nextInt();
		for(j=0;j<t;j++){
		n=in.nextInt();
		m=in.nextInt();
		x=in.nextInt();
		int a[]=new int[n];
		int avg=0;
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
			avg=avg+a[i];
		}
		int temp=(n+1)*x-avg;
		if(temp<=m){
			if(temp==0)
				temp=1;
			System.out.println(Math.abs(temp));
		}
		else
			System.out.println("Impossible");
		}
		
	}

}
