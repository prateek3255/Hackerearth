import java.util.*;
public class CoinGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t,n,min,k,l;
		boolean p;
		Scanner in=new Scanner(System.in);
		t=in.nextInt();
		for(int i=0;i<t;i++){
			n=in.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++){
				a[j]=in.nextInt();
			}
			p=true;
			while(true){
				min=1001;k=-1;l=-1;
				p=!p;
				for(int j=0;j<n;j++){
					if(a[j]%2==0){
						if((a[j]%2)%2!=0){
							k=j;
							break;
						}
						else{
							if(a[j]<min){
								min=a[j];
								l=j;
							}
						}
					}
				}
				if(k!=-1)
					a[k]=a[k]/2;
				else
				if(l!=-1)
					a[l]=a[l]/2;
				else{
					if(p)
						System.out.println("Charlie");
					else
						System.out.println("Alan");
					break;
				}

			}
		}

	}

}
