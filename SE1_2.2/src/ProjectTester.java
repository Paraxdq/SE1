import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProjectTester {
	Project p1;
	
	@Test
	void test() {
		p1 = new Project(new String[][] { { "C", "D" }, { "A", "D" }, { "B", "D" }, {"A", "C"} });
		
	}

	@Test
	public void test_1() {
		assertTrue(p1.isSorted(new String[] { "A", "B", "C", "D" }));
	}

	@Test
	public void test_2() {
		assertFalse(p1.isSorted(new String[] { "A", "C", "D", "B" }));
	}

	@Test
	public void test_3() {
		assertFalse(p1.isSorted(new String[] { "A", "B", "A", "D" }));
	}

	@Test
	public void test_4() {
		assertTrue(p1.isSorted(new String[] { "B", "A", "C", "D" }));
	}

}
