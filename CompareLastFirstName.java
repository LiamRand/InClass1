import java.util.Comparator;

public class CompareLastFirstName implements Comparator<Student>
{
	@Override
	public int compare(Student first, Student second) 
	{
		String firstName = first.getFirstName();
		String lastName = first.getLastName();
		
		String secondFirstName = second.getFirstName();
		String secondLastName = second.getLastName();
		
		if(firstName.compareTo(secondFirstName) < 0)
		{
			return -1;
		}
		else if(firstName.compareTo(secondFirstName) == 0)
		{
			if(lastName.compareTo(secondLastName) < 0)
				return -1;
			else if(lastName.compareTo(secondFirstName) ==0)
				return 0;
			else
				return 1;
				
		}
		else
		{
			return 1;
		}
	}
}
