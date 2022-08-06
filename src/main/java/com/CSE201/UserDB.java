package com.CSE201;
import java.io.*;
import java.util.*;
import java.util.logging.LogRecord;

/**
 * user class
 * default constructor, addUser, loadFile, updateFile, userverification
 * @author Barb
 */
public class UserDB {
	static ArrayList<User> users;
	private final File file = new File(" ");

	public void setUser(ArrayList<User> users) {
	this.users = users;
	}
	
	/**
	 * Adds and initiates user
	 * @param i id
	 * @param pass password
	 * @param perms permission
     * @param lev levels
	 */
	public void addUser(Integer userId, String userName, String userPassword, int userLevel) {
		users.add(new User(userId, userName, userPassword, userLevel));
	}
	
	/**
	 * Adds user with Users object
	 * @param a users
	 */
	public void addUser(User a) {
		users.add(a);
		updateFileUser();
	}
	
	/**
	 * Remove user with user object
	 * @param user passed to remove
	 */
	public void removeUser(User user) {
		users.remove(user);
		updateFileUser();
	}
	public void removeUser(String userName) {
		for (int i = 0; i < users.size(); i++){
			if (users.get(i).getUserName() == userName){
				users.remove(i);
			}
		}
	}

    /***
	 * Removes user based on username
	 * @param in this case, referencing user 0, 
     * password (password may not be position 2
	 */
    public boolean userverification(){
        if (input != users.get(0).getUserName()) {
		char c;
		char x;  
            int count = 1;
			if(UserDB.password.length(x) != input.length()){
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
		return true;
	}
	/***
	 * Removes user based on username
	 * @param 
	 */
	public boolean updateFileUser() {
	try{
		FileOutputStream writeData = new FileOutputStream("users.ser");
		ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
		writeStream.writeObject(users);
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