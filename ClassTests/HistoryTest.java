
package bvoc.test;

import org.junit.Test;
import static org.junit.Assert.*;


public class HistoryTest {
    
    public HistoryTest() 
    {
    }

    /**
     * Test of addMessage method, of class History.
     */
    @Test
    public void testAddMessage() 
    {
        String name = "John";
        String id = "12345";
        String message = "Hello World";
        Profile profile = new Profile(name, id);
        Message newMessage = new Message(profile, message);
        
        History instance = new History();
        instance.addMessage(newMessage);
      
    }

    /**
     * Test of resize method, of class History.
     */
    @Test
    public void testResize() {
        
        History instance = new History();
        instance.resize();  
    }
    
}

