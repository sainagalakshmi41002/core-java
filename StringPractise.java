public class StringPractise {
    public static void main(String[] args) {
         int a;
        String s = "aabbyeeya";
        String ns="";
        char c = 'a';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){continue;}
            else{ns+=s.charAt(i);}
        }
        System.out.println(ns);


    }
}