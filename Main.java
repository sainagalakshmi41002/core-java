package PQuestions;
class MyClass{
    private int x=1;
    public MyClass(int x){
        this.x=x;
    }
    public void set(int x1){
        x=x1;
    }
    public int get(){
        return x;
    }
}
class Main {
    public static void main(String[] args) {
//  String name="pRanathi";
//        System.out.println(name.matches("[a-zA-Z\\s]+"));
        MyClass m=new MyClass(10);
        System.out.println(m.get());
        m.set(12);
        System.out.println(m.get());
    }
}

