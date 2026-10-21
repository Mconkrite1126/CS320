package contact;
import java.util.ArrayList;
public class ContactService {
	private ArrayList<Contact> contacts =new ArrayList<Contact>();
	public void addContact(Contact contact) {
		for (Contact existingContact : contacts) {
			if (existingContact.getContactId().equals(contact.getContactId())) {
				throw new IllegalArgumentException("ContactID already exisits");
			}
		}
		contacts.add(contact);
	}
	public void deleteContact (String contactID) {
		Contact contactToDelete = null;
		for (Contact contact : contacts) {
			if (contact.getContactId().equals(contactID)) {
				contactToDelete =contact;
						break;
			}
		}
		if (contactToDelete == null) {
			throw new IllegalArgumentException("Contact ID not found");
		}
		contacts.remove(contactToDelete);
	}
public void 	updateContact(String contactID,String firstname, String lastname, String phone,String address) {
						
	Contact contactToUpdate=null;
	for (Contact contact : contacts) {
		if (contact.getContactId().equals(contactID)) {
			contactToUpdate=contact;
			break;
		}
		}
	if (contactToUpdate ==null) {
	throw new IllegalArgumentException("Contact Id not found");
	}
	contactToUpdate.setFirstName(firstname);
	contactToUpdate.setLastName(lastname);
	contactToUpdate.setPhone(phone);
	contactToUpdate.SetAddress(address);
}
	
	}


