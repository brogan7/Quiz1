package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle{
	int depth;
	double v;
	double sa;
	
	
	
	public Cuboid(int width, int length, int depth) {
		super(width, length);
		this.depth = depth; 
		// TODO Auto-generated constructor stub
		
	}
	
	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public double volume() {
		double v = width * length * depth;
		return v;
	}
	
	@Override
	public double area() {      // Surface Area
		int sa = 2*length*width + 2*length*depth + 2*depth*width;
		return sa;
	}

	@Override
	public double perimeter() throws UnsupportedOperationException {
		try {
			perimeter();
		}
		catch (UnsupportedOperationException e) 
		{	
		throw e;
		}
		return (Double) null; // Only throws an exception, does not return anything 
	}
	
	
	class SortByArea implements Comparator<Cuboid> 
	{ 
	    public int compare(Cuboid a, Cuboid b) 
	    { 
	        return Double.compare(a.area(), b.area());
	    } 
	} 
	
	class SortByVolume implements Comparator<Cuboid> 
	{  
	    public int compare(Cuboid a, Cuboid b) 
	    { 
	    	return Double.compare(a.volume(), b.volume());
	    	
	    } 
	} 


}

