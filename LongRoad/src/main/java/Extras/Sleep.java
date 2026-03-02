package Extras;

public class Sleep {
    public void sleepForSeconds(int seconds) {
        try {
            for (int i = 0; i < seconds; i++) {

                // method will sleep the thread
                Thread.sleep(1000);
            }
        }
        catch (Exception e) {
            // catching the exception
            System.out.println(e);
        }
    }
}
