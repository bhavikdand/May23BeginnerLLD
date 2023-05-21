package com.scaler.lld.interface_example.db_example.ideal_way;

import com.scaler.lld.interface_example.db_example.User;

public interface UserDBOperations {

    User insert(User u);

    User update(int id, User updatedUser);
}
