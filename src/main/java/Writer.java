public class Writer extends Thread {

    private Logger Log;

    Writer(String loggerName) {
         this.Log = Logger.createLogger(loggerName);
    }

    public void run() {
        while(true) {
            Log.debug("ERRROR");
        }

    }

}
