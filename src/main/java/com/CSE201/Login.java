package com.CSE201;
import java.util.*;
/**
 * @ author Barb
 */
public class Login {
  public static void main(String[] args){
    try(Scanner scanner = new Scanner(System.in)){

        System.out.print("Enter userName: ");
        String userName = scanner.nextLine();

        System.out.print("Enter password: ");
            String password = scanner.nextLine();
         // if username and password is equal print successful else invalid   
        if(" ".equals(userName) && " ".equals(password)){
            System.out.println("User login is successfully");
        }else{
            System.out.println("Username or password is invalid");
        }
    }
      
  }
}
