package automatedTests.utils;

public class WaitTime {
    public static void Time (){
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
