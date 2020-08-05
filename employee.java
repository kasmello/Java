public class employee {
    public String name;
    private Integer salary;
    public void Employee(String empName) {
        name = empName;
    }
    public void setSalary(Integer empSalary) {
        //void means not returning anything
        salary = empSalary;
    }

    public String printinfo() {
        String returnStr = "Name: " + this.name + ", Salary: " + this.salary;
        return returnStr;
    }
}