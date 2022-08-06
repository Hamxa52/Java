class MainDemoExp
{
	public static void main(String[] arg)
	{
		int a=60;
		int c;
		try{
			c = a / arg.length;
			System.out.println("c:"+ c);
			arg[5]="Ali";
		}/*catch(ArithmeticException e)
		{
			System.out.println("Can not divide by zero");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Out of Bounds");
		}***/
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("After Catch");
	}
}