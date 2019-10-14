
public abstract class NameHolder 
{
	protected String firstName;
	
	public abstract String descriveSelf();
	
	@Override
	public String toString()
	{
		return "First name: " + firstName;
	}
	
	protected String getFirstName()
	{
		return firstName;
	}
	
	protected void setFirstName(String firstName) throws NameException
	{
		if(!firstName.isEmpty())
		{
			this.firstName = firstName;
		}
		else
		{
			throw new NameException("No first name provided!");
		}
	}
}
