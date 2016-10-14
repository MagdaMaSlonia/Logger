import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Logger {

    private final String loggerName;
    private Level globalLvl;
    private final Level lvlInfo = new Level("INFO", 0);
    private final Level lvlWarning = new Level("WARNING", 1);
    private final Level lvlDebug = new Level("DEBUG", 2);

    List<Level> logLevels = new ArrayList<Level>();

    Logger(String loggerName) {
        this.loggerName = loggerName;
        logLevels.add(new Level("NONE", -1));
        logLevels.add(new Level("INFO", 0));
        logLevels.add(new Level("WARNING", 1));
        logLevels.add(new Level("DEBUG", 2));
    }

    void debug(String msg) {
        if(isLvlAccurate(lvlDebug)) {
            createMsg(lvlDebug.getName(), this.loggerName, msg);
        }
    }

    void info(String msg) {
        if(isLvlAccurate(lvlInfo)) {
            createMsg(lvlInfo.getName(), this.loggerName, msg);
        }
    }

    void warning(String msg) {
        if(isLvlAccurate(lvlWarning)) {
            createMsg(lvlWarning.getName(), this.loggerName, msg);
        }

    }

    private void createMsg(String level, String loggerName, String msg) {
        Date currentDate = new Date();
        System.out.println("{" + currentDate.toString() + "} {" + loggerName + "} "  + "[{ "+ level + "}]:" + "{" + msg + "}");
    }

    public void useLevel(Level setLvl) {
        setGlobalLvl(setLvl);
    }

    public void setGlobalLvl(Level globalLvl) {
        this.globalLvl = globalLvl;
    }

    private boolean isLvlAccurate(Level askedLvl) {
        return globalLvl.compareTo(askedLvl) < 0;
    }

}




