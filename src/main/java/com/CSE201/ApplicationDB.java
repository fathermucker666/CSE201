package com.CSE201;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.LogRecord;

public class ApplicationDB {

    static ArrayList<Application> apps;
    private final File file = new File(" ");
    public void setUser(ArrayList<Application> apps) {
        this.apps = apps;
    }

    /**
     * Adds and initiates application
     */
    public void addUser(String applicationName, String description, String organization, String platforms, String versions, String externalStore, Integer price, String userName) {
        apps.add(new Application(applicationName, description, organization, platforms, versions, externalStore, price, userName));
    }

    /**
     * Adds app with Application object
     * @param a users
     */
    public void addApplication(Application a) {
        apps.add(a);
        updateFileUser();
    }

    /**
     * Remove user with user object
     * @param user passed to remove
     */
    public void removeApplication(Application application) {
        apps.remove(application);
        updateFileUser();
    }

    /***
     * Removes user based on username
     * @param id
     */
    public void removeUser(String applicationName) {
        for (int i = 0; i < apps.size(); i++){
            if (apps.get(i).getApplicationName() == applicationName){
                apps.remove(i);
            }
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
            FileOutputStream writeData = new FileOutputStream("apps.ser");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
            writeStream.writeObject(apps);
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