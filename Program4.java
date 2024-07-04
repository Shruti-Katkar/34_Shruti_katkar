import java.util.*;

class Program4
{
  public static void main(String args[])
  {
    double base,exponent;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter base:");
     base=s.nextDouble();   
    System.out.println("Enter exponent:");
     exponent=s.nextDouble();
    
    double result=Math.pow(base,exponent);
    System.out.println("The power of number is:"+result);
 }
}