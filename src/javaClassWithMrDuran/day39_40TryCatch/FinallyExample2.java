package javaClassWithMrDuran.day39_40TryCatch;

public class FinallyExample2 {
    public static void main(String[] args) {
        String arr[] = {"a1","b123",null,"c","fgsfg",null,"dfsdfds"};
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i].length());
            }
        }
        catch (NullPointerException e){
            System.out.println("oops");
        }
        finally {
            System.out.println(arr[6].length());
        }
        System.out.println("-------------------------");
        for(int i=0;i<arr.length;i++){
            try{
                System.out.println(arr[i].length());
            }
            catch (NullPointerException e){
                System.out.println("oops");
            }
            finally {
                System.out.println("I will runnn");
            }
        }

    }
}
