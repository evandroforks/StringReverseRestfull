/**
 *
 */
package com.bridge.challenge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringReverseTest {

	String inputString = "inputString";
	String reversedString = "reversedString";

	private StringReverse stringReverse;
	private HttpServletResponse response;
	private MockHttpServletRequest request;

    @BeforeEach
    void setUp() throws Exception {
        this.stringReverse = new StringReverse();
        this.stringReverse.init(mock(ServletConfig.class));

        request = new MockHttpServletRequest();
        response = mock(HttpServletResponse.class);
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void testInitServletConfig() {
        assertTrue(this.stringReverse.reversedStrings.size() == 0);
    }

    @Test
    void testSet0NullInputString() throws IOException, ServletException {
    	String input = null;
    	String reverse = "";

    	this.request.setParameter(inputString, input);
    	this.stringReverse.doPost(request, response);

    	String reversed = (String) this.request.getAttribute(reversedString);
    	assertEquals(reverse, reversed);
    }

    @Test
    void testSet0InputString() throws IOException, ServletException {
    	String input = "";
    	String reverse = "";

    	this.request.setParameter(inputString, input);
    	this.stringReverse.doPost(request, response);

    	String reversed = (String) this.request.getAttribute(reversedString);
    	assertEquals(reverse, reversed);
    }

    @Test
    void testSet1InputString() throws IOException, ServletException {
    	String input = "bridge";
    	String reverse = "egdirb";

    	this.request.setParameter(inputString, input);
    	this.stringReverse.doPost(request, response);

    	String reversed = (String) this.request.getAttribute(reversedString);
    	assertEquals(reverse, reversed);
    }

	@Test
	void testSet2InputString() throws IOException, ServletException {
		String input = "bridge";
		String input2 = "challenge";
		String reverse2 = "egnellahc";

		this.request.setParameter(inputString, input);
		this.stringReverse.doPost(request, response);

		this.request.setParameter(inputString, input2);
		this.stringReverse.doPost(request, response);

		String reversed = (String) this.request.getAttribute(reversedString);
		assertEquals(reverse2, reversed);
	}

}
