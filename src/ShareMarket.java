import java.util.*;
public class ShareMarket {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t,i,n,j,k,total=0,l=-1;
		Scanner s=new Scanner(System.in);
		t=s.nextInt();
		for(i=0;i<t;i++){
			n=s.nextInt();
			Integer w[]=new Integer[n];
			for(j=0;j<n;j++){
				w[j]=s.nextInt();
				total=total+w[j];
			}
			k=s.nextInt();
			int x[]=new int[k];
			int c[]=new int[k];
			for(j=0;j<k;j++){
				x[j]=s.nextInt();
			}
			for(j=0;j<k;j++){
				c[j]=s.nextInt();
			}
			 Arrays.sort(w, Collections.reverseOrder());
			 for(j=0;j<k;j++){
				 int no=x[j];
				 int cost=c[j];
				 if(cost>total)
					 System.out.println("No");
				 do{
					 l=l+1;
				 }while(w[l]>cost);
				 
				 
			 }
			
			
			s.close();
		}

	}

}
