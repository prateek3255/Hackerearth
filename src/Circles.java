import java.util.*;
public class Circles {

	public static void main(String[] args) {
		int n,i,c,d,swap,swap1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int r[]=new int[n];
		int w[]=new int[n];
		for(i=0;i<n;i++){
			r[i]=s.nextInt();
			w[i]=s.nextInt();
		}
		 for (c = 0 ; c < ( n - 1 ); c++)
		  {
		    for (d = 0 ; d < n - c - 1; d++)
		    {
		      if (w[d] <w[d+1]) /* For decreasing order use < */
		      {
		        swap       = w[d];
		        swap1 = r[d];
		        w[d]   = w[d+1];
		        r[d]=r[d+1];
		        w[d+1] = swap;
		        r[d+1]=swap1;
		      }
		    }
		  }
		 for(i=0;i<n;i++){
			 
		 }
		s.close();
		

	}

}
