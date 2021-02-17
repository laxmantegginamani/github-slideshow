package test;

public class array {
	
	public static void main(String []args)
	{
		int array[]={1,4,6,7,8};
		for(int i=0;i<5;i++)
		{
			System.out.println(array[i]);
		}
		for(int i:array)
		{
			System.out.println(i);
		}
//below para shows how to be in infinite loop		
	/*	for(;;)
		{
			System.out.println("infinite loop");	
		}   */
	}

}

