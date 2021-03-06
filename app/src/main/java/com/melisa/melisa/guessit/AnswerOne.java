package com.melisa.melisa.guessit;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class AnswerOne extends AppCompatActivity {


    Button buttonBack;
    TextView textViewScore;
    TextView txtOne,txtTwo,txtThree;

    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_one);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-6234689785392855/3200276895");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        buttonBack=findViewById(R.id.buttonback);
        textViewScore=findViewById(R.id.score);
        txtOne=findViewById(R.id.txtone);
        txtTwo=findViewById(R.id.txttwo);
        txtThree=findViewById(R.id.txtthree);


        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        textViewScore.setText("Your score: " + score);
        if (score==1){
            txtOne.setText("Well Played");
            txtTwo.setText("Try Again for the Better Score");
            txtThree.setText("10%");
        }
        else if (score==2){
            txtOne.setText("Well Played");
            txtTwo.setText("Try Again for the Better Score");
            txtThree.setText("20%");
        }
        else if (score==3){
            txtOne.setText("Well Played");
            txtTwo.setText("Try Again for the Better Score");
            txtThree.setText("30%");
        }
        else if (score==4){
            txtOne.setText("Well Played");
            txtTwo.setText("Try Again for the Better Score");
            txtThree.setText("40%");

        }
        else if (score==5){

            txtOne.setText("Well Played");
            txtTwo.setText("Try Again for the Better Score");
            txtThree.setText("50%");
        }
        else if (score==6){

            txtOne.setText("Well Played");
            txtTwo.setText("Try Again for the Better Score");
            txtThree.setText("60%");
        }
        else if (score==7){

            txtOne.setText("Well Played");
            txtTwo.setText("Try Again for the Better Score");
            txtThree.setText("70%");
        }
        else if (score==8){

            txtOne.setText("Well Played");
            txtTwo.setText("Try Again for the Better Score");
            txtThree.setText("80%");
        }
        else if (score==9){

            txtOne.setText("Well Played");
            txtTwo.setText("Try Again for the Better Score");
            txtThree.setText("90%");
        }
        else if (score==10){

            txtOne.setText("GREAT!!!");
            txtTwo.setText("You Did iT!!!");
            txtThree.setText("100%");
        }

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Intent intent = new Intent(AnswerOne.this, levelStage.class);
                    startActivity(intent);
                }

            }
        });

        }

    @Override
    public void onBackPressed() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Intent intent = new Intent(AnswerOne.this, levelStage.class);
            startActivity(intent);
        }
    }
}
