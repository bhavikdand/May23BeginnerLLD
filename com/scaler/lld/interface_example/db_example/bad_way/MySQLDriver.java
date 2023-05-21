package com.scaler.lld.interface_example.db_example.bad_way;

import com.scaler.lld.interface_example.db_example.User;

public class MySQLDriver {

    public User insert(User u){
        System.out.println("Inserting user");
        return u;
    }

    public User update(int id, User updated){
        System.out.println("Updating user with id:" + id);
        return updated;
    }
}
