package com.scaler.lld.interface_example.db_example.ideal_way;

import com.scaler.lld.interface_example.db_example.User;
import com.scaler.lld.interface_example.db_example.bad_way.MongoDriver;

public class MongoDBUserOperations implements UserDBOperations {
    MongoDriver mongoDriver = new MongoDriver();

    @Override
    public User insert(User u) {
        return mongoDriver.insertOne("user", u);
    }

    @Override
    public User update(int id, User updatedUser) {
        return mongoDriver.update(id, updatedUser, false);
    }
}
