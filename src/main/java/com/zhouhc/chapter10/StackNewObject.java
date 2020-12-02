package com.zhouhc.chapter10;

import java.util.ArrayList;
import java.util.List;

/**
 * -Xms256m -Xmx256m -XX:-DoEscapeAnalysis -XX:+PrintGCDetails
 */
public class StackNewObject {

    public static void main(String[] args) throws Exception {
        List<User> users = new ArrayList<User>();
        for (int i = 0; i < 1000000; i++)
            users.add(isStackNewUser());
        Thread.sleep(10000000);


    }

    public static User isStackNewUser() {
        User u = new User();
        return null;
    }


    static class User {

    }
}
