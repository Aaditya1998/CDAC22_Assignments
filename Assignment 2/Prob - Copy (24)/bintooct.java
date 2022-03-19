import java.util.Scanner;
public class bintooct {
      public static void main(String args[])
    {
        int binary, binary1,rem, decimal=0, quot, i=1, j;
        int octal[] = new int[100];
        Scanner sc = new Scanner(System.in);
		System.out.print("Input a Binary Number : ");
        binary = sc.nextInt();
        binary1=binary;
     
      while(binary > 0)
        {
            rem = binary % 10;
            decimal = decimal + rem*i;
            i = i*2;
            binary = binary/10;
        }   

		i=1;
        quot = decimal;
		
        while(quot > 0)
        {
            octal[i++] = quot % 8;
            quot = quot / 8;
        }
		
        System.out.print("Equivalent Octal Value of " +binary1+ " is :");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octal[j]);
        }
 System.out.print("\n");
 
    }
}