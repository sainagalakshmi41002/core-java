public class Myclass {
    public static void main(String[] args) {
        int len=0;

        String s="length of the last word";
        String[] st=s.split(" ");
        System.out.println(st[st.length-1].length());
        for(int i=0;i< st.length;i++){
            if(i==st.length)
                System.out.println(st[i].length());

        }
//        for(int i=s.length()-1;i>=0;i--){
//            if(s.charAt(i)==' ')
//                break;
//            len++;
//        }
//        System.out.println(len);
    }
}
