import java.util.*;
class Contact
{
	private String contactsname;
	private String email;
	private String number;

	public String getContactsname()
	{
		return contactsname;
	}
	public void setContactsname(String contactsname)
	{
		this.contactsname = contactsname;
	}
	public String getEmail()
	{
		return email;

	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getNumber()
	{
		return number;
	}
	public void setNumber(String number)
	{
		this.number = number;
	}
public static void main(String[] args)
{
	Contact contact = new Contact();
	contact.setContactsname("Amrit");
	contact.setEmail("rajamrit307@gmail.com");
	contact.setNumber("7389364768");

	System.out.println(contact.getContactsname());
	System.out.println(contact.getEmail());
	System.out.println(contact.getNumber());


}
}