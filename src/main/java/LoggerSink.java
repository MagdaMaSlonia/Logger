import java.util.Date;

public class LoggerSink {

    public synchronized void createMsg(String level, String loggerName, String msg) {
        Date currentDate = new Date();
        System.out.println("START {" + currentDate.toString() + "} {" + loggerName + "} "  + "[{ "+ level + "}]:" + "{" + msg + "} ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("END {" + currentDate.toString() + "} {" + loggerName + "} "  + "[{ "+ level + "}]:" + "{" + msg + "}");
    }
}
