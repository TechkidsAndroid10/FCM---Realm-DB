package com.example.qklahpita.testfbmess2;

import java.util.List;

import io.realm.Realm;

/**
 * Created by qklahpita on 12/3/17.
 */

public class DatabaseHandler {
    private static Realm realm = Realm.getDefaultInstance();

    public static void addUser(UserModel userModel) {
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(userModel);
        realm.commitTransaction();
    }

    public static List<UserModel> getListUser() {
        return realm.where(UserModel.class).findAll();
    }

    public static void deleteUser(String id) {
        UserModel userModel = realm.where(UserModel.class).findAll()
                .where().equalTo("id", id).findFirst();
        realm.beginTransaction();
        userModel.deleteFromRealm();
        realm.commitTransaction();
    }
}
