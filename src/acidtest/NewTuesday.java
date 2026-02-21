package acidtest;

import model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NewTuesday {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        Employee emp1 = new Employee();
        emp1.setName("John");
        emp1.setDept("HR");

        Employee emp3 = new Employee();
        emp3.setName("Bean");
        emp3.setDept("HR");

        Employee emp4 = new Employee();
        emp4.setName("Pean");
        emp4.setDept("HR");

        Employee emp2 = new Employee();
        emp2.setName("Jane");
        emp2.setDept("IT");

        list.add(emp1);
        list.add(emp2);list.add(emp2);list.add(emp2);list.add(emp2); list.add(emp2);
        list.add(emp3);
        list.add(emp4);





//        System.out.println("Employees by department: " + employeesByDept);

        list.stream().filter(e->e.getDept().equalsIgnoreCase("HR"))
                .map(e->e.getName().substring(0,2))
                .limit(2)
                .toList()
                .forEach(System.out::println);

        list.stream()
                .distinct()
                .collect(Collectors.groupingBy(e->e.getDept(), Collectors.counting()))
                .entrySet().stream()
                .forEach(e->System.out.println(e.getKey() +" = "+e.getValue()));



        String s1 = "Hello this is a string";

        char[] s2 = s1.toCharArray();


    }

    public Employee getEmp(){
        return new Employee();
    }
}
