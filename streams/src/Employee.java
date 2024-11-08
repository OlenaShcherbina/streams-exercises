class Employee implements Comparable{
    String name;
    int age;
    double salary;
    String jobTitle;
    // Constructor, getters, and setters

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.jobTitle = "Employee";
    }
    public Employee(String name, int age, double salary, String jobTitle) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public int compareTo(Object o) {
        if(this.getSalary() == ((Employee) o).getSalary()){
            return 0;
        }
        return ((Employee) o).getSalary() < this.getSalary() ? -1 : 1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", jobTitle=" + jobTitle +
                '}';
    }
}
