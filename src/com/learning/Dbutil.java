package com.learning;

public class Dbutil {

    // singelton object of class Dbutil
    private static Dbutil db;
    private int count;
    private String dbname;
    private double maxconn;
    private String exception;

    /**
     * private constructor of Dbutil
     */
    private Dbutil() {
        count = 1;
        dbname = "Mydb:3307";
        maxconn = 1000;
        exception = "Area:51";
    }

    /**
     * function to return the singelton object
     *
     * @return new Dbutil object
     */
    public static Dbutil getInstance() {
        if (null == db) {
            db = new Dbutil();
        }
        return db;
    }

    public int getCount () {
        return count;
    }

    public static Dbutil getDb() {
        return db;
    }

    public String getDbname() {
        return dbname;
    }

    public double getMaxconn() {
        return maxconn;
    }

    public String getException() {
        return exception;
    }
}
