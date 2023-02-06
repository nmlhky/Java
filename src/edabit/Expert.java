package edabit;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Expert {
    public static void main(String[] args) {


    }

    //Recursion: Reversed List Index https://edabit.com/challenge/TcLfFXvBvDqRL82a2
    public static Object[] getItemsAt(Object[] arr, String par) {
        int startPoint =  0;
        if(par == "odd" & arr.length%2==0 || par == "even" & arr.length%2==1)
            startPoint = 1;

        List<Object> list = new ArrayList<>();

        for (int i = startPoint, j=0; i < arr.length; i += 2, j++) {
           list.add(arr[i]);
        }

        return list.toArray(new Object[list.size()]);
    }

    //Sentence Searcher II https://edabit.com/challenge/rNYqwDqDFZwjZ6A4g
    public static String sentenceSearcher(String str, int n) {
        String[] words = str.split(" ");
        int start=0, end=words.length;

        if (n<0)
            n= words.length+n;

        for (int i = 0; i < words.length; i++) {
            if( words[i].matches(".*[.!?]") ) {
                if (i+1>n){
                    end  = i+1;
                    break;
                }
                start = i+1;
            }
        }

        String result = "";

        for (int i = start; i < end; i++) {
            result = result + words[i] + " ";
        }

        return  result.substring(0,result.length()  -1);
    }

    //Kaprekar's Constant https://edabit.com/challenge/eBkknBKXvMm8bDo8M.
    public static int kaprekar(int num) {
        int count = 0;
        while (num != 6174){
            num = kaprekar2(num);
            count++;
        }
        return count;
    }
    public static int kaprekar2(int num) {
        ArrayList<Integer> list  = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            list.add(num%10);
            num = num/10;
        }
        Collections.sort(list, Collections.reverseOrder());

        int n = list.get(0)*1000 + list.get(1)*100 + list.get(2)*10 + list.get(3);
        int m = list.get(3)*1000 + list.get(2)*100 + list.get(1)*10 + list.get(0);

        return n-m;
    }

    //Count How Many Times An Element Is Repeated https://edabit.com/challenge/Sj2kws46RQfxdv6Wj
    public static Map<Object, Integer> countRepititions(Object[] e) {
        return Stream.of(e)
                .collect(Collectors.toMap(obj -> obj, obj -> 1, Integer::sum, LinkedHashMap::new))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Object, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

    }


    //Palindrome Descendant https://edabit.com/challenge/8zSSCYQRKC9wWWbkN
    public static boolean palindromeDescendant(int num) {
        return true;
    }


    //Reverse Sort: Lexical and Length -- https://edabit.com/challenge/iZNdGSDXyRMmHrNNn
    public static String reverseSort(String str) {
        String[] arr = str.split(" ");

        String result = "";
        int max = 0;

        for (String s : arr) {
            if (s.length() > max) max = s.length();
        }

        for (int i = max; i >= 0 ; i--) {
            for (int j = arr.length-1; j >= 0 ; j--) {
                if (arr[j].length() == i ) result += arr[j] + " ";
            }
        }


        return result.substring(0,result.length()-1);
    }


    //Word Buckets - https://edabit.com/challenge/3FAMXz4wAYGqpCtDR
    public static String[] bucketize(String phrase, int n) {
        String[] arr = phrase.split(" ");
        ArrayList<String> list = new ArrayList<>();
        String temp = "";

        for (String s : arr) {
            if (s.length() > n)
                return new String[0];
        }

        for (int i = 0; i < arr.length; i++) {

            if (temp.equals("") ) {
                temp = arr[i];
                continue;
            }
            if ( temp.length() + arr[i].length() < n) {
                temp += " " + arr[i];
            }else{

                list.add(temp);
                i--;
                temp = "";
            }

        }

        list.add(temp);

        return list.toArray(new String[list.size()]);
    }


    //license plate - https://edabit.com/challenge/HssePSisNvLpv72zD
    public static String licensePlate(String code, int group) {
        code = code.toUpperCase().replaceAll("\\W","");
        String result="";
        int k = code.length() % group;
        int n = 1;

        for (int i = 0; i < code.length(); i++) {

            if ((i==k || i == group * n + k) && i>0 ) {
                n++;
                result += "-";
            }

            result += code.charAt(i);
        }

        return result;
    }

    //Ulam Sequence
    public static int ulam(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        TreeSet<Integer> check = new TreeSet<>();
        HashSet<Integer> dublicate = new HashSet<>();
        list.add(1);
        list.add(2);
        list.add(3);
        while (list.size()<=n) {
            check.clear();
            for (int i = 0; i < list.size(); i++) {
                for (int j = i+1; j < list.size(); j++) {
                    int k = list.get(i) + list.get(j);
                    if (k>7000) continue;
                    if(!check.add(k)){
                        dublicate.add(k);
                    }
                }
            }

            for (int i : check) {
                if (i <= list.get(list.size()-1) || dublicate.contains(i)) continue;
                list.add(i);
                break;
            }
        }
        return list.get(n-1);
    }

    //English to Pig Latin Translator
    public static String translateWord(String word) {
        if (word.equals("")) return word;
        if (isVowel(word.charAt(0))) return word + "yay";
        if(Character.isUpperCase(word.charAt(0))) {
            for (int i = 0; i < word.length(); i++) {
                if (isVowel(word.charAt(i))) return word.substring(i,i+1).toUpperCase() + word.substring(i+1) + word.substring(0, i).toLowerCase() + "ay";
            }
        }
        else {
            for (int i = 0; i < word.length(); i++) {
                if (isVowel(word.charAt(i))) return word.substring(i) + word.substring(0, i) + "ay";
            }
        }
        return word;
    }
    public static String translateSentence(String sentence) {
        if (sentence.equals("")) return "";
        ArrayList<String> list = new ArrayList<>();
        String temp = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isAlphabetic(sentence.charAt(i))) temp += sentence.charAt(i);
            else {
                if (!temp.equals("")) list.add(temp);
                list.add(sentence.charAt(i)+"");
                temp = "";
            }
        }
        if (!temp.equals("")) list.add(temp);

        String result = "";
        for (int i = 0; i < list.size(); i++) {
            if (Pattern.matches("\\p{Punct}",list.get(i))){
                result += list.get(i);
            }
            else {
                result += translateWord(list.get(i));
            }
        }
        return result;
    }
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) return true;
        return false;
    }

    //Strip URL Query Parameters
    public static String stripUrlParams(String url, String[] paramsToStrip) {
        String[] urlParts = url.split("\\?");
        if (urlParts.length == 1 ) return url;
        ArrayList<String> list =new ArrayList<>();
        if(paramsToStrip != null) {
            Collections.addAll(list,paramsToStrip);
        }

        Map hm = new HashMap<String,Integer>();

        String[] querys = urlParts[1].split("&");

        for (int i = 0; i < querys.length; i++) {
            String[] temp = querys[i].split("=");
            if (list != null) {if (list.contains(temp[0])) continue;}
            hm.put(temp[0],temp[1]);
        }


        String query = "?";

        for (Object o : hm.entrySet()) {
            query += o.toString() + "&";
        }

        return urlParts[0] + query.substring(0,query.length()-1);
    }

    //Quad Sequence
    public static int[] quadSequence(int... args) {
        int[] diff = new int[args.length*2 -1];
        for (int i = 0; i < args.length-1; i++) {
            diff[i] = args[i+1]-args[i] ;
        }
        int diffOfDiff = diff[1] - diff[0];

        for (int i = args.length-1; i < diff.length ; i++) {
            diff[i] = diff[i-1] + diffOfDiff;
        }

        int[] result = new int[args.length];
        result[0] = args[args.length-1] + diff[args.length-1];

        for (int i = 1; i < args.length; i++) {
            result[i] = result[i-1] + diff[args.length-1+i];
        }

        return result;
    }

    public static String isbn13(String str) {
        if(str.length() == 13){
            int sum=Integer.parseInt(str.charAt(0)+"");
            for (int i = 1; i < 13; i += 2) {
                sum += Character.getNumericValue(str.charAt(i)) * 3;
                sum += Character.getNumericValue(str.charAt(i+1)) ;
            }
            if (sum%10==0) return "Valid";
            else return "Invalid";
        }
        if (str.length()==10){
            int sum =0;
            int index =10;

            for (int i = 0; i < 10; i++) {
                if (str.charAt(i) ==  'X') sum += 10 * index;
                else sum += Character.getNumericValue(str.charAt(i)) * index ;
                index--;
            }
            if (sum%11 != 0) return "Invalid";
            else {
                str = 978+str.replaceAll("\\D","0");
                System.out.println(str);
                int sum2=Integer.parseInt(str.charAt(0)+"");
                for (int i = 1; i < 13; i += 2) {
                    sum2 += Character.getNumericValue(str.charAt(i)) * 3;
                    sum2 += Character.getNumericValue(str.charAt(i+1)) ;
                }
                if (sum2%10==0) return str;
                int add =  10-sum2%10;
                if (add + Character.getNumericValue(str.charAt(12)) > 10) {
                    return String.valueOf( Long.parseLong(str)-sum2%10 );
                }
                return String.valueOf(Long.parseLong(str) + add);
            }
        }
        return "Invalid";
    }

    //Reverse LEGO Yoda
    public static String reverseLegoYoda(String text) {
        String[] sentences = text.split("\\.\\s?");
        String result = "";

        for (String sentence : sentences) {
            String[] arr = sentence.split(", ");

            result += arr[1].toUpperCase().charAt(0);
            result += arr[1].substring(1);
            result += " ";

            result += arr[0].toLowerCase().charAt(0);
            result += arr[0].substring(1);
            result += ". ";
        }

        result = new StringBuilder(result).deleteCharAt(result.length()-1).toString();

        return result;
    }

    //Headline Hash Tags
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
        HashMap<Integer, Integer> hmSorted = SortByValues(hm);

        System.out.println(hmSorted);

        System.out.println(hmSorted.keySet().toArray()[0]);

        if (list.size()==1)  return new String[]{"#"+str.toLowerCase()};
        if (list.size()==2)  return new String[]{"#"+str.toLowerCase().split(" ")[0], "#"+str.toLowerCase().split(" ")[1]};
        return new String[]{"#"+list.get(Integer.parseInt(hmSorted.keySet().toArray()[0].toString())), "#"+list.get(Integer.parseInt(hmSorted.keySet().toArray()[1].toString())), "#"+list.get(Integer.parseInt(hmSorted.keySet().toArray()[2].toString()))};
    }
    private static HashMap SortByValues(HashMap map) {
        List list = new LinkedList(map.entrySet());
        // Defined Custom Comparator here
        list.sort(new Comparator() {
            public int compare(Object o2, Object o1) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        // Here I am copying the sorted list in HashMap
        // using LinkedHashMap to preserve the insertion order
        LinkedHashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }

        return sortedHashMap;
    }

    //Centered Hexagonal Number
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

    //ABACABA Pattern
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

    //Pilish Strings
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
