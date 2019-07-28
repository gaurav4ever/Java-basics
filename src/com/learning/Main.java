package com.learning;

import com.learning.bulderPattern.Cart;
import com.learning.bulderPattern.Order;
import com.learning.singleton.Service1;
import com.learning.singleton.Service2;
import com.learning.singleton.Service3;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Service1 s1 = new Service1();
        Service2 s2 = new Service2();
        Service3 s3 = new Service3();

        System.out.println("Service1 Count:" + s1.getCount() + " Dbname:" + s1.getDbName() + " MxaConn:" + s1.getMaxconn() + " Exception:" + s1.getExc());
        System.out.println("Service2 Count:" + s2.getCount() + " Dbname:" + s2.getDbName() + " MxaConn:" + s2.getMaxconn() + " Exception:" + s2.getExc());
        System.out.println("Service1 Count:" + s3.getCount() + " Dbname:" + s3.getDbName() + " MxaConn:" + s3.getMaxconn() + " Exception:" + s3.getExc());

        Order order = Order.Builder.newInstance()
                .setCarId("123")
                .setCreatedAt(new Date())
                .setCustomerId("Harshit")
                .setOrderId("O001")
                .build();
        Cart cart = Cart.Builder.newInstance()
                .setVal1("Mac book pro")
                .setVal2("JBL Flip")
                .setVal3("Echo dot")
                .build();
        System.out.println("Cart val1:" + cart.getVal1() + " Dbname:" + cart.getVal2() + " MxaConn:" + cart.getVal3());

    }
}
