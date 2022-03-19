class table

{
	public static void main(String args [])
	{	
		String s1 = args[0];
		
		int i = Integer.parseInt(s1);
	
		for (int k=0; k< 10; k++){
   System.out.println(i+"x"+(k+1)+"="+(i*(k+1)));
		}
	}
}