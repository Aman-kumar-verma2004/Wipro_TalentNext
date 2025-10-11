package Collection.Manage_Employee_detail;

public class Employee implements Comparable<Employee> {
    private String firstName;
    private String secondName;
    private String mobileNumber;
    private String email;
    private String address;

    public Employee(String firstName, String secondName, String mobileNumber, String email, String address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() { return firstName; }
    public String getSecondName() { return secondName; }
    public String getMobileNumber() { return mobileNumber; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }

    @Override
    public int compareTo(Employee other) {
        return this.firstName.compareToIgnoreCase(other.firstName);
    }
}
