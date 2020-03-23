package com.example.autoxwatchdog;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public class AlertDetails extends AppCompatActivity {

    // Load image from storage
    // PictureContent.loadImage(new File(filePath));
    private String imageUri;
    private String imageDate;
    private Uri deleteUri;
    private final String TAG = "AlertDetails";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_details);
        //Get values sent from other activities
        Bundle extras = getIntent().getExtras();
        if (extras != null){
            imageUri = extras.getString("uri");
            imageDate = extras.getString("date");
            deleteUri = Uri.parse(imageUri);

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

        File file = null;
        try {
            file = new File(new URI(imageUri));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        if (file.exists()){
            //Later on add a context menu to ask the user...
            //if they really want to delete the image.
            if (file.delete()) {
                Toast.makeText(this, "file Deleted :", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, AlertsList.class);
                startActivity(intent);
            } else {
                Toast.makeText(this, "file not Deleted :" , Toast.LENGTH_SHORT).show();

            }
        }
    }



}

