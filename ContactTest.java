package contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("12345","Mindy","Conkrite","2175551234","Springfield IL");
		assertEquals("12345",contact.getContactId());
		assertEquals("Mindy",contact.getFirstname());
		assertEquals("Conkrite", contact.getLastname());
		assertEquals("2175551234",contact.getphone());
		assertEquals("Springfield IL", contact.getAddress());
	}

@Test
void testcontactIdTooLong() {
	assertThrows(IllegalArgumentException.class,()->{
		new Contact(
			"12345678901",
				"Mindy",
				"Conkrite",
				"2175551234",
				"Springfield IL"
			);
		});
}
@Test
void testFirstNameTooLong() {
	assertThrows(IllegalArgumentException.class,()-> {
new Contact(
		"12345",
		"Mindyyyyyyy",
		"Conkrite",
		"2175551234",		
		"Springfield Il"
	
		
		);
	});
}
	@Test
	void testLastNameTooLong() {
		assertThrows(IllegalArgumentException.class,()->{
			new Contact(
					"12345",
					"Mindy",
					"Conkriteeeee",
					"2175551234",
					"123 Main st"
					);
		});
	}
	@Test
	void testPhoneTooShort(){
		assertThrows (IllegalArgumentException.class,() ->{
			new Contact(
					"12345",
					"Mindy",
					"Conkrite",
					"217555123",
					"123 Main st"
					);
		});
	}
	@Test
	void testAddressTooLong() {
		assertThrows(IllegalArgumentException.class,() ->{
			new Contact(
					"12345",
					"Mindy",
					"Conkrite",
					"2175551234",
					"123 Main Street Springfield ILLINOIS"
				);
		});
		}
}


