
package bvoc.test;

import org.junit.Test;
import static org.junit.Assert.*;


public class ProfileTest {
    
    public ProfileTest() {
    }

    /**
     * Test of toString method, of class Profile.
     */
    @Test
    public void testToString() 
    {
        String name = "John";
        String id = "12345";
        Profile profile = new Profile(name, id);;
        
        String expResult = "John/ 12345/ Followed: 0/ Groups: 0";
        String result = profile.toString(profile);
        assertEquals(expResult, result);
        
    }
    
}
