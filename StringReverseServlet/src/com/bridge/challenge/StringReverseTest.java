/**
 *
 */
package com.bridge.challenge;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Professional
 *
 */
class StringReverseTest {

    private StringReverse stringReverse;

    /**
     * @throws java.lang.Exception
     */
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @BeforeEach
    void setUp() throws Exception {
        this.stringReverse = new StringReverse();
//        this.stringReverse.init(new ServletConfigMimic());
        
        HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);  
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterEach
    void tearDown() throws Exception {
    }

    /**
     * Test method for {@link com.bridge.challenge.StringReverse#destroy()}.
     */
    @Test
    void testDestroy() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link com.bridge.challenge.StringReverse#init(javax.servlet.ServletConfig)}.
     */
    @Test
    void testInitServletConfig() {
        assertTrue(this.stringReverse.reversedStrings.size() == 0);
    }

    /**
     * Test method for {@link com.bridge.challenge.StringReverse#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)}.
     */
    @Test
    void testDoGetHttpServletRequestHttpServletResponse() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link com.bridge.challenge.StringReverse#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)}.
     */
    @Test
    void testDoPostHttpServletRequestHttpServletResponse() {
        fail("Not yet implemented");
    }

}
