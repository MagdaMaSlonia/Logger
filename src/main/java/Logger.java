import java.util.ArrayList;
import java.util.List;

public class Logger {

    private final String loggerName;
    private Level globalLvl = new Level("NONE", -1);
    private final Level lvlInfo = new Level("INFO", 0);
    private final Level lvlWarning = new Level("WARNING", 1);
    private final Level lvlDebug = new Level("DEBUG", 2);
    static private LoggerSink sink = new LoggerSink();

    List<Level> logLevels = new ArrayList<Level>();

    Logger(String loggerName) {
        this.loggerName = loggerName;
        logLevels.add(new Level("NONE", -1));
        logLevels.add(new Level("INFO", 0));
        logLevels.add(new Level("WARNING", 1));
        logLevels.add(new Level("DEBUG", 2));
    }

    static Logger createLogger(String loggerName) {
        return new Logger(loggerName);
    }

    void debug(String msg) {
        if(isLvlAccurate(lvlDebug)) {
            sink.createMsg(lvlDebug.getName(), this.loggerName, msg);
        }
    }

    void info(String msg) {
        if(isLvlAccurate(lvlInfo)) {
            sink.createMsg(lvlInfo.getName(), this.loggerName, msg);
        }
    }

    void warning(String msg) {
        if(isLvlAccurate(lvlWarning)) {
            sink.createMsg(lvlWarning.getName(), this.loggerName, msg);
        }
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