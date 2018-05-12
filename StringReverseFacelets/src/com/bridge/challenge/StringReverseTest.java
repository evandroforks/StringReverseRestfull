package com.bridge.challenge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringReverseTest {

	private StringReverse stringReverse;

	@BeforeEach
	void setUp() throws Exception {
		this.stringReverse = new StringReverse();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testStringReverseCreation() {
		assertNotNull(this.stringReverse);
	}

	@Test
	void testSet0InputString() {
		String reverse = "";

		String reversed = this.stringReverse.getReversedString();
		assertEquals(reverse, reversed);
	}

	@Test
	void testSet1InputString() {
		String input = "bridge";
		String reverse = "egdirb";
		this.stringReverse.setInputString(input);

		String reversed = this.stringReverse.getReversedString();
		assertEquals(reverse, reversed);
	}

	@Test
	void testSet2InputString() {
		String input1 = "bridge";
		String input2 = "challenge";
		String reverse2 = "egnellahc";

		this.stringReverse.setInputString(input1);
		this.stringReverse.setInputString(input2);

		String reversed = this.stringReverse.getReversedString();
		assertEquals(reverse2, reversed);
	}

}
