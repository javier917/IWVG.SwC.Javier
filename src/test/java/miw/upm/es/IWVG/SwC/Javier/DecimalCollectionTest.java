package miw.upm.es.IWVG.SwC.Javier;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

	private DecimalCollection dc;
    @Before
    public void before() {
        this.dc = new DecimalCollection();
        this.dc.add(2.0);
        this.dc.add(-1.0);
        this.dc.add(3.0);
        this.dc.add(2.0);
    }

    @Test
    public void testDecimalCollection() {
        this.dc = new DecimalCollection();
        assertEquals(0, this.dc.size());
    }
    @Test
    public void testSize(){
    	assertEquals(4,this.dc.size());
    }
    
    @Test
    public void testAdd() {
        assertEquals(4, this.dc.size());
    }

    @Test
    public void testSum() {
        assertEquals(6, this.dc.sum(), 10e-5);
    }

    @Test
    public void testHigher() {
        assertEquals(3, this.dc.higher(), 10e-5);
    }
    
    @Test
    public void testMultiplicar() {
    	this.dc.multiplicar(2.0);
    	assertEquals(4, this.dc.getCollection().get(0), 10e-5);
    	assertEquals(-2, this.dc.getCollection().get(1), 10e-5);
    	assertEquals(6, this.dc.getCollection().get(2), 10e-5);
    	assertEquals(4, this.dc.getCollection().get(3), 10e-5);
    }

}
