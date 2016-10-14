public class FakeProgram {

    public static void main(String[] args){

        Logger Log = Logger.createLogger("moj sliczny logger");

        Log.useLevel(new Level("NONE", -1));

        Log.debug("ERRROR");
        Log.warning("WARNING");
        Log.info("INFOOO");
    }
}
