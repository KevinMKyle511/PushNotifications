package com.mobileappscompany.training.pushnotifications;

import android.util.Log;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by User on 2/15/2017.
 */

public class MyFS extends FirebaseMessagingService
{
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage)
    {
        super.onMessageReceived(remoteMessage);
        String s = remoteMessage.getData().get("key");
        Log.d("MAC", "message is " + s);
        //Toast.makeText(this, "message is " + s, Toast.LENGTH_SHORT).show();
        // code here
    }
}
