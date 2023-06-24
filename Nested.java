package InnerClass;

 class Outer{
    int x=10;
    class Inner{
        int y=20;
        void innerDisp(){
            System.out.println("inner class : "+x +" "+y);
        }
    }
    void outerDisp(){
       new Inner().innerDisp();
        System.out.println("outer class : "+x +" "+new Inner().y);
    }
}
public class Nested{
    public static void main(String[] args) {
       Outer outobj=new Outer();
       outobj.outerDisp();

      Outer.Inner obj=new Outer().new Inner();
       obj.innerDisp();
       //obj.outerDisp(); ---> error
    }
}
