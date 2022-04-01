package chapterSeventeen;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamEmployeeManipulations {
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("Esther", "Love", "Voice-Over", 2000000000),
                new Employee("Joy", "Love", "Voice-Over", 2000000000),
                new Employee("Jacinth", "Love", "Voice-Over", 2000000000)
        };
        List<Employee> employeeList = Arrays.asList(employees);
       Map<String,List <Employee>> employeeGroups =employeeList .stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(employeeGroups);
        Predicate<Employee> isInvestor = (department)-> department.getDepartment().equals("Voice-Over");
          Optional<Employee> employee= employeeList.stream().filter(isInvestor).min(Comparator.comparing(Employee::getFirstName));
//                     .orElseThrow(NullPointerException::new);
        if(employee.isPresent()) System.out.println(employee.get());
        else System.out.println("No employee found");
    }

}
class Employee{
    private String firstName;
    private String lastName;
    private String department;
    private int salary;

    public Employee(String firstName, String lastName, String department, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() { 
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", department='").append(department).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
