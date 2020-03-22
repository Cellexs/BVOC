
Anas

public class Times 
{ 
    public static void main (String[] args) throws InterruptedException 
    {
        boolean timeT = true;
        long showMim = 0;
        long timebegin = currentTimeMillis();
        System.out.println("Time runing : ");
       
        while( timeT )
        {
            TimeUnit.SECONDS.sleep(1);
            long timeGone  = currentTimeMillis() - timebegin ;
            long secTime = timeGone/1000;
            
            if( secTime == 60) 
            {
                secTime = 0;
                timebegin = currentTimeMillis();
            }
            if( secTime == 60 )
            showMim ++;
            System.out.println(showMim+":"+secTime);
        }
    }
}
