package lesson1;

public class Cube {
	int length, breadth, height;
	
	public int getCubeVolume()
	{
		return(length* breadth * height);
	}
	
	/*Constructor is the first method that will be executed
	 * Values are provided here by java as it assigned below*/
	Cube()
	{
		//System.out.println("printed by the constructor");
		length	= 10;
		breadth	= 20;
		height	= 30;
	}
	
	/*CONSTRUCTOR OVERLOADING
	 * This constructor help you to provide value yourself*/
	Cube(int l, int b,int  h)
	{
		length	= l;
		breadth	= b;
		height	= h;
	}
}
