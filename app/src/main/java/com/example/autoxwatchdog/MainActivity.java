package com.example.autoxwatchdog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayToast(String message){
        Toast.makeText(getApplicationContext(),message,
                Toast.LENGTH_LONG).show();
    }

    public void loginApp(View view) {
        displayToast("Login Button was pressed.");
    }

    public void launchMainMenu(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        displayToast("Launching Main Menu");
        startActivity(intent);
    }

    public void registerApp(View view) {
        displayToast("Register Button was pressed.");
    }
}

