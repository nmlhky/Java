package javaClassWithMrDuran.day21_30.day26;

public class StringOperations {
    String value;
    public StringOperations(){
        this.value="";
    }
    public StringOperations(String value){
        this.value=value;
    }
    public String returnReversed(){
        String result="";
        for(int i=this.value.length()-1; i>=0;i--){
            result+=this.value.charAt(i);
        }
        return result;
    }
    public String returnCapitalized(){
        String result= this.value.substring(0,1).toUpperCase();

        for(int i=1 ; i<this.value.length();i++){
            if(this.value.charAt(i-1)==' ') {
               result += this.value.substring(i,i+1).toUpperCase();
            }else{
                result+=this.value.charAt(i);
            }
        }
        return result;
    }


    public String[] stringToArrayEasyWay (){
        String[] arr = null;
        arr = this.value.split(" ");

        return arr;
    }

    public String[] stringToArrayHardWay (){
        int count = 1;

        for(int i=1 ; i<this.value.length();i++) {
            if (this.value.charAt(i - 1) == ' ') {
                count++;
            }
        }

        String[] arr = new String[count];
        arr[0] = "";
        int k = 0;

        for(int i = 0 ; i<this.value.length();i++){
            if(this.value.charAt(i)==' ') {
                k++;
                arr[k] = "";
            }else{
                arr[k] += this.value.charAt(i);
            }
        }

        return arr;
    }


   // public String[] sentenceArray(String str){
      //  String[] arr = null;

       // arr = str.split(" ");

        //return Arrays.toString(str);
    //}

}
