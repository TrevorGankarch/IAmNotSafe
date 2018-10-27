package com.example.connor.iamnotsafe;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.IAmNotSafe.MESSAGE";
    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the HELP button is pressed ***/
    public void sendNotifications(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        String message = "TEST";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

        //send message
        String pnum = "6149156160";
        String pmes = "Hey dude its a message cool";
        SmsManager.getDefault().sendTextMessage(pnum, null, pmes, null, null);
        Toast.makeText(getApplicationContext(), "Message Sent", Toast.LENGTH_LONG).show();
//        Uri uri = Uri.parse("smsto: " + pnum);
//        Intent intent2 = new Intent(Intent.ACTION_SENDTO, uri);
//        intent2.putExtra("text body", pmes);
//        startActivity(intent2);
    }

}
