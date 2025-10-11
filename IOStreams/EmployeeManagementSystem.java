package IOStreams;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            int option = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Employee Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();
                    Employee e = new Employee(id, name, age, salary);
                    employees.add(e);
                    // Optional: Write to file
                    try (FileWriter fw = new FileWriter("employees.txt", true)) {
                        fw.write(id + "," + name + "," + age + "," + salary + "\n");
                    } catch (IOException ex) {
                        System.out.println("Error writing to file.");
                    }
                    break;
                case 2:
                    System.out.println("-----Report-----");
                    for (Employee emp : employees) {
                        System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getAge() + " " + emp.getSalary());
                    }
                    System.out.println("-----End of Report-----");
                    break;
                case 3:
                    System.out.println("Exiting the System");
                    return;
                default:
                    System.out.println("Invalid Option. Try again.");
            }
        }
    }
}
