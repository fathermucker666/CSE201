package com.CSE201;
import java.util.*;
/**
 * @author Barb
 */
public class Registration {
  
    public static void main(String[]args){
        Register register = new Register();
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter first name: ");
            String firstName = scanner.nextLine();
            register.setFirstName(firstName);

            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();
            register.setLastName(lastName);

            System.out.print("Enter email: ");
            String emailID = scanner.nextLine();
            register.setEmailID(emailID);

            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            register.setPassword(password);

            System.out.print("Enter userName: ");
            String userName = scanner.nextLine();
            register.setUserName(userName);

            System.out.print("Enter phone number: ");
            long phone_Number = scanner.nextLong();
            register.setPhone_Number(phone_Number);

            printRegisterData(register);

        }
    }
    private static void printRegisterData(Register register){
        System.out.println(register.getFirstName());
        System.out.println(register.getLastName());
        System.out.println(register.getEmailID());
        System.out.println(register.getPassword());
        System.out.println(register.getUserName());
        System.out.println(register.getPhone_Number());

    }
}

 class Register{
    private String firstName;
    private String lastName;
    private String emailID;
    private String password;
    private String userName;
    private long phone_Number;

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
    
    public String getEmailID() {
        return emailID;
    }
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public long getPhone_Number() {
        return phone_Number;
    }
    public void setPhone_Number(long phone_Number) {
        this.phone_Number = phone_Number;
    }
}
