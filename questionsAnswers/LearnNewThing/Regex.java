package LearnNewThing;

public class Regex {
    public static void main(String[] args) {
        String str = "Hey Parents, Surprise, Fruit Juice Is Not Fruit";

        // nokta virgulu .. silme
        str.replaceAll("\\p{Punct}", ""); //Hey Parents Surprise Fruit Juice Is Not Fruit


    }
}
