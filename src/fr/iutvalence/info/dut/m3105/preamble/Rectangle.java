package fr.iutvalence.info.dut.m3105.preamble;

public class Rectangle extends Shape 
{
	private int height;
	private int width;
	
	public Rectangle(int height, int width) 
	{
		super();
		this.height = height;
		this.width = width;
	}

	@Override
	public void draw(Position position) 
	{
		// TODO Auto-generated method stub
		System.out.println("drawing" + this.toString() + "at (" + position.getX() + " ," + position.getY() + ")");
	}
	
	public String toString()
	{
		String string = "[rectangle (h =" + this.height + ", w = " + this.width + ")]";
		return string;
	}
}
