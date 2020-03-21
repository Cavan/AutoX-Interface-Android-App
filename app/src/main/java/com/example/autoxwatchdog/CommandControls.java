package com.example.autoxwatchdog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CommandControls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command_controls);

    }
    // Display a toast message to the user
    public void displayToast(String message){
        Toast.makeText(getApplicationContext(),message,
                Toast.LENGTH_SHORT).show();
    }

    // Handle command buttons
    public void handleCommand(View v){
            switch (v.getId()){
                case R.id.get_front:
                    //Call method to capture front image
                    displayToast("Capture front image");
                    break;
                case R.id.get_left:
                    //Call method to capture left image
                    displayToast("Capture left image");
                    break;
                case R.id.get_right:
                    //Call method to capture right image
                    displayToast("Capture right image");
                    break;
                case R.id.get_rear:
                    //Call method to capture rear image
                    displayToast("Capture rear image");
                    break;
            }
        }


}
