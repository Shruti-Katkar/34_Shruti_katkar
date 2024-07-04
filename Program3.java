import java.util.*; 
class Program3
{
   public static void main(String args[])
   {
     Double principle,rate,time,n,Accumulated_amt,Compound_interest;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter principle amount:");
     principle=s.nextDouble();
     System.out.println("Enter principle rate:");
     rate=s.nextDouble()/100;
     System.out.println("Enter time period :");
     time=s.nextDouble();
     System.out.println("Enter no of times interest compounded per year :");
     n=s.nextDouble();  
   
     Accumulated_amt=principle*Math.pow((1+rate/n),n*time);
     System.out.println("The accumulated amount is:"+Accumulated_amt);

     Compound_interest=Accumulated_amt-principle;
     System.out.println("The compound interest is:"+Compound_interest);
}
}

    
