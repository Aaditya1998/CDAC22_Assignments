import java.util.Scanner;
public class dtob {
      public static void main(String args[])
    {
        int decimal, q, i=1, j;
        int Binary[] = new int[100];
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Input a Decimal Number : ");
        decimal = sc.nextInt();
		
        q = decimal;
		
        while(q != 0)
        {
            Binary[i++] = q%2;
            q = q/2;
        }
		
        System.out.print("Binary number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(Binary[j]);
        }
        System.out.print("\n");
    }
}