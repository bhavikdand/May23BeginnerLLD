package com.scaler.lld.interface_example.db_example.bad_way;

import com.scaler.lld.interface_example.db_example.User;

public class UserService {

    MongoDriver db = new MongoDriver();

    public User createUser(User u){
//        return db.insert(u);
        return null;
    }

    public User updateUser(User u){
//        return db.update(u.id, u);
        return null;
    }
}
