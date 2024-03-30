package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <Employee> employees= new ArrayList<>();

        System.out.println("How many employees will you add?");
        int n = sc.nextInt();

        for (int i =0; i<n; i++){
            System.out.println();
            System.out.println("Employee #"+ i + ":");
            System.out.println("id: ");
            Integer id = sc.nextInt();
            System.out.println("name: ");
            String name = sc.next();
            sc.nextLine();
            System.out.println("salary: ");
            Double salary = sc.nextDouble();
            employees.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        Integer idEmp = sc.nextInt();


        Employee emp = employees.stream().filter(x -> x.getId().equals(idEmp)).findFirst().orElse(null);

        if (emp == null){
            System.out.println("This employee does not exist");
        } else {
            System.out.print("Enter the percentage: ");
            Double incr = sc.nextDouble();
            emp.increaseSalary(incr);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee emplo : employees){
            System.out.println(emplo);
        }
    }
}
