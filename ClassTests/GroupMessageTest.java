
package bvoc.test;

import org.junit.Test;
import static org.junit.Assert.*;


public class GroupMessageTest {
    
    public GroupMessageTest() 
    {
    }

    /**
     * Test of sendGroupMessage method, of class GroupMessage.
     */
    @Test
    public void testSendGroupMessage()
    {
        final int DEFAULT_CAP = 10;
        String senderName = "John";
        String senderID = "12345";
        String firstReceiverName = "Sara";
        String firstReceiverID = "12333";
        String secondReceiverName = "Smith";
        String secondReceiverID = "12222";
        
        
        String message1 = "Hello World!";
        
        
        Profile senderProfile = new Profile(senderName, senderID);
        Profile firstReceiverProfile = new Profile(firstReceiverName,firstReceiverID);
        Profile secondReceiverProfile = new Profile(secondReceiverName, secondReceiverID);
        
        Profile[] recipiants = new Profile[DEFAULT_CAP];
        recipiants[0] = firstReceiverProfile;
        recipiants[1] = secondReceiverProfile;
        
        GroupMessage instance = new GroupMessage(senderProfile, message1, recipiants);
        instance.sendGroupMessage();
        
    }
    
}

