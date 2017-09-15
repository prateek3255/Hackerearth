import java.util.*;
public class Alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
        String s=in.next();
        
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)=='?'){
        		
        		a.add(i);
        	}
        		
        }
        
        
	}

}
