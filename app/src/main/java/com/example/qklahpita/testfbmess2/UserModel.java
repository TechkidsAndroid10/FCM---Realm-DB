package com.example.qklahpita.testfbmess2;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by qklahpita on 12/3/17.
 */

public class UserModel extends RealmObject{
    @PrimaryKey
    String id;
    String name;

    public UserModel() {
    }

    public UserModel(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
