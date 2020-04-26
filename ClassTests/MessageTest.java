
package bvoc.test;

import org.junit.Test;
import static org.junit.Assert.*;


public class MessageTest 
{
    
    public MessageTest() 
    {
    }

    /**
     * Test of toString method, of class Message.
     */
    @Test
    public void testToString() 
    {
        String name = "John";
        String id = "12345";
        String message = "Hello World!";
        Profile profile = new Profile(name, id);
        
        
        Message instance = new Message(profile, message);
        String expResult = "John says: Hello World!";
        
        String result = instance.toString();
        assertEquals(expResult, result);
        System.out.println(result);
        
    }
    
}
