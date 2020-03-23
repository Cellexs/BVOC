
package bevocapp;
import java.util.TimerTask;
import java.util.Date;
import java.util.Timer;



public class TrickTimerTask extends TimerTask
{ 
    
    public void TimeRunning()
    {
        try {
            Thread.sleep(1);
        } catch (InterruptedException f) {
            f.printStackTrace();
        }
    }
        public static void main (String args[])
        {
        TimerTask trickerTimer = new TrickTimerTask();
        Timer timer = new Timer( true );
	timer.scheduleAtFixedRate( trickerTimer, 1,1*1000);
	System.out.println( " Started Time " );
        try {
               Thread.sleep(100000000);
        } catch (InterruptedException f){
            f.printStackTrace();
        }
        
    }
    @Override
    public void run() {
        System.out.println( new Date());
        TimeRunning();
        System.out.println( new Date());
    }
}
