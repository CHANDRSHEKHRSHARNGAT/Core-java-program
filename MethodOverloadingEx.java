 import java.io.*;
class MethodOverloadingEx {
	static int add(int a, int b)
	{
	return a + b;
	} 
	static double add(int i, int j, int k)
	{
		return i + j + k;
	}
	public static void main(String args[])
	{
		System.out.println("addition with 2 parameters");
		System.out.println(add(4, 6));
		System.out.println("addition with 3 parameters");
		System.out.println(add(41, 6, 7));
	}
}
 