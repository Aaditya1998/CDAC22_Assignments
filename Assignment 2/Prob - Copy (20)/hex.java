import java.util.Scanner;
public class hex {
      public static void main(String args[])
    {
        int decimal, rem;
        String hexadecimal="";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Input a decimal number: ");
        decimal = sc.nextInt();
		
        while(decimal>0)
        {
            rem = decimal%16;
            hexadecimal = hex[rem] + hexadecimal;
            decimal = decimal/16;
        }
        System.out.print("Hexadecimal number is : "+hexadecimal+"\n");         
    }
}