package fr.iutvalence.info.dut.m3105.preamble;

public class ShapeBorderDecorator extends Shape
{
	private Shape shape;
	private int thickness;

	public ShapeBorderDecorator(Shape shape, int thickness) 
	{
		super();
		this.shape = shape;
		this.thickness = thickness;
	}

	@Override
	public void draw(Position position) 
	{
		this.shape.draw(position);
		System.out.println(toString());
	}
	
	public String toString()
	{
		String string = "with border (t =" + this.thickness + ")";
		return string;
	}
}
