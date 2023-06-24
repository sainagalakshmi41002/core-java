package DesignPatterns;


class BuilderClass{
    public static void main(String[] args) {
        Student student = new Student.Builder()
                .withName("John Doe")
                .withAge(22)
                .withAddress("123 Main St.")
                .withPhoneNumber("555-555-1212")
                .build();
        System.out.println(student);
    }
}
class Student {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
    }
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    static class Builder {
        private String name;
        private int age;
        private String address;
        private String phoneNumber;

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

        public Builder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }
}