package com.scaler.lld.interface_example.db_example.ideal_way;

import com.scaler.lld.interface_example.db_example.User;
import com.scaler.lld.interface_example.db_example.bad_way.MySQLDriver;

public class MySQLUserDBOperations implements UserDBOperations {

    MySQLDriver driver = new MySQLDriver();
    @Override
    public User insert(User u) {
        return driver.insert(u);
    }

    @Override
    public User update(int id, User updatedUser) {
        return driver.update(id,updatedUser);
    }
}
