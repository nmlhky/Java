package javaClassWithMrDuran.day11_20.day13;

public class paswordCheck {
    public static void main(String[] args) {
        System.out.println(check("asad"));
    }

    public static String check(String a){
        return  (a.length()<6) ? "not ok" : "ok";
    }
}
