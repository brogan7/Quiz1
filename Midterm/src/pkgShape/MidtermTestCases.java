package pkgShape;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

public class MidtermTestCases {

	@Test
	public void getWidth_test() {
		Rectangle r = new Rectangle(5, 4);
	    assertEquals("width", 5, r.getWidth());
		
	}
	
	@Test
	public void getLength_test() {
		Rectangle r = new Rectangle(5, 4);
	    assertEquals("length", 4, r.getLength());
		
	}
	
	@Test
	public void setWidth_test(){
		Rectangle r = new Rectangle(5, 4);
        r.setWidth(10);
		assertEquals(10, r.getWidth());
   }
	
	@Test
	public void setLength_test(){
		Rectangle r = new Rectangle(5, 4);
        r.setLength(9);
		assertEquals(9, r.getLength());
   }
	
	@Test
	public void getDepth_test() {
		Cuboid c = new Cuboid(5, 4, 7);
	    assertEquals("depth", 7, c.getDepth());
	}
	
	@Test
	public void setDepth_test(){
		Cuboid c = new Cuboid(5, 4, 7);
        c.setDepth(9);
		assertEquals(9, c.getDepth());
   }
	
	@Test
	public void rectanglearea_test() {
		Rectangle r = new Rectangle(5, 4);
		assertEquals(20, r.area(), "area");
	}
	
	@Test
	public void cuboidarea_test() {
		Cuboid c = new Cuboid(5, 4, 7);
		assertEquals(166, c.area(), "surface area");
	}
	
	@Test
	public void rectangleperimeter_test() {
		Rectangle r = new Rectangle(5, 4);
		assertEquals(18, r.perimeter(), "perimeter");
	}
	
	@Test
	public void cuboidperimeter_test() {
		Cuboid c = new Cuboid(5, 4, 7);
		boolean thrown = false;

		  try {
		    c.perimeter();
		  } catch (UnsupportedOperationException e) {
		    thrown = true;
		  }

		  assertTrue(thrown);
		}
	
	@Test
	public void compareTo_test1() {
		Rectangle r = new Rectangle(5, 4);
		Rectangle t = new Rectangle(2, 2);
		assertEquals(1, r.compareTo(t), "sorts");
			
	}
	
	@Test
	public void compareTo_test2() {
		Rectangle r = new Rectangle(2, 2);
		Rectangle t = new Rectangle(2, 2);
		assertEquals(0, r.compareTo(t), "sorts");
	}
	
	@Test
	public void compareTo_test3() {
		Rectangle r = new Rectangle(2, 1);
		Rectangle t = new Rectangle(4, 3);
		assertEquals(-1, r.compareTo(t), "sorts");
	}
	
	@Test
	public void sortByArea_test1() {
		Cuboid a = new Cuboid(5, 4, 7); 
        Cuboid b = new Cuboid(1, 2, 3);
        
        assertEquals(1, Double.compare(a.area(), b.area()), "sorts");
	}
	
	@Test
	public void sortByArea_test2() {
		Cuboid a = new Cuboid(1, 2, 3); 
        Cuboid b = new Cuboid(1, 2, 3);
        
        assertEquals(0, Double.compare(a.area(), b.area()), "sorts");
	}
	
	@Test
	public void sortByArea_test3() {
		Cuboid a = new Cuboid(1, 2, 3); 
        Cuboid b = new Cuboid(4, 5, 6);
        
        assertEquals(-1, Double.compare(a.area(), b.area()), "sorts");
	}
	
	@Test
	public void sortByVolume_test1() {
		Cuboid a = new Cuboid(5, 4, 7); 
        Cuboid b = new Cuboid(1, 2, 3);
        
        assertEquals(1, Double.compare(a.volume(), b.volume()), "sorts");
	}
	
	@Test
	public void sortByVolume_test2() {
		Cuboid a = new Cuboid(1, 2, 3); 
        Cuboid b = new Cuboid(1, 2, 3);
        
        assertEquals(0, Double.compare(a.volume(), b.volume()), "sorts");
	}
	
	@Test
	public void sortByVolume_test3() {
		Cuboid a = new Cuboid(1, 2, 3); 
        Cuboid b = new Cuboid(4, 5, 6);
        
        assertEquals(-1, Double.compare(a.volume(), b.volume()), "sorts");
	}
	
	@Test
	public void rectangleConstruction_test1() {
		     Rectangle r = new Rectangle(4,5);
		     boolean work = false;
		     
		     if (r.getWidth() == 4 && r.getLength() == 5) {
		    	 work = true;
		     }
		     
		     assertTrue(work);
		     	
	}
	
	@Test
	public void rectangleConstruction_test2() {
	     Rectangle r = new Rectangle(4,6);
	     boolean work = false;
	     
	     if (r.getWidth() == 4 && r.getLength() == 5) {
	    	 work = true;
	     }
	     
	     assertFalse(work);
	}
	
	@Test
	public void cuboidConstruction_test1() {
	     Cuboid c = new Cuboid(4,5,7);
	     boolean work = false;
	     
	     if (c.getWidth() == 4 && c.getLength() == 5 && c.getDepth() == 7) {
	    	 work = true;
	     }
	     
	     assertTrue(work);
	}
	
	@Test
	public void cuboidConstruction_test2() {
	     Cuboid c = new Cuboid(1,2,3);
	     boolean work = false;
	     
	     if (c.getWidth() == 1 && c.getLength() == 2 && c.getDepth() == 7) {
	    	 work = true;
	     }
	     
	     assertFalse(work);
	}
	
}