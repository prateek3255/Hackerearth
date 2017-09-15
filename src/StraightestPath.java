import java.util.*;
public class StraightestPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		m=in.nextInt();
		int x1=0,y1=0,x2=0,y2=0;
		char a[][]=new char[m][n];
		int i=0,j=0;
		for(i=0;i<m;i++){
			for(j=0;j<m;j++){
				a[i][j]=in.next().charAt(0);
				if(a[i][j]=='V'){
					x1=i;
					y1=j;
				}
				else if(a[i][j]=='H'){
					x2=i;
					y2=j;
				}
					
					
			}
		}
		
		
		
		
	}

}
