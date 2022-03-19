import java.util.Scanner;

class average

{
	public static void main(String args [])
	{	
		Scanner sc = new Scanner(System.in);
	    int i = sc.nextInt();
	    int j = sc.nextInt();
	    int k = sc.nextInt();

		// String s1 = args[0];
		// String s2 = args[1];
		// String s3 = args[2];

		// int i = Integer.parseInt(s1);
		// int j = Integer.parseInt(s2);
	    // int k = Integer.parseInt(s3);
		 System.out.println("Average= "+(i+j+k)/3);	
	}
}