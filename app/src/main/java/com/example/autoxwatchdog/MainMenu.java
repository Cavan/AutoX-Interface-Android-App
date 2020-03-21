package com.example.autoxwatchdog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void launchCommandView(View view) {
        Intent intent = new Intent(this, CommandControls.class);
        startActivity(intent);
    }
    public void launchAlertView(View view){
        Intent intent = new Intent(this, Alerts.class);
        startActivity(intent);
    }
}
