import java.util.*;
public class JumpOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		int s=0;
		for(int i=0;i<n;i++){
			if((a[i]+i)>=n){
				s=i;
				break;
			}
				
		}
		System.out.println(s+1);
	}

}
