import java.util.Timer;
import java.util.TimerTask;

public class timer {

    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 10;
            @Override
            public void run() {
                if (count > 0) {
                    System.out.println(count);
                    count--;
                } else {

                    System.out.println("Time is up!");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
