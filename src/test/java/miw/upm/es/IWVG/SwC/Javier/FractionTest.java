package miw.upm.es.IWVG.SwC.Javier;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class FractionTest {
private Fraction ft;

@Before
public void before(){
	ft=new Fraction(2,4);
}

@Test
public void testFractionIntInt() {
    assertEquals(2, ft.getNumerator());
    assertEquals(4, ft.getDenominator());
}
@Test
public void testFraction(){
	this.ft=new Fraction();
	assertEquals(1,ft.getNumerator());
	assertEquals(1,ft.getDenominator());
}

@Test
public void testDecimal(){
	assertEquals(0.5, ft.decimal(), 10e-5);
}
}
