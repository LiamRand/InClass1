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
	public void testCompareTo() throws NameException
	{
		Student firstStudent = new Student("X", "Y", 2);
		Student secondStudent = new Student("X", "Y", 3);
		
		int actual = secondStudent.compareTo(firstStudent);
		
		//Should be larger than zero
		boolean result = false;
		
		if(actual > 0)
			result = true;
		
		assertTrue(result);
		
		Student thirdStudent = new Student("X", "Y", 5);
		
		actual = secondStudent.compareTo(thirdStudent);
		
		//Should be smaller than zero
		result = false;
		
		if(actual < 0)
			result = true;
		
		assertTrue(result);
		
		Student fourthStudent = new Student("X", "Y", 5);
		
		actual = thirdStudent.compareTo(fourthStudent);
		
		//Should be zero
		result = false;
		
		if(actual == 0)
			result = true;
		
		assertTrue(result);
	}
	
	@Test
	public void testGet() throws NameException
	{
		int expected = 4;
		int rating = expected;
		String firstName = "Alex";
		String lastName = "Bo";
		Student s = new Student(firstName, lastName, rating);
		int actual = s.getRating();
		assertEquals(expected, actual);
	}

}
