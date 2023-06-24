package InnerClass;
class Outer_1{
    void outDisplay(){
        class Inner_1{
            void inDisp(){
                System.out.println("this is inner class method which is inside method of outer class . ");
            }
        }
       Inner_1 iobj=new Inner_1();
       iobj.inDisp();
       System.out.println("this is outer class method which is outside the inner class .");
    }
}
public class LocalInner {
    public static void main(String[] args) {
      Outer_1 Outobj=new Outer_1();
      Outobj.outDisplay();


    }
}
