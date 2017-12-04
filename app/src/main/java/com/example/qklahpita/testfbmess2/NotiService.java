package com.example.qklahpita.testfbmess2;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by qklahpita on 12/3/17.
 */

public class NotiService extends FirebaseMessagingService {
    private static final String TAG = "NotiService";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        Log.d(TAG, "onMessageReceived: " + remoteMessage.getNotification().getBody());
        Log.d(TAG, "onMessageReceived: " + remoteMessage.getData().get("title"));
    }
}
