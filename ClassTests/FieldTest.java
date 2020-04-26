
package bvoc.test;

import org.junit.Test;
import static org.junit.Assert.*;


public class FieldTest {
    
    public FieldTest() {
    }

    /**
     * Test of toString method, of class Field.
     */
    @Test
    public void testToString() 
    {
        String fieldName = "Old Field";
        String text = "New Field";
        
        Field instance = new Field(fieldName, text);
        
        String expResult = "Old Field has been updated to New Field";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
