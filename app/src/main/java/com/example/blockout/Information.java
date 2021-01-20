package com.example.blockout;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Information extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        info();
    }
    public void info(){

    final MediaPlayer mp = MediaPlayer.create(this, R.raw.click);

    TextView text = (TextView)findViewById(R.id.textViewInfo);
    text.setTextColor(Color.WHITE);
    text.setTextSize(15);
    Button btn4 = (Button)findViewById(R.id.button4);
    btn4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            mp.start();
            onBackPressed();
        }
    });
}
}