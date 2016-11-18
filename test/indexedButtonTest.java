/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonaspm
 */
public class indexedButtonTest {
    
    public indexedButtonTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testGetIndex() {
        assertEquals(0, new indexedButton("", 0).getIndex());
        assertEquals(1, new indexedButton("", 1).getIndex());
        assertEquals(2, new indexedButton("", 2).getIndex());
    }
    
}
