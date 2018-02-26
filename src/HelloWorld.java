public class HelloWorld{
    static Integer intarray[]={0,1,2,3,5,6};  
    public static <E> void inverse(E inputArray[])
    {
        int i,low=0,hi=inputArray.length-1;
		E temp;
        while(low<hi)
        {
            temp= inputArray[low];
            inputArray[low]=inputArray[hi];
            inputArray[hi]= temp ;
            low++;hi--;
        }    

    }

    public static < E > void printArray( E[] inputArray )
   {
      for(E element : inputArray) {
         System.out.printf("%s ", element);
      }
      System.out.println();
   }

     public static void main(String []args)
     {
        //System.out.println("Hello World");
    	inverse(intarray); 
        printArray(intarray);
        


     }

}