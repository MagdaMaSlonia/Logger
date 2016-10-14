public class FakeProgram {

    public static void main(String[] args){

        //Logger Log = Logger.createLogger("moj sliczny logger");

        //Log.useLevel(new Level("NONE", -1));

        //Log.debug("ERRROR");
        //Log.warning("WARNING");
        //
        // Log.info("INFOOO");

        Writer writer1 = new Writer("1");
        writer1.start();

        Writer writer2 = new Writer("2");
        writer2.start();

        Writer writer3 = new Writer("3");
        writer3.start();

        Writer writer4 = new Writer("4");
        writer4.start();
    }
}
