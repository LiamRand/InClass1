import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest 
{

	private static final int INITIAL_RATING = 5;

	@Before
	public void setUp() throws Exception
	{
		
	}
	
	@Test 
	public void testStudent()
	{
		Student s;
		
		try 
		{
			s = new Student();
		
			int rating = s.getRating();
			int expected = INITIAL_RATING;
			
			assertEquals(expected, rating);
		} 
		catch (NameException e) 
		{
			// TODO Auto-generated catch block
			fail();
		}
	}
	
	@Test
	public void testCompareTo()
	{
		fail("Not yet implemented");
	}

}
