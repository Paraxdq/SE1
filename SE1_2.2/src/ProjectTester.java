import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProjectTester {
	Project p1;
	
	@Before
	public void setUp() {
		p1 = new Project(new String[][] { { "C", "D" }, { "A", "D" }, { "B", "D" }, {"A", "C"} });
	}

	@Test
	public void test_1() {
		assertTrue(p1.isWellSorted(new String[] { "A", "B", "C", "D" }));
	}

	@Test
	public void test_2() {
		assertFalse(p1.isWellSorted(new String[] { "A", "C", "D", "B" }));
	}

	@Test
	public void test_3() {
		assertFalse(p1.isWellSorted(new String[] { "A", "B", "A", "D" }));
	}

	@Test
	public void test_4() {
		assertTrue(p1.isWellSorted(new String[] { "B", "A", "C", "D" }));
	}

}
