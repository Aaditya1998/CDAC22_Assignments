
public class binsum
{
	public static void main(String args[])
    {
		String s1 = args[0];
		String s2 = args[1];
		
		long bin1 = Integer.parseInt(s1);
		long bin2 = Integer.parseInt(s2);
		int i = 0, rem = 0;
        int[] sum = new int[20];
		
       while (bin1 != 0 || bin2 != 0) 
  {
   sum[i++] = (int)((bin1 % 10 + bin2 % 10 + rem) % 2);
   rem = (int)((bin1 % 10 + bin2 % 10 + rem) / 2);
   bin1 = bin1 / 10;
   bin2 = bin2 / 10;
  }
  if (rem != 0) {
   sum[i++] = rem;
  }
  --i;
  System.out.print("Sum of two binary numbers:");
  while (i >= 0) {
   System.out.print(sum[i--]);
  }
   System.out.print("\n");  
 }
}