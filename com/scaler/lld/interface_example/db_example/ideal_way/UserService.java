package com.scaler.lld.interface_example.db_example.ideal_way;

import com.scaler.lld.interface_example.db_example.User;

public class UserService {

    UserDBOperations db = new MongoDBUserOperations();

    public User createUser(User u){
        return db.insert(u);
    }

    public User updateUser(User u){
        return db.update(u.id, u);
    }
}
