package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoView;  //casting to VideoView is not Strictly required above API level 26
        videoView = findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.tobeymaguiredancing_1); //set the path of the video that we need to use in our VideoView
        videoView.start(); //start() method of the VideoView class will start the video to play
    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}