package miw.upm.es.IWVG.SwC.Javier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;



public class FractionTest {
    private Fraction ft;

    @Before
    public void before() {
        ft = new Fraction(2, 4);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(2, ft.getNumerator());
        assertEquals(4, ft.getDenominator());
    }

    @Test
    public void testFraction() {
        this.ft = new Fraction();
        assertEquals(1, ft.getNumerator());
        assertEquals(1, ft.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(0.5, ft.decimal(), 10e-5);
    }

    @Test
    public void testMayorFalse() {
        Fraction f2 = new Fraction(3, 2);
        assertFalse(ft.mayor(f2));
    }

    @Test
    public void testMayorTrue() {
        Fraction f2 = new Fraction(1, 3);
        assertTrue(ft.mayor(f2));
    }

    @Test
    public void testIsEquivalente() {
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = new Fraction(3, 5);

        assertTrue(ft.isEquivalente(f2));
        assertFalse(ft.isEquivalente(f3));
    }
    
    @Test
    public void testSumaDenomIgual() {
        Fraction f = ft.suma(new Fraction(5, 4));
               
        assertEquals(7, f.getNumerator());
        assertEquals(4, f.getDenominator());
        
    }
    @Test
    public void testSumaDenomDiferente() {
      
        Fraction f2 = ft.suma(new Fraction(7, 5));
        
        assertEquals(38, f2.getNumerator());
        assertEquals(20, f2.getDenominator());
    }

}