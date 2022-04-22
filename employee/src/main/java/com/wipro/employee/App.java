package com.wipro.employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee emp=new Employee();  // constructor automatically called
        //constructor - set default values to instance variable 
        // Use Setter method to set values
        emp.setId(101);
        emp.setName("Siva");
        emp.setPhone(9566259967l);
        emp.setSalary(34000);
        System.out.println("Employee Detail 1");
        emp.displayEmployeeDetails();
        
        // Parameterized Constructor
        Employee emp2=new Employee(102, "Ajay", 25000, 9766542245l);
        System.out.println("Employee Detail 2");
        emp2.displayEmployeeDetails();
    }
}
