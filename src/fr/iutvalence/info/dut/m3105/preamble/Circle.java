package fr.iutvalence.info.dut.m3105.preamble;

public class Circle extends Shape
{
	
	private int radius;
	
	public Circle(int radius)
	{
		super();
		this.radius = radius;
	}

	public void draw(Position position) 
	{
		// TODO Auto-generated method stub
		System.out.println("drawing" + this.toString() + "at (" + position.getX() + " ," + position.getY() + ")");
	}
	
	public String toString()
	{
		String string = "[circle (r =" + this.radius + ")]";
		return string;
	}

}
