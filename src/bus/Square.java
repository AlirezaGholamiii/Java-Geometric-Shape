package bus;

public class Square extends Shape {

	private Double side;
	
	public Square()
	{
		super();
		side = 1.0;				
	}
	public Square(String serialNumber, EnumName name  , Double max)
	{
		super(serialNumber,name);
		side = max;	
		
	}
	public Square(String serialNumber, EnumColor color  , Double max)
	{
		super(serialNumber,color);
		side = max;	
		
	}
	
	public Square(String serialNumber,  EnumColor color, EnumName name  , Double max)
	{
		super(serialNumber,name,color);
		side = max;
		
	}
	public Double getSquare() {
		return side;
	}
	public void setSquare(Double side) {
		this.side = side;
	}
	
	
	@Override
	public String toString() {
		return "Square [Serial Number=" + getSerialNumber() + ", Side=" + side + ", EnumColor= " + getColor() + ", EnumName= " + getName() + ", Perimeter= " + calculatePerimeter() + ", Surface= " + calculateSurfaceArea() + "]";
	}
	
	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		perimeter = 4 * getSquare();
		return perimeter;
	}
	
	@Override
	public double calculateSurfaceArea() {
		// TODO Auto-generated method stub
		area = getSquare() * getSquare();
		return area;
	}
	
}
