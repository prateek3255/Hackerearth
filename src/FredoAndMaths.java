import java.util.*;
public class FredoAndMaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int t,i,j,x,m,k,r;
		t=in.nextInt();
		for(i=0;i<t;i++){
			x=in.nextInt();
			k=in.nextInt();
			m=in.nextInt();
			r=x;
			for(j=0;j<k-1;j++){
				r=(int)Math.pow(r, x);
				
			}
			System.out.println(r%m);
		}
	}

}
