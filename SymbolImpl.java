import java.util.ArrayList;

public class SymbolImpl implements Symbol {
    private int dir;
    private int type;
    private String cat;
    private ArrayList<Integer> args;

    public SymbolImpl(int dir, int type, String cat, ArrayList<Integer> args) {
        this.dir = dir;
        this.type = type;
        this.cat = cat;
        this.args = args != null ? new ArrayList<>(args) : new ArrayList<>();
    }

    @Override
    public int getDir() {
        return dir;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public String getCat() {
        return cat;
    }

    @Override
    public ArrayList<Integer> getArgs() {
        return new ArrayList<>(args);
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public void setArgs(ArrayList<Integer> args) {
        this.args = new ArrayList<>(args);
    }
}
