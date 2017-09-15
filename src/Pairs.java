import java.util.*;
public class Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,k,first,second;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		HashSet<String> h=new HashSet<String>();
		int a[]=new int[n];
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		s.close();

			for(j=i=0;j<n;++i){
				first=second=0;
				for(k=j;k<=i;k++){
					if(first < a[k])
			        {
			            second = first;
			            first = a[k];
			        }
			        else if(second < a[k])
			        {
			            second = a[k];
			        }
					
				
				}
				//System.out.println(first+" "+second+" "+i+" "+j);
				if(first!=second&&first!=0&&second!=0)
				h.add(first+" "+second);
				if(i==n-1){
					i=j++;
				}
				
			}
		
		
		System.out.println(h);
		
	}

}
