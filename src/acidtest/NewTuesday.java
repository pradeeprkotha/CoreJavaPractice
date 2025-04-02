package acidtest;

import model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NewTuesday {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        Employee emp1 = new Employee();
        emp1.setName("John");
        emp1.setDept("HR");
        Employee emp2 = new Employee();
        emp2.setName("Jane");
        emp2.setDept("IT");
        list.add(emp1);list.add(emp2);


        Map<String, List<Employee>> employeesByDept = list
                .stream()
                .collect(Collectors.groupingBy(Employee::getDept));

        System.out.println("Employees by department: " + employeesByDept);



    }
}
