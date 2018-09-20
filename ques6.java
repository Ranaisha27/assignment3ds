import java.util.*;
 class Duplicate {
    public static String removeDup(String s)
	{
	   int l=s.length();
	   if (l<= 1) 
		return s;
    	   if( s.substring(0,l-1).contains(s.substring(l-1,l)) ) 
		return removeDup(s.substring(0,l-1));
    	   else 
		return removeDup(s.substring(0,l-1)) + s.substring(l-1,l);
	}
	

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("ENTER STRING:");
	String str=sc.nextLine();
        System.out.println(removeDup(str));
    }
}