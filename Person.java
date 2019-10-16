
public class Person extends NameHolder 
{
	private String lastName;
	
	public Person() throws NameException
	{
		String temp1 = "Bob";
		String temp2 = "Alex";
		lastName = temp1;
		super.setFirstName(temp2);
	}
	
	public Person(String firstName, String lastName) throws NameException
	{
		super.setFirstName(firstName);
		this.lastName = lastName;
	}
	
	public String getLastName()
	{
		return lastName;
	}

	@Override
	public String descriveSelf() 
	{
		return String.format("*** First Name: %s, Last Name: %s***", super.getFirstName(), lastName);
	}

}
