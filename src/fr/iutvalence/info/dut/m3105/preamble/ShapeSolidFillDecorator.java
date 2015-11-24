package fr.iutvalence.info.dut.m3105.preamble;

public class ShapeSolidFillDecorator extends Shape
{
	private Shape shape;
	private String color;
	
	public ShapeSolidFillDecorator(Shape shape, String color) 
	{
		super();
		this.shape = shape;
		this.color = color;
	}

	@Override
	public void draw(Position position) 
	{
		this.shape.draw(position);
		System.out.println(this.toString());
	}
	
	public String toString()
	{
		String string = "with Solid Fill (c =" + this.color + ")";
		return string;
	}
}
