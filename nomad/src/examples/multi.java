package examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class multi {

	@Test
	void multitest() {
		Unit u=new Unit();
		int c=u.multi(20,10);
		assertEquals(200,c);
		
	}

}
