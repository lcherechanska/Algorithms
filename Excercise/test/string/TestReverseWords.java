package string;

import org.junit.Test;

import junit.framework.TestCase;

public class TestReverseWords extends TestCase {

	@Test
	public void testAdd() {
		
		String str = "the sky is blue";

		assertEquals("blue is sky the", ReverseWords.reverseWords(str));

	}
}
