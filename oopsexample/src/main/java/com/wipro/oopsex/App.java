package com.wipro.oopsex;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee empTwo=new Employee();
        //empTwo.id=101;
        empTwo.setId(101);
        empTwo.setName("Vijay");
        empTwo.setPhone(9566259956l);
        empTwo.setAadharNumber("11111");
        empTwo.setAccountNumber("22222");
        empTwo.setPanNumber("33333");
        
        
        System.out.println(empTwo.getId());
        System.out.println(empTwo.getName());
        System.out.println(empTwo.getPhone());
        System.out.println(empTwo.getAadharNumber());
        System.out.println(empTwo.getAccountNumber());
        System.out.println(empTwo.getPanNumber());
        
        
        
        
        
    }
}
