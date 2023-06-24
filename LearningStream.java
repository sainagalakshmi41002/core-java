import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LearningStream {
    public static void main(String[] args) {
        // 1.  for getting the strings starts with "a" .
        String s = "This a is nagalakshmi pranathi aa bb ac bc addd ayy";
        String[] srt = s.split(" ");
        List<String> l1 = new ArrayList<>(List.of(srt));
        l1.stream().filter(word -> word.startsWith("a")).forEach(System.out::println);

        // 2. write a program to find the sum of all even numbers in the list
        //note : sum() is applicable only on primitive streams(intstream , double stream)
        // not available on object streams like Stream<Integer> .so to convert Integer to int stream ,
        //mapToInt(Integer::intValue)
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        int sumOfEven = list1.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sumOfEven);

        //3.  find the shortest string in the list
        List<Integer> list2 = new ArrayList<>(List.of(13, 1, 6, 12, 41, 23, 7, 91, 8));
        int minElement = list2.stream().mapToInt(Integer::intValue).min().orElseThrow(() -> new IllegalArgumentException("list is empty"));
        System.out.println(minElement);

        //4. program to find the employee with the highest salary

        EmployeeDetail pannu = new EmployeeDetail("pannu", 20, 30000, "blr");
        EmployeeDetail likki = new EmployeeDetail("likki", 21, 25000, "ong");
        EmployeeDetail sowji = new EmployeeDetail("sowji", 22, 35000, "aroad");
        EmployeeDetail venni = new EmployeeDetail("venni", 23, 15000, "nlr");
        List<EmployeeDetail> list3 = new ArrayList<EmployeeDetail>();
        list3.add(pannu);
        list3.add(likki);
        list3.add(sowji);
        list3.add(venni);
         EmployeeDetail highPayEmp=list3.stream().max(Comparator.comparingDouble(EmployeeDetail::getSalary)).orElseThrow(()->new IllegalArgumentException("list is empty"));
        System.out.println(highPayEmp);

  // 5. remove all duplicates from the list
        List<Integer> list4 = new ArrayList<>(List.of(1, 2, 1,3, 4,4, 5, 6,1,8,7));
        list4.stream().distinct().toList().forEach(System.out::print);
        System.out.println();

  // 6.program to concatenate all the strings into a single string
        List<String> stringList=new ArrayList<>(List.of("hi","hello","namaste","bye"));
        String string =stringList.stream().collect(Collectors.joining());
        System.out.println(string);

  // 7. program to find the product of all the numbers in the list
        list1.stream().map(n->n*n).forEach(System.out::print);
        System.out.println();

  // 8. write a program to find the list of employees who work in a particular city.
        List<EmployeeDetail> list=new ArrayList<EmployeeDetail>();
        list.add(pannu);
        list.add(likki);
        list.add(sowji);
        list.add(venni);
        List<EmployeeDetail> employeeDetail=list.stream().filter(emp-> (emp.getCity().equalsIgnoreCase("nlr"))||(emp.getCity().equalsIgnoreCase("ong"))).collect(Collectors.toList());
        for (EmployeeDetail e:employeeDetail) {
            System.out.println(e.getName());
        }

  // 9.  program to find the list of strings that have length greater than 5
        List<String> str=new ArrayList<>(List.of("rayani","gonepudi","yadavalli","guntupalli","budhavati"));
        List<String>names=str.stream().filter(a->a.length()>=10).toList();
        System.out.println(names);

  // 10.


    }
    }
class EmployeeDetail{
    String name;
    int age;
    double salary;
    String city;
    EmployeeDetail(String name,int age,double salary,String city){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.city=city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "EmployeeDetail{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }
}