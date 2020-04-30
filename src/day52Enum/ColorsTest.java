package day52Enum;

public class ColorsTest {
    public static void main(String[] args) {
        Colors mycolor = Colors.BLUE;

        for (Colors color : Colors.values()) {
            System.out.println(color);
        }
    }
}
