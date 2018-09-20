import java.util.*;
class Sum
{
 public static int sumOfDigit(int num)
  {
    int sum=0;
    if (num == 0)
    return sum;
            sum = num%10 + sumOfDigit(num/10);
    return sum;
  }
 public static void main(String args[]) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("ENTER NUMBER AS STRING: ");
    String a=sc.next();
    int num = Integer.parseInt(a);
    int s=sumOfDigit(num);
    System.out.println("Sum = "+s);
  }
}