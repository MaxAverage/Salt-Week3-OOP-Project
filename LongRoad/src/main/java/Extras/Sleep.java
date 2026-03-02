package Extras;

public class Sleep {
    public void sleep1Sec(){
        try {
            for (int i = 0; i < 1; i++) {

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
