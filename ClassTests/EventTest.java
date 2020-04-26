
package bvoc.test;

import org.junit.Test;
import static org.junit.Assert.*;


public class EventTest {
    
    public EventTest() {
    }

    /**
     * Test of addToEvent method, of class Event.
     */
    @Test
    public void testAddToEvent() 
    {
        int DEF_CAP = 10;
        String name = "John";
        String id = "12345";
        
        String firstReceiverName = "Sara";
        String firstReceiverID = "12333";
        String secondReceiverName = "Smith";
        String secondReceiverID = "12222";
        String time = "08:00 PM";
        Profile profile = new Profile(name, id);
        Profile firstReceiverProfile = new Profile(firstReceiverName,firstReceiverID);
        Profile secondReceiverProfile = new Profile(secondReceiverName, secondReceiverID);
        
        
        
        Profile[] profiles = new Profile[DEF_CAP];
        profiles[0] = firstReceiverProfile;
        profiles[1] = secondReceiverProfile;
        
        
        Event instance = new Event(name, id, time, profiles);
        Boolean expResult = true;
        
        Boolean result = instance.addToEvent(profile);
        
        assertEquals(expResult, result);
       
    }
    
}

