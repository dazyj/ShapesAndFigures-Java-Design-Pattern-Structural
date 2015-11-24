package fr.iutvalence.info.dut.m3105.preamble;

public class ShapeShadowDecorator extends Shape
{
	private Shape shape;
	private int angle;
	private int intensity;
	
	public ShapeShadowDecorator(Shape shape, int angle, int intensity)
	{
		super();
		this.shape = shape;
		this.angle = angle;
		this.intensity = intensity;
	}

	@Override
	public void draw(Position position) 
	{
		this.shape.draw(position);
		System.out.println(this.toString());
	}
	
	public String toString()
	{
		String string = "with shadow (a =" + this.angle + ", i = " + this.intensity + ")";
		return string;
	}
}
