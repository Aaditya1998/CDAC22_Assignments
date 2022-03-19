import java.util.Scanner;
public class oct {
      public static void main(String args[])
    {
        int decimal, rem, quot, i=1, j;
        int octal[] = new int[100];
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Input a Decimal Number: ");
        decimal = sc.nextInt();
		
        quot = decimal;
		
        while(quot != 0)
        {
            octal[i++] = quot%8;
            quot = quot/8;
        }
		
        System.out.print("Octal number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octal[j]);
        }
		System.out.print("\n");
    }
}