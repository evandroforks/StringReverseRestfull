/**
 *
 */
package com.bridge.challenge;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.*;

import javax.servlet.ServletConfig;
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

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
        this.stringReverse = new StringReverse();
        this.stringReverse.init(mock(ServletConfig.class));

        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void testDestroy() {
        fail("Not yet implemented");
    }

    @Test
    void testInitServletConfig() {
        assertTrue(this.stringReverse.reversedStrings.size() == 0);
    }

    @Test
    void testDoGetHttpServletRequestHttpServletResponse() {
        fail("Not yet implemented");
    }

    @Test
    void testDoPostHttpServletRequestHttpServletResponse() {
        fail("Not yet implemented");
    }

}
