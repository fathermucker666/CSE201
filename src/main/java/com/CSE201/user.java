package com.CSE201;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * user class
 * default constructor, addUser, loadFile, updateFile, userverification
 * @author Barb
 */
public class user {
	static ArrayList<User> users;
	private final File file = new File(" ");

	public void setUser(ArrayList<User> users) {
	this.user = users;
	}
	
	/**
	 * Adds and initiates user
	 * @param i id
	 * @param pass password
	 * @param perms permission
     * @param lev levels
	 */
	public void addUser(String u, String pass, int perms, int lev) {
		storage.add(new Users(u, pass, perms, lev));
	}
	
	/**
	 * Adds user with Users object
	 * @param a users
	 */
	public void addUser(Users a) {
		storage.add(a);
		updateFileUser();
	}
	
	/**
	 * Remove user with user object
	 * @param user passed to remove
	 */
	public void removeUser(Users user) {
		storage.remove(user);
		updateFileUser();
	}
	
	/***
	 * Removes user based on username
	 * @param id
	 */
	public void removeUser(String username) {
		Users temp = this.getUser(username);
		if(temp != null) {
			removeUser(temp);
		}
	}

    /***
	 * Removes user based on username
	 * @param in this case, referencing user 0, 
     * password (password may not be position 2
	 */
    public boolean userverification(){
        if (input != users[0][2]) { 
		char c;
		char x;  
            int count = 1;
			if(user.password.length(x) != input.length()){
				return false;
			} else{
            for (int i = 0; i < password.length() - 1; i++) {  
                c = password.charAt(i); 
				x = password.charAt(i);
                if (Character.compare(c, x) == 0) {         
                   continue;      
                } else{
					return false;
				} 
            }  
        }  
        return true;
	  }  
    }  
    /***
	 * Removes user based on username
	 * @param 
	 */
	public boolean loadFileUser() {
        try {
            Scanner sc= new Scanner(new File(filename));
            while (sc.hasNext()) {
                String line = sc.nextLine();
                LogRecord record = new LogRecord(line);
                //add record to the deltaRecord
                deltaRecords.add(record);
            }
        } catch (FileNotFoundException fe) {
            System.err.println(fe);
        }

	}
	/***
	 * Removes user based on username
	 * @param 
	 */
	public boolean updateFileUser() {
	try{
		FileOutputStream writeData = new FileOutputStream("users.ser");
		ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
		writeStream.writeObject(this.storage);
		writeStream.flush();		
		writeStream.close();
			return true;
		} catch (IOException e) {
			return false;
				}
		}
/***
	 * Removes user based on username
	 * @param 
	 */
public boolean catchDouble(String in) {
    try { 
        Double.parseDouble(in);
    } catch(NumberFormatException e) { 
        return false;
        }
    return true;
}
}
