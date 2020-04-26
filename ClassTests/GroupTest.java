
package bvoc.test;

import org.junit.Test;
import static org.junit.Assert.*;


public class GroupTest 
{
    final int DEF_CAP = 10;
    String name = "John";
    String id = "12345";
    String groupName = "CS386";
    Profile profile = new Profile(name, id);
    Profile[] profileArray = new Profile[DEF_CAP];
    
    public GroupTest() 
    {
    }

    /**
     * Test of addProfileToArray method, of class Group.
     */
    @Test
    public void testAddProfileToArray() {
        System.out.println("addProfileToArray");
        
        Group instance = new Group(groupName,profile);
        Boolean expResult = true;
        Boolean result = instance.addProfileToArray(profile, profileArray);
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addToGroup method, of class Group.
     */
    @Test
    public void testAddToGroup() {
        System.out.println("addToGroup");
        
        Group instance = new Group(groupName, profile);
        
        Boolean expResult = true;
        Boolean result = instance.addToGroup(profile);
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSize method, of class Group.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        
        Group instance = new Group(groupName, profile);
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
        
    }
    
}
