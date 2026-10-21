package contact;

public class Contact {
	private String contactId;
	private String firstname;
	private String lastname;
	private String phone;
	private String address;
	
	public Contact(String contactId, String firstname, String lastname, String phone, String address) {
{ 
	if (contactId == null || contactId.length()>10){
		throw new IllegalArgumentException("Invalid contactId");
	}
	this.contactId=contactId;
	if (firstname == null||firstname.length()>10){
		throw new IllegalArgumentException("Invalid firstname");
	}
	this.firstname=firstname;
			if (lastname ==null|| lastname.length()>10){
		throw new IllegalArgumentException("Invalid lastname");
		}
		this.lastname=lastname;
	}
	if(phone == null||phone.length()!=10) {
		throw new IllegalArgumentException("Invalid phone");
	}
		
	this.phone=phone;
	if (address==null||address.length()>30) {
		throw new IllegalArgumentException ("Illegal address");
	}
	this.address=address;
}
	public String getContactId() {
		
		return contactId;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getphone() {
		return phone;
	}
	public String getAddress() {
		return address;
		
	}
	public void setFirstName(String firstname) {
		if (firstname ==null|| firstname.length() >10) {
			throw new IllegalArgumentException("Invalid firstname");
		}
		this.firstname=firstname;
	}
		public void setLastName (String lastname) {
			if (lastname==null||lastname.length()>10) {
				throw new IllegalArgumentException ("Invalid lastname");
			}
			this.lastname=lastname;
		}
		public void setPhone (String phone) {
			if (phone==null || phone.length()!=10) {
				throw new IllegalArgumentException ("Invalid phone");
			}
			this.phone=phone;
		}
		public void SetAddress (String address) {
			if (address==null||address.length()>30) {
				throw new IllegalArgumentException("Invalid address");
			}
						this.address=address;
			}
						
			}
	

