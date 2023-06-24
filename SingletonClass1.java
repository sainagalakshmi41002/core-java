package DesignPatterns;

public class SingletonClass1 {
    private static SingletonClass1 instance=new SingletonClass1();
    private SingletonClass1(){};

    public static SingletonClass1 getInstance() {
        return instance;
    }
}
class SingleTon{
    public static void main(String[] args) {

    }
}
