import java.util.*;
public class MonkAndDigitalWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String a=in.next();
		String b=in.next();
		int i,j;
		ArrayList<Character> c=new ArrayList<Character>();
		for(i=0;i<n;i++){
			c.add(a.charAt(i));
		}
		int flag=0,f=0;
		for(j=0;j<n;j++){
			flag=0;
			for(i=0;i<c.size();i++){
				if(b.charAt(j)==c.get(i))
				{
					c.remove(i);
					flag=1;
					break;
				}
				
			}
			if(flag==0)
			{
				System.out.println("NO");
				f=1;
				break;
			}
		
		}
		if(f==0)
			System.out.println("YES");
	}

}
