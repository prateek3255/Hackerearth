import java.util.*;
public class BennyJuneEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		in.nextLine();
		int i,j,p;
		String s;
		String price="";
		char t;
		for(i=0;i<n;i++){
			s=in.nextLine();
			p=s.indexOf('$');
			price="";
			for(j=p+1;j<s.length();j++){
				t=s.charAt(j);
				if(t>=48 && t<=57)
					price=price+t;
				else
				if(t==' ')
					continue;
				else
					break;
				
			}
			
			System.out.println("$"+price.replaceFirst("^0+(?!$)", ""));
			
		}
	}

}
