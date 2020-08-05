public class execute {
    

    public static void main(String[] args){
        employee emp = new employee();
        emp.Employee("Jack");
        emp.setSalary(1000);
        System.out.println(emp.printinfo());
        for (int i=0;i<10;i++) {
            System.out.println(i);
        }


    }
    
}