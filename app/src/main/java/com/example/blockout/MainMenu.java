package com.example.blockout;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
//import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainMenu extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        final MediaPlayer menuSound = MediaPlayer.create(this, R.raw.weightless);
        menuSound.start();
        final ToggleButton toggleBtn = (ToggleButton) findViewById(R.id.toggleMusic);
        toggleBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){
                    menuSound.start();
                }else{
                    menuSound.stop();
                }
            }
        });
        setOnClick();
    }


    private void setOnClick() {

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        TextView text = (TextView) findViewById(R.id.editText);
        text.setText("BLOCK OUT");
        text.setTextSize(50);
        text.setTextColor(Color.WHITE);
        text.setGravity(Gravity.CENTER);

        Button btn1 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
               startActivity(new Intent(MainMenu.this, MainActivity.class));

            }
        });


        final Button btn2 = (Button) findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                startActivity(new Intent(MainMenu.this, Information.class));
            }
        });
        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                finish();
                System.exit(0);
            }
        });
    }
}