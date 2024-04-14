package TwoPointer;

public class Index {
    private final int i;
    private final int j;
    private final boolean found;

    public Index(int i, int j, boolean found) {
        this.i = i;
        this.j = j;
        this.found = found;
    }

    public int getI() {
        return this.i;
    }

    public int getJ() {
        return this.j;
    }

    public boolean checkFound() {
        return this.found;
    }

}
