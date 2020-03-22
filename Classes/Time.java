
public class Times 
{ 
    public static void main (String[] args) 
    {
        boolean timeT = true;
        long showMim = 0;
        long timebegin = currentTimeMillis();
        System.out.println("Time runing : ");
       
        while( timeT )
        {
            try {
                TimeUnit.SECONDS.sleep(1);
                long timeGone  = currentTimeMillis() - timebegin ;
                long secTime = timeGone/1000;
                
                if( secTime == 60)
                {
                    secTime = 0;
                    timebegin = currentTimeMillis();
                }
                if( secTime == 60 )
                    showMim++;
                System.out.println(showMim+":"+secTime);
            } catch (InterruptedException ex) {
                Logger.getLogger(Times.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
