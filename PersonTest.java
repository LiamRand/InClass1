import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
			
		try {
			String firstName = "";
			String lastName = "Smith";
			Person p = new Person(firstName, lastName);
			fail("Did not get an excemption");
		} catch (NameException e) {
			// TODO Auto-generated catch block
		}
	}
	
	@Test
	public void constructorGoodTest()
	{
		try {
			String firstName = "Bob";
			String lastName = "Smith";
			Person p = new Person(firstName, lastName);
		} catch (NameException e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		}
	}
	
	@Test
	public void describeSelfTest()
	{
		try {
			String firstName = "Bob";
			String lastName = "Smith";
			Person p = new Person(firstName, lastName);
			
			String expected = String.format("*** First Name: %s, Last Name: %s***", firstName, lastName);
			String actual = p.descriveSelf();
			
			assertEquals(expected, actual);
			
		} catch (NameException e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		}
	}
	
	@Test
	public void constructorOrderTest()
	{
		try {
			String firstName = "Bob";
			String lastName = "Smith";
			Person p = new Person(firstName, lastName);
			
			String expected = String.format("*** First Name: %s, Last Name: %s***", firstName, lastName);
			String actual = p.descriveSelf();
			
			assertEquals(expected, actual);
			
		} catch (NameException e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		}
	}

}
