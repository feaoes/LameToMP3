package com.swmofang.lametomp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MP3Recorder mp3Recorder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void start(View view) {
        mp3Recorder = new MP3Recorder();
        mp3Recorder.start();
    }

    public void stop(View view) {
        mp3Recorder.stop();
    }
}
