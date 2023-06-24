package DesignPatterns;

interface FactoryName{
    public void print();
}
class Pavan implements FactoryName{
    int rollnum=1;
    String name="pavan";

    @Override
    public void print() {
        System.out.println("name="+name+" "+"rollnum="+rollnum);
    }
}
class Pranathi implements FactoryName{
    int rollnum=2;
    String name="pranathi";
    public void print() {
        System.out.println("name="+name+" "+"rollnum="+rollnum);
    }
}
class likitha implements FactoryName{
    int rollnum=3;
    String name="likitha";
    public void print() {
        System.out.println("name="+name+" "+"rollnum="+rollnum);
    }
}
class Sowjanya implements FactoryName{
    int rollnum=4;
    String name="sowjanya";
    public void print() {
        System.out.println("name="+name+" "+"rollnum="+rollnum);
    }
}
class Factory{
    public static FactoryName objcreate(String Student){
        if(Student.equalsIgnoreCase("student1"))
            return new Pavan();
        else if (Student.equalsIgnoreCase("student2"))
            return new Pranathi();
        else if (Student.equalsIgnoreCase("student3"))
            return new likitha();
        else if(Student.equalsIgnoreCase("student4"))
            return new Sowjanya();
        return null;
    }
}
public class ClassFactory {
    public static void main(String[] args) {
       FactoryName obj=Factory.objcreate("student1");
       obj.print();
       FactoryName obj1=Factory.objcreate("student3");
       obj1.print();
       FactoryName obj2=Factory.objcreate("student3");
       obj2.print();
    }
}
