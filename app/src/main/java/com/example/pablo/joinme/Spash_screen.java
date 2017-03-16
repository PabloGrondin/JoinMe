package com.example.pablo.joinme;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Spash_screen extends AppCompatActivity {

    public  static int SPLASH_TIME = 3000 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash_screen);

        getSupportActionBar().hide();


        // Pour gerer ce qui va afficher l'activité qu'un petit moment :
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(getBaseContext(),MainActivity.class));
            }
        },SPLASH_TIME);


    }

}
