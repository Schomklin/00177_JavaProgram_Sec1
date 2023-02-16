public class Rectangle2 implements Shape2 {

	private double width;
	private double length;

	public Rectangle2(double width, double length) {
		this.width = width;
		this.length = length;		
	}

	@Override
	public double getArea() {
		return this.width * this.length;
	}

	// return string in form
	// "Rectangle width = [width], length = [length], color = [color]"
	public String toString() {
		return "Rectangle width = " + getWidth() + ", length = " + getLength() + ",color = " + color;

	}

	public double getWidth() {
		return this.width;
	}

	public double getLength() {
		return this.length;
	}

}
