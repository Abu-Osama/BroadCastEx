package com.example.abuosama.broadcastex;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.


       String action=intent.getAction();

        switch (action){

            case Intent.ACTION_SCREEN_OFF:
                Toast.makeText(context, "screen off", Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                Toast.makeText(context, "power disconnect", Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_BATTERY_LOW:
                Toast.makeText(context, "battrery  low", Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_CAMERA_BUTTON:
                Toast.makeText(context, "cmaera button", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
