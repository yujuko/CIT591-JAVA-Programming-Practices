

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.MyCustomString;

public class MyCustomStringTest {
	
	MyCustomString myCustomString;
	
	@BeforeEach
	public void setUp() {
		myCustomString=new MyCustomString();
	}
	
	//Test Purpose: tests basic functionality
	@Test
	public void replaceAllDigitsTest1() {
		myCustomString.setMyString("Dog456Dog");
		myCustomString.replaceAllDigits('X');
		assertEquals("DogXXXDog", myCustomString.getMyString());	
	}	
	
	//Test Purpose: tests String remains unchanged if String does not have digits
	@Test
	public void replaceAllDigitsTest2() {
		myCustomString.setMyString("DogDog");
		myCustomString.replaceAllDigits('X');
		assertEquals("DogDog", myCustomString.getMyString());	
	}	
	
	//Test Purpose: tests basic functionality
	@Test
	public void removeAllNonCharactersTest1() {
		myCustomString.setMyString("dog456dog");
		myCustomString.removeAllNonCharacters();
		assertEquals("dogdog", myCustomString.getMyString());		
	}
		
	@Test
	public void removeTrailingNonCharactersTest1() {
		
		myCustomString.setMyString("Dog456Dog!");
		myCustomString.removeTrailingNonCharacters();
		assertEquals("Dog456Dog", myCustomString.getMyString());
	}
	
}
