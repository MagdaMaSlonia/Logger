public class Level implements Comparable<Level>{

    private String name;
    private Integer lvl;

    Level(String name, Integer lvl) {
        this.name = name;
        this.lvl = lvl;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Level o) {
        if(o != null) {
            return this.lvl.compareTo(o.lvl);
        }
        else {
            throw new NullPointerException();
        }
    }
}
