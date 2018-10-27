package com.example.connor.iamnotsafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.IAmNotSafe.MESSAGE";

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
    }

}
