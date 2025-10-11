package Collection.Manage_Employee_detail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeRegister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> empList = new ArrayList<>();

        System.out.print("Enter the Number of Employees\n");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Employee " + (i+1) + " Details:");
            System.out.print("Enter the Firstname\n");
            String firstName = sc.nextLine();
            System.out.print("Enter the Lastname\n");
            String secondName = sc.nextLine();
            System.out.print("Enter the Mobile\n");
            String mobileNumber = sc.nextLine();
            System.out.print("Enter the Email\n");
            String email = sc.nextLine();
            System.out.print("Enter the Address\n");
            String address = sc.nextLine();

            empList.add(new Employee(firstName, secondName, mobileNumber, email, address));
        }

        Collections.sort(empList);

        System.out.format("%-15s %-15s %-15s %-30s %-15s\n", 
            "FirstName", "SecondName", "MobileNumber", "Email", "Address");

        for (Employee e : empList) {
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n", 
                e.getFirstName(), e.getSecondName(), e.getMobileNumber(), e.getEmail(), e.getAddress());
        }
    }
}
