import java.util.*;
class Program5
{
   public static void main(String args[])
   {
     int a,b,temp;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter 1st number:");
     a=s.nextInt();
     System.out.println("Enter 2nd number:");
     b=s.nextInt();
    
       temp=a;
       a=b;
       b=temp;
       System.out.println("The value of a after swapping:"+a);
       System.out.println("The value of a after swapping:"+b);
  }
}
