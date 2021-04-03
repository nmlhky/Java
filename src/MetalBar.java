import java.util.*;

public class MetalBar implements Comparable<MetalBar> {

    private int value;
    private int count;

    public MetalBar(int value, int count) {
        this.value = value;
        this.count = count;
    }

    public int getValue() {
        return value;
    }

    public int getCount() {
        return count;
    }


    // Compare based on value
    public int compareTo(MetalBar otherBar) {
        return Integer.compare(otherBar.value, value);
    }

    public String toString() {
        return String.format("MetalBar(%d, %d)", value, count);
    }

}
