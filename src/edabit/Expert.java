package edabit;

import java.util.*;

public class Expert {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getHashTags("How, the, sdff sdf")));
    }

    public static String[] getHashTags2(String str) {
        return Arrays.stream(str.toLowerCase().replaceAll("\\p{Punct}", "").split(" "))
                .sorted((s1, s2) -> s2.length() - s1.length())
                .limit(3)
                .map(s -> "#" + s)
                .toArray(String[]::new);
    }

    public static String[] getHashTags3(String str) {
        return java.util.Arrays.stream(str.split(" |,"))
                .sorted(java.util.Comparator.comparing(String::length).reversed())
                .limit(3)
                .map(s->"#"+s.toLowerCase())
                .toArray(String[]::new);
    }

    public static String[] getHashTags(String str) {
        str = str.toLowerCase().replaceAll("\\W"," ").replaceAll("  "," ");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            hm.put(i,list.get(i).length());
        }

        System.out.println(hm);
        Map<Integer, Integer> hmSorted = sortByValues(hm);

        System.out.println(hmSorted);

        System.out.println(hmSorted.keySet().toArray()[0]);

        if (list.size()==1)  return new String[]{"#"+str.toLowerCase()};
        if (list.size()==2)  return new String[]{"#"+str.toLowerCase().split(" ")[0], "#"+str.toLowerCase().split(" ")[1]};
        return new String[]{"#"+list.get(Integer.parseInt(hmSorted.keySet().toArray()[0].toString())), "#"+list.get(Integer.parseInt(hmSorted.keySet().toArray()[1].toString())), "#"+list.get(Integer.parseInt(hmSorted.keySet().toArray()[2].toString()))};
    }

    private static HashMap sortByValues(HashMap map) {
        List list = new LinkedList(map.entrySet());
        // Defined Custom Comparator here
        Collections.sort(list, new Comparator() {
            public int compare(Object o2, Object o1) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        // Here I am copying the sorted list in HashMap
        // using LinkedHashMap to preserve the insertion order
        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }

    public static String hexLattice(int n) {
        if (n==1) return " o ";
        ArrayList<Integer> check = new ArrayList<>();

        int temp = 1;
        int i = 0;
        while (temp < n) {
            temp += i * 6;
            check.add(temp);
            i++;
        }
        if (!check.contains(n)) return "Invalid";

        String hex = "";
        StringBuilder half = new StringBuilder();
        int size = 1 + check.indexOf(n);
        int line = 1;

        for (int j = 0; j < size; j++) {

            //first space
            for (int k = line; k <= size; k++) {
                hex += " ";
            }
            // o
            for (int k = 1; k < size+line; k++) {
                hex += "o ";
            }

            //last space
            for (int k = line; k < size; k++) {
                hex += " ";
            }
            if (j==size-2) half.append(hex);
            hex += "\n";
            line++;
        }
        half.reverse();
        hex += half;

        return hex;
    }

    public static String abacabaPattern(int n) {
        char[] c = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        String s = "";
        String temp ;

        for (int i = 0; i < n; i++) {
            temp = s;
            s += c[i];
            s += temp;
        }

        return s;
    }

    public static String pilish_string(String s) {
        if (s=="") return "";
        long piLong = 314159265358979L;
        ArrayList<Integer> pi = new ArrayList<>();

        while (piLong > 0){
            pi.add( (int) (piLong%10 )  );
            piLong /= 10;
        }
        Collections.reverse(pi);

        ArrayList<String> piStringList = new ArrayList<>();
        String temp = "";
        int index = 0;
        int count = 0;
        for (int i = 0; i < pi.size(); i++) {

            for (int j = 0; j < pi.get(i) ; j++) {

                temp += s.charAt(index);

                if (index < s.length()-1)  index++;
                count++;
            }

            piStringList.add(temp);
            temp = "";
            if (count >= s.length()) break;

        }

        String result = piStringList.get(0);

        for (int i = 1; i < piStringList.size(); i++) {
            result += " ";
            result += piStringList.get(i);
        }

        return result;
    }
}
