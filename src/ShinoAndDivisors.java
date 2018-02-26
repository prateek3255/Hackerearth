import java.util.*;
public class ShinoAndDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int p[]=new int[x];
		int a[]=new int[x];
		for(int i=0;i<x;i++)
			p[i]=in.nextInt();
		int k=2;
		int j;
		boolean flag=false;
		for(int i=0;i<x;){
			flag=false;
			for(j=2;j<=k/2;j++){
				if(k%j==0)
					flag=true;
			}
			if(!flag){
				a[i]=k;
				i++;
			}
			k=k+1;
				
		}
		int mul=1;
		ArrayList a1=new ArrayList<Integer>();
		for(int i=0;i<x;i++){
			System.out.println(a[i]);
			mul=(int) (mul*Math.pow(a[i], p[i]));
		}
		System.out.println(mul);
		int pro=1;
		for(int i=1;i<=mul;i++){
			if(mul%i==0)
				pro=pro*i;
		}
		int c=0;
		for(int i=1;i<=pro;i++){
			if(pro%i==0)
				c=c+1;
			
		}
		System.out.println(c);
		
	}

}
