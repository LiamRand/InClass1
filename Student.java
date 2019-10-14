
public class Student extends Person implements Comparable<Student>
{

	private String className;
	private int rating;
	
	private static final int INITIAL_RATING = 5;

	
	public Student() throws NameException 
	{
		super();
		
		rating = INITIAL_RATING;
	}
	
	@Override
	public int compareTo(Student o) 
	{
		return 0;
	}
	
	public int getRating()
	{
		return rating;
	}

}
