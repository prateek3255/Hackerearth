import java.util.*;
public class GoodString {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String s=in.next();
		HashSet<Character> h=new HashSet<Character>();
		for(int i=0;i<s.length();i++){
			h.add(s.charAt(i));
		}
		int r=s.length()-h.size();
		System.out.println(r);
		in.close();
	}

}
