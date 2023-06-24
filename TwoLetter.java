package PQuestions;

public class TwoLetter {
    public static void main(String[] args) {
        char ch;
        int a;
    /*    for(ch='A';ch<='Z';ch+=2){
            System.out.print(ch);
            a=ch+1;
            System.out.print(" "+(char)a);
            System.out.println();
        } */
        for (int i=65;i<=90;i+=2){
            System.out.print((char)i);
            System.out.print((char)(i+1));
            System.out.println();
        }

    }
}
