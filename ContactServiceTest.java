package contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

class ContactSeriveTest {
	@Test
	void testAddContact(){
		ContactService service = new ContactService();
		
		Contact contact1 = new Contact(
				"12345",
				"Mindy",
				"Conkrite",
				"2175551234",
				"123 Main St"
				);
		Contact contact2 = new Contact(
				"12345",
				"James",
				"Conkrite",
				"2175556789",
				"974 Main St"
	);
	service.addContact(contact1);
	
	assertThrows(IllegalArgumentException.class,() -> {
		service.addContact(contact1);
	});
	}

@Test
void testDeleteContact() {
	ContactService service=new ContactService();
	Contact contact =new Contact(
			"12345",
			"Mindy",
			"Conkrite",
			"2175551234",
			"123 Main St"
);
 service.addContact(contact);
 service.deleteContact("12345");
 }
 

@Test
void testDeleteContactNotFound() {
	ContactService service =new ContactService();
	assertThrows(IllegalArgumentException.class,() ->{ 
		service.deleteContact("99999");
	});
}
}	

