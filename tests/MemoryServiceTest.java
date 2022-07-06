import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


class MemoryServiceTest {

	int[] arr;

	@Test
	void testGetMaxArrayMemory() {
		int maxSize = MemoryService.getMaxArrayMemory();
		boolean flag;
		try {
			arr = new int[maxSize];
			flag = true;
			arr = null;
		} catch (OutOfMemoryError e) {
			flag = false;
		}
		assertTrue(flag);
		try {
			arr = new int[maxSize + 1];
			flag = true;
			arr = null;
		} catch (OutOfMemoryError e) {
			flag = false;
		}
        System.out.println(maxSize);
		assertFalse(flag);
	}

}
