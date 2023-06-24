package DesignPatterns;

public class BuilderClass1 {
    public static void main(String[] args) {
        Student student = new Student.Builder()
                .withName("John Doe")
                .withAge(22)
                .withAddress("123 Main St.")
                .build();
        System.out.println(student);
    }
}
class Student1 {
    private String name;
    private int age;
    private String address;

    private Student1(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    static class Builder {
        private String name;
        private int age;
        private String address;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Student1 build() {
            return new Student1(this);
        }

    }
}


