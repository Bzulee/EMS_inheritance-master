import models.Employee;
import models.Company;
public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        Employee employee1 = new Employee(1, "julius", 25000);
        Employee employee2 = new Employee(2, "oden", 16000);


        company.addEmployee(employee1);
        company.addEmployee(employee2);



        System.out.println(company);
    }
}




