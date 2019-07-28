package com.learning.singleton;

public class Service2 {

    int count;
    String dbName;
    double maxconn;
    String exc;

    /**
     * Public Constructor
     */
    public Service2() {
        count = Dbutil.getInstance().getCount();
        dbName = Dbutil.getInstance().getDbname();
        maxconn = Dbutil.getInstance().getMaxconn();
        exc = Dbutil.getInstance().getException();
    }

    public int getCount() {
        return count;
    }


    public String getDbName() {
        return dbName;
    }


    public double getMaxconn() {
        return maxconn;
    }


    public String getExc() {
        return exc;
    }


}
