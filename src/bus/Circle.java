package bus;

public class Circle extends Shape {

	private Double radius;
	final double PI = 3.14159; 
	
	public Circle() {
		super();
		radius = 1.0;				
	}
	
	public Circle(String serialNumber, EnumName name  , Double max) {
		super(serialNumber,name);
		radius = max;	
		
	}
	
	public Circle(String serialNumber, EnumColor color  , Double max) {
		super(serialNumber,color);
		radius = max;	
		
	}
	
	public Circle(String serialNumber,  EnumColor color, EnumName name  , Double max) {
		super(serialNumber,name,color);
		radius = max;
		
	}
	
	public Double getRadius() {
		return radius;
	}
	
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Circle [Serial Number=" + getSerialNumber() + ", Radius=" + radius + ", EnumColor= " + getColor() + ", EnumName= " + getName() + ", Perimeter= " + calculatePerimeter() + ", Surface= " + calculateSurfaceArea() + "]";
	}
	
	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		perimeter = 2 * PI * this.getRadius();
		return perimeter;
	}
	
	@Override
	public double calculateSurfaceArea() {
		// TODO Auto-generated method stub
		area = PI * getRadius() * getRadius();
		return area;
	}
	
	
}
