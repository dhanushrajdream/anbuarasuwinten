package examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class add {

	@Test
	void addtest() {
		Unit u=new Unit();
		int c=u.add(10, 20);
		assertNotEquals(30,c);
		
	}

}
