import java.io.UnsupportedEncodingException;
import java.util.*;
public class test implements Comparator<Integer>{
	@Override
	 public int compare(Integer o1, Integer o2) {
       return o1.compareTo(o2);
   }

	public static void main(String[] args) {
		/*int max = 0;
        int maxStart = -1;
        int maxEnd = -1;
        int currentStart = 0;
        int maxSoFar = 0;*/
        int arr[]={1,7,2,4,8,3,5,9};
        
        Arrays.sort(arr);
        Integer[] intArray = new Integer[] {
                new Integer(15),
                new Integer(9),
                new Integer(16),
                new Integer(2),
                new Integer(30)
            };

            // Sorting int Array in descending order
            Arrays.sort(intArray, Collections.reverseOrder());
         
            // Displaying elements of int Array
        /*    System.out.println("Int Array Elements in reverse order:");
            for (int i = 0; i < intArray.length; i++)
               System.out.println(intArray[i]);*/
       
       // for(int i=0;i<8;i++)
       // System.out.println(arr[i]);
        
       /* for(int i=0; i < arr.length; i++){
            maxSoFar += arr[i];
            if(max < maxSoFar){
                maxStart = currentStart;
                maxEnd = i;
                max = maxSoFar;
            }
        }
        System.out.println(max+" "+maxStart+" "+maxEnd);
*/
       /*     Scanner in= new Scanner(System.in);
            int n=in.nextInt();
            int d=in.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
                
            }
            int i,j,temp;
            for(i=0;i<d;i++){
                temp=a[0];
                for(j=0;j<n;j++){
                   if(j==n-1)
                       a[j]=temp;
                       else
                    a[j]=a[j+1];
                    
                }
            }
            for(i=0;i<n;i++){
                System.out.print(""+a[i]+" ");
            }*/
        /*    ArrayList<Integer> a=new ArrayList<Integer>();
            a.add(1);
            a.add(2);
            a.add(3);
            a.add(4);
            for(int i=a.size()-1;i>=0;i--){
            	System.out.println(a.get(i));
            }
            char c='z';
            int k=c;
            System.out.println(k-97);
	}
	int sum(int a){
		int k=1;
		int j = 0;
		if(a==1)
			return k;
		else
			return j;*/
          /*  HashMap<String,String> h=new HashMap<String,String>();
            h.put("j", "kk");
            h.put("j", "kkk");
            System.out.println(h.containsKey("j"));
            String a[]={"ACjhkjkjkjhghghg","AB","zz","hjjkdhfgj"};
            int sum=0,i,j,k;
          
            System.out.println(a);
            int m[]=new int[a.length];
            for(j=0;j<a.length;j++){
            	  for(i = 0;i<a[j].length();i++)
                  	sum=sum+a[j].charAt(i);
            	  m[j]=sum;
            	  sum=0;
            }
            for(i=0;i<a.length;i++){
            	System.out.println(a[i]);
            	System.out.println(m[i]);
            }
            	
            String temp;
            System.out.println(a);
            for(i=0;i<a.length;i++){
            	for(j=0;j<a.length-i-1;j++){
            		if(m[j+1]<m[j]){
            			temp=a[j];
            			a[j]=a[j+1];
            			a[j+1]=temp;
            		}
            	}
            		
            }
            
            for(i=0;i<a.length;i++){
            	System.out.println(a[i]);
            	System.out.println(m[i]);
            }
            	
            
            */
           /* String s="hello world";
            System.out.println(s.substring( s.length()-2));
	*/
            int i= 10 + + 11 - - 12 + + 13 - - 14 + + 15;
            //System.out.println(i);
           /* int m[]=new int[2];
            m[0]=1;
            m[1]=3;
            int j[]=m;
            System.out.println(""+j[0]+j[1]);*/
//            Scanner in=new Scanner(System.in);
//            int n=in.nextInt();
//            ArrayList<String> s=new ArrayList<String>();
//            in.nextLine();
//            for(i=0;i<n;i++){
//            	s.add(in.nextLine());
//            }
//            for(i=0;i<n;i++){
//            	System.out.println(s.get(i));
//            }
//            String a="j";
//            String b="j";
//            boolean x=(a==b);
//            System.out.println(x);
//            String m="1.2dsg";
//            
//            try{
//            	int g= Integer.parseInt(m);
//            	System.out.println(g);
//            }
//            catch(Exception e){
//            	try{
//            		float f=Float.parseFloat(m);
//            		System.out.println(f);
//            	}
//            	catch(Exception l){
//            		System.out.println("it is a string");
//            	}
//            }
//            double d=in.nextDouble();
//            int q=(int)d;
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            in.nextLine();
            String s=in.nextLine();
            String s1=in.nextLine();
            System.out.println(s.indexOf('$'));
            System.out.println(s1.indexOf('$'));   
	}

}
