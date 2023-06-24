import java.util.*;
class Employee1 {
    int id;
    String name;
    String dob;
    long phonenum;
    String designation;
    String email;
    int Age;
    long salary;
    String skills;
    String address;

    public Employee1(int id, String name, String dob, long phonenum, String designation, String email, int age, long salary, String skills, String address) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.phonenum = phonenum;
        this.designation = designation;
        this.email = email;
        Age = age;
        this.salary = salary;
        this.skills = skills;
        this.address = address;
    }

        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public long getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(long phonenum) {
        this.phonenum = phonenum;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    Employee1(int id, String name, String dob, long phonenum, String designation, String email, int Age, long salary) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.phonenum = phonenum;
        this.designation = designation;
        this.email = email;
        this.Age = Age;
        this.salary = salary;
    }
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", phonenum=" + phonenum +
                ", designation='" + designation + '\'' +
                ", email='" + email + '\'' +
                ", Age=" + Age +
                ", salary=" + salary +
                '}';
    }

//    public void setSkills(String skills) {
//        this.skills = skills;
//    }
//
//    public String getSkills() {
//        return skills;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//public String toString() {
//    return "Employee1{" +
//            "id=" + id +
//            ", name='" + name + '\'' +
//            ", dob='" + dob + '\'' +
//            ", phonenum=" + phonenum +
//            ", designation='" + designation + '\'' +
//            ", email='" + email + '\'' +
//            ", Age=" + Age +
//            ", salary=" + salary +
//            ", skills='" + skills + '\'' +
//            ", address='" + address + '\'' +
//            '}';
//}




}


    public class CollectionsEMployee {
        public static void main(String[] args) {
            Employee1 Ram = new Employee1(1, "Ram", "12/13/23", 98345213L, "banglore", "ram@gmail.com", 20, 25000, "c", "ramaddress");
            Employee1 Rahul = new Employee1(2, "Rahul", "1/3/3", 982454513L, "chennai", "rahul@gmail.com", 20, 20000, "java", "rahuladdress");
            Employee1 Jemimah = new Employee1(3, "jemimah", "12/2/23", 984736591, "Andhra", "jemimah@gmail.com", 20, 30000, "python", "Jemimahadress");
            Employee1 Roshan = new Employee1(4, "Roshan", "1/2/3", 108, "karnataka", "roshan@mail", 98, 40000, "sleeping", "kolar");
            List<Employee1> list = new ArrayList<Employee1>();
            List<Employee1> list1 = new ArrayList<Employee1>();
            list.add(Ram);
            list.add(Rahul);
            list.add(Jemimah);
            //printing list elements
            for (Employee1 emp : list) {
                System.out.println(emp.toString());
            }
            //1. sorting based on salary
            compare(list);

            //2. removing by mail
            list1 = removeByEmail(list);
            System.out.println(list);

            //3.creating an exception if salary is not found
            salaryFind(list);
            addAttributesToAll(list);
            // addAttributesToSpecificemp(list);
        }

        static void compare(List<Employee1> list) {
            Comparator<Employee1> cmp = new Comparator<Employee1>() {
                @Override
                public int compare(Employee1 o1, Employee1 o2) {
                    if (o1.salary < o2.salary)
                        return 1;
                    else
                        return -1;
                }
            };
            Collections.sort(list, cmp);
            System.out.println("after sorting based on salary");
            System.out.println(list);
        }
        static List<Employee1> removeByEmail(List<Employee1> list) {
            Scanner s = new Scanner(System.in);
            String mail = s.next();
            Iterator<Employee1> iterator = list.iterator();
            while (iterator.hasNext()) {
                Employee1 e = iterator.next();
                if (e.email.equals(mail)) {
                    iterator.remove();
                }
            }
            return list;
        }


        static void addAttributesToAll(List<Employee1> list) {
            Scanner s = new Scanner(System.in);
            for (Employee1 emp : list) {
                System.out.println("enter address of emp " + emp.id);
                String Adress = s.next();
                if (Adress == null)
                    emp.address = Adress;
                else
                    emp.address = Adress;
            }
            System.out.println(list);
        }
        static void salaryFind(List<Employee1> list){
            Scanner sobj = new Scanner(System.in);
            System.out.println("enter emp details:");
            System.out.println("enter id:");
            int id = sobj.nextInt();
            System.out.println("enter name:");
            String name = sobj.next();
            System.out.println("enter dob");
            String dob = sobj.next();
            System.out.println("phone num:");
            long phonenum = sobj.nextInt();
            System.out.println("designation");
            String designation = sobj.next();
            System.out.println("email");
            String email = sobj.next();
            System.out.println("age:");
            int Age = sobj.nextInt();
            System.out.println("salary");
            long salary = sobj.nextInt();
            Employee1 lakshmi = new Employee1(id, name, dob, phonenum, designation, email, Age, salary);
            list.add(lakshmi);
            for (Employee1 emp : list) {
                try {
                    if (emp.salary == 0) {
                        throw new SalarayNotFoundException();
                    }

                } catch (SalarayNotFoundException e) {
                    System.out.println(e);
                }
            }
        }
    }


    class SalarayNotFoundException extends Exception {
        @Override
        public String toString() {
            return "Salary you have entered is not valid.please enter greater than 0";
        }
    }



