
public class Person extends NameHolder 
{
	private String lastName;
	
	public Person()
	{
		
	}
	
	public Person(String firstName, String lastName) throws NameException
	{
		super.setFirstName(firstName);
		this.lastName = lastName;
	}

	@Override
	public String descriveSelf() 
	{
		return String.format("*** First Name: %s, Last Name: %s***", super.getFirstName(), lastName);
	}

}
