package com.example.autoxwatchdog;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;

public class AlertDetails extends AppCompatActivity {

    // Load image from storage
    // PictureContent.loadImage(new File(filePath));
    private String imageUri;
    private String imageDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_details);
        //Get values sent from other activities
        Bundle extras = getIntent().getExtras();
        if (extras != null){
            imageUri = extras.getString("uri");
            imageDate = extras.getString("date");
        }
        displayPassedVariables();
        displayLargeImage();
    }

    private void displayPassedVariables(){

        TextView date_data = findViewById(R.id.passed_date);
        date_data.setText(getString(R.string.captured_on) + imageDate);

    }

    private void displayLargeImage(){
        

            ImageView imageView = findViewById(R.id.largeImage);
            imageView.setImageURI(Uri.parse(imageUri));


    }

    public void deleteImage(View view) {
    }
}
