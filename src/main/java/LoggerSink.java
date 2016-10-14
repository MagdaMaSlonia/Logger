import java.util.Date;

public class LoggerSink {

    public void createMsg(String level, String loggerName, String msg) {
        Date currentDate = new Date();
        System.out.println("{" + currentDate.toString() + "} {" + loggerName + "} "  + "[{ "+ level + "}]:" + "{" + msg + "}");
    }
}
