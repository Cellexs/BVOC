
package groupchat;
/**
 *
 * @author albedaiwi
 */

public class GroupChat
{
    private String acount;
    public boolean chat;
    private int port;
    private int size = 10;
    public static int Id; 
    /**
     * 
     * @param acount 
     */
     GroupChat(String acount)
    {
        this.acount = acount; 
    }
     /**
      * 
      * @return 
      */
     String getAcount()
     {
         return acount;
     }
     /**
      * 
      * @param userAcount 
      */
    public static void addUsers(String userAcount)
    {
        acount.//something(userAcount);
        updateuserAcount();
    }
    /**
     * 
     * @param userAcount 
     */
    public static void removeUser(String userAcount)
    {
        int index;
        for(index = 0; index < userAcount.size(); index++)
        {
            if(userAcount.get(index).equalsIgnoreCase(userAcount))
                userAcount.removeuser(index);
        }
    
        updateuserAcount();
    }
    /**
     * 
     * @return 
     */
    public static int getNumberOfUsers()
    {
        return acount.size();
    }
    /**
     * 
     */
    public static void updateuserAcount()
    {
       
    }
 
    /**
     * 
     * @param port 
     */
    public GroupChat(int port)
    {
        this.port = port;
    }
    /**
     * 
     */
    public void startChat()
    {
        boolean chat = true;
    {
        GroupChat serverPort = new GroupChat(port);
    }
        while (chat)
        {
           
           String text = null;
           String display = text;
           text = (" server is waiting for the port "+port);
            
        //   GroupChat portSer = GroupChat.something();
           if(!chat)
               break;
        }
    }
    /**
     * 
     */
    public void stopChat()
    {
        chat = false;
    }
    /**
     * 
     * @param text 
     */
    public void display(String text)
    {
        System.out.println(text);
        
    }
    public static void main(String[] args)
{
    int serverNum = 2222;   
    GroupChat port = new GroupChat(serverNum);
    port.startChat();
        
}
    public class textMessage extends Message()
    {
       return Message();
    }
    
}
