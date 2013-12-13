import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpitterTest {

	@Test
	public void testSpitter() {
		Spitter spitter = new Spitter();

		assertEquals("Hello world", spitter.spit("Hello world"));
	}
}