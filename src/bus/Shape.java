package bus;

public abstract class Shape implements IShape2D {

	private String serialNumber;       
    private  EnumColor color;
    private  EnumName name;
    protected double area;
    protected double perimeter;
    
    
    public Shape() {
		super();
		this.color = EnumColor.Undefined ;
		this.name = EnumName.Undefined;
	}
    
	public Shape(String serialNumber) {
		super();
		this.serialNumber = serialNumber ;
		this.color = EnumColor.Undefined ;
		this.name = EnumName.Undefined;
	}
	
	public Shape(String serialNumber, EnumColor color) {
		super();
		this.serialNumber = serialNumber ;
		this.color = color;
		this.name = EnumName.Undefined ;
	}
	
	public Shape(String serialNumber, EnumName name) {
		super();
		this.serialNumber = serialNumber ;
		this.name = name;
		this.color = EnumColor.Undefined ;
	}
	
	public Shape(String serialNumber, EnumName name, EnumColor color) {
		super();
		this.serialNumber = serialNumber ;
		this.name = name;
		this.color = color ;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public EnumColor getColor() {
		return color;
	}
	
	public void setColor(EnumColor color) {
		this.color = color;
	}
	
	public EnumName getName() {
		return name;
	}
	
	public void setName(EnumName name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Shape [serialNumber=" + serialNumber + ", color=" + color + ", name=" + name + "]";
	}
	
	@Override
	public abstract double calculateSurfaceArea();
	
	@Override
	public abstract double calculatePerimeter();
	
	

}
