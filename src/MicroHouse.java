import java.util.*;
public class MicroHouse {

	public static void main(String[] args) {
		int m,n,i,j;
		Scanner in= new Scanner(System.in);
		n=in.nextInt();
		m=in.nextInt();
		int a[][]=new int[n][m];
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				a[i][j]=in.nextInt();
			}
		}
		in.close();
		int l,r;
		int temp[]= new int[n];
		int max = 0;
        
        int maxSoFar = 0;
        int maxsum=0;
		for(l=0;l<m;l++){
			for(r=l;r<m;r++){
				for(i=0;i<n;i++){
					if(l==r)
						temp[i]=a[i][r];
					else
						temp[i]=temp[i]^a[i][r];
					
				}
				for(j=0; j < n; j++){
		            maxSoFar ^= temp[j];
		            if(max < maxSoFar){
		               
		                max = maxSoFar;
		            }
		        if(maxsum<max)
		        	maxsum=max;
		        }
			}
		}
		System.out.println(maxsum);
		
			

	}

}
