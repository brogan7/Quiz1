package pkgShape;


public class Rectangle extends Shape implements Comparable <Rectangle> {
	int width;
	int length;
	
	
	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}

	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	@Override
	public double area() {
		int x =  width * length;
		return x;	
	}

	@Override
	public double perimeter() {
		int x = (2 * width) + (2 * length);
		return x;	
	}
	

	
	public int compareTo(Rectangle r) {
		int x =  this.width * this.length;
		int y = r.width * r.length;
		int z = x - y;
		if (z > 0) {
			return 1;
		}
		else if (z < 0) {
			return -1;
		}
		else {
			return 0;
		}
	}


	
	

	
	
}