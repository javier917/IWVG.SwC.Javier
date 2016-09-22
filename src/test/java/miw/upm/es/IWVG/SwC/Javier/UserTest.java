package miw.upm.es.IWVG.SwC.Javier;

import static org.junit.Assert.*;

import org.junit.Test;




import org.junit.Before;


public class UserTest {
private User us;

	   @Before
	    public void before() {
	        us = new User(1, "Javi", "Ruiz");
	    }
	
	@Test
	public void testUser() {
		assertEquals(1,us.getNumber());
		assertTrue("Javi".equals(us.getName()));
		assertEquals("Ruiz",us.getFamilyName());
	}

	@Test
	public void testFullName() {
		assertEquals("Javi Ruiz", us.fullName());
	}

	@Test
	public void testInitials() {
		assertEquals("J.", us.initials());
	}

	@Test
	public void testGetNumber() {
		assertEquals(1,us.getNumber());
	}

	@Test
	public void testGetName() {
		assertEquals("Javi",us.getName());
	}

	@Test
	public void testGetFamilyName() {
		assertEquals("Ruiz",us.getFamilyName());
	}

}
