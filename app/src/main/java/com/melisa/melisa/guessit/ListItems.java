package com.melisa.melisa.guessit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.melisa.melisa.guessit.data.Eight;
import com.melisa.melisa.guessit.data.Eleven;
import com.melisa.melisa.guessit.data.Five;
import com.melisa.melisa.guessit.data.Four;
import com.melisa.melisa.guessit.data.Fourteen;
import com.melisa.melisa.guessit.data.Nine;
import com.melisa.melisa.guessit.data.One;
import com.melisa.melisa.guessit.data.Seven;
import com.melisa.melisa.guessit.data.Six;
import com.melisa.melisa.guessit.data.Ten;
import com.melisa.melisa.guessit.data.Thirteen;
import com.melisa.melisa.guessit.data.Three;
import com.melisa.melisa.guessit.data.Twelve;
import com.melisa.melisa.guessit.data.Two;

import java.util.Objects;

public class ListItems extends AppCompatActivity {
    RelativeLayout picOneRe,picTwoRe,picThreeRe,picFourRe,picFiveRe,picSixRe,picSevenRe,picEightRe,picNineRe,picTenRe,
            picElevenRe,picTwelveRe,picThirteenRe,picFourteenRe,picFifteenRe,picSixteenRe,picSeventeenRe,picEigtheenRe,
            picNineteenRe,picTwentyRe;
    ImageView picOne,picTwo,picThree,picFour,picFive,picSix,picSeven,picEight,picNine,picTen,
    picEleven,picTwelve,picThirteen,picFourteen,picFifteen,picSixteen,picSeventeen,picEigtheen,
    picNineteen,picTwenty;
    ImageView picOnePic,picTwoPic,picThreePic,picFourPic,picFivePic,picSixPic,picSevenPic,picEightPic,picNinePic,picTenPic,
            picElevenPic,picTwelvePic,picThirteenPic,picFourteenPic,picFifteenPic,picSixteenPic,picSeventeenPic,picEigtheenPic,
            picNineteenPic,picTwentyPic;
    ImageView[] arrayNames =new ImageView[20];
    ImageView[] imageArrayNames =new ImageView[20];
    //private One one = new One();
    TextView golden;
    TextView txtclose;
    TextView facebook;
    One one;Two two;Three three;Four four;Five five;Six six;Seven seven;Eight eight;
    Nine nine;Ten ten;Eleven eleven;Twelve twelve;Thirteen thirteen;Fourteen fourteen;
    private RewardedAd rewardedAd;
    AdView madView;
    int gold;
    ImageButton addButton;
    Dialog myDialog;
    String check,checkIt;
   // boolean hai;
    String cate;
    SharedPreferences myPrefs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_items);

        MobileAds.initialize(this,"ca-app-pub-6234689785392855/3743202374");
        madView=findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        madView.loadAd(adRequest);
        Objects.requireNonNull(getSupportActionBar()).hide();
        myPrefs = this.getSharedPreferences("myPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = myPrefs.edit();
        picOneRe=findViewById(R.id.picOneRe);
        picTwoRe=findViewById(R.id.picTwoRe);
        picThreeRe=findViewById(R.id.picThreeRe);
        picFourRe=findViewById(R.id.picFourRe);
        picFiveRe=findViewById(R.id.picFiveRe);
        picSixRe=findViewById(R.id.picSixRe);
        picSevenRe=findViewById(R.id.picSevenRe);
        picEightRe=findViewById(R.id.picEightRe);
        picNineRe=findViewById(R.id.picNineRe);
        picTenRe=findViewById(R.id.picTenRe);
        picElevenRe=findViewById(R.id.picElevenRe);
        picTwelveRe=findViewById(R.id.picTwelveRe);
        picThirteenRe=findViewById(R.id.picThirteenRe);
        picFourteenRe=findViewById(R.id.picFourteenRe);
        picFifteenRe=findViewById(R.id.picFifteenRe);
        picSixteenRe=findViewById(R.id.picSixteenRe);
        picSeventeenRe=findViewById(R.id.picSeventeenRe);
        picEigtheenRe=findViewById(R.id.picEighteenRe);
        picNineteenRe=findViewById(R.id.picNineteenRe);
        picTwentyRe=findViewById(R.id.picTwentyRe);
        picOnePic=findViewById(R.id.picOnePic);
        picTwoPic=findViewById(R.id.picTwoPic);
        picThreePic=findViewById(R.id.picThreePic);
        picFourPic=findViewById(R.id.picFourPic);
        picFivePic=findViewById(R.id.picFivePic);
        picSixPic=findViewById(R.id.picSixPic);
        picSevenPic=findViewById(R.id.picSevenPic);
        picEightPic=findViewById(R.id.picEightPic);
        picNinePic=findViewById(R.id.picNinePic);
        picTenPic=findViewById(R.id.picTenPic);
        picElevenPic=findViewById(R.id.picElevenPic);
        picTwelvePic=findViewById(R.id.picTwelvePic);
        picThirteenPic=findViewById(R.id.picThirteenPic);
        picFourteenPic=findViewById(R.id.picFourteenPic);
        picFifteenPic=findViewById(R.id.picFifteenPic);
        picSixteenPic=findViewById(R.id.picSixteenPic);
        picSeventeenPic=findViewById(R.id.picSeventeenPic);
        picEigtheenPic=findViewById(R.id.picEighteenPic);
        picNineteenPic=findViewById(R.id.picNineteenPic);
        picTwentyPic=findViewById(R.id.picTwentyPic);
        golden=findViewById(R.id.gold);
        picOne=findViewById(R.id.picOne);
        picTwo=findViewById(R.id.picTwo);
        picThree=findViewById(R.id.picThree);
        picFour=findViewById(R.id.picFour);
        picFive=findViewById(R.id.picFive);
        picSix=findViewById(R.id.picSix);
        picSeven=findViewById(R.id.picSeven);
        picEight=findViewById(R.id.picEight);
        picNine=findViewById(R.id.picNine);
        picTen=findViewById(R.id.picTen);
        picEleven=findViewById(R.id.picEleven);
        picTwelve=findViewById(R.id.picTwelve);
        picThirteen=findViewById(R.id.picThirteen);
        picFourteen=findViewById(R.id.picFourteen);
        picFifteen=findViewById(R.id.picFifteen);
        picSixteen=findViewById(R.id.picSixteen);
        picSeventeen=findViewById(R.id.picSeventeen);
        picEigtheen=findViewById(R.id.picEighteen);
        picNineteen=findViewById(R.id.picNineteen);
        picTwenty=findViewById(R.id.picTwenty);
        addButton=findViewById(R.id.addButton);
        myDialog = new Dialog(this);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            cate = extras.getString("key");
            //The key argument here must match that used in the other activity
        }
//        check=myPrefs.getString("levelone", null);
//        if (check == null ) {
//            editor.putString("levelone", "FTFFFFTFFFFTFFFFFFFF");
//            editor.putString("leveltwo", "TFTFFFFFFFFFFFFFFFFF");
//            editor.putString("levelthree", "TTTTTTTTTTTTTTTTTTTT");
//            editor.putString("levelfour", "FFFFFFFFFFFFFFFFFFFF");
//            editor.putString("levelfive", "FFFFFFFFFFFFFFFFFFFF");
//            editor.putString("levelsix", "FFFFFFFFFFFFFFFFFFFF");
//            editor.putString("levelseven", "FFFFFFFFFFFFFFFFFFFF");
//            editor.putString("leveleight", "FFFFFFFFFFFFFFFFFFFF");
//            editor.putString("levelnine", "FFFFFFFFFFFFFFFFFFFF");
//            editor.putString("levelten", "FFFFFFFFFFFFFFFFFFFF");
//            editor.putString("leveleleven", "FFFFFFFFFFFFFFFFFFFF");
//            editor.putString("leveltwelve", "FFFFFFFFFFFFFFFFFFFF");
//            editor.putString("levelthirteen", "FFFFFFFFFFFFFFFFFFFF");
//            editor.putString("levelfourteen", "FFFFFFFFFFFFFFFFFFFF");
//            editor.apply();
//        }



        imageArrayNames[0] = picOnePic;imageArrayNames[1] = picTwoPic;imageArrayNames[2] = picThreePic;imageArrayNames[3] =picFourPic ;
        imageArrayNames[4] =picFivePic ;imageArrayNames[5] = picSixPic;imageArrayNames[6] = picSevenPic;imageArrayNames[7] = picEightPic;
        imageArrayNames[8] =picNinePic ;imageArrayNames[9] =picTenPic ;imageArrayNames[10] = picElevenPic;imageArrayNames[11] = picTwelvePic;
        imageArrayNames[12] = picThirteenPic;imageArrayNames[13] = picFourteenPic;imageArrayNames[14] = picFifteenPic;
        imageArrayNames[15] = picSixteenPic;imageArrayNames[16] = picSeventeenPic;imageArrayNames[17] = picEigtheenPic;
        imageArrayNames[18] = picNineteenPic;imageArrayNames[19] = picTwentyPic;

        arrayNames[0] = picOne;arrayNames[1] = picTwo;arrayNames[2] = picThree;arrayNames[3] =picFour ;arrayNames[4] =picFive ;
        arrayNames[5] = picSix;arrayNames[6] = picSeven;arrayNames[7] = picEight;arrayNames[8] =picNine ;arrayNames[9] =picTen ;
        arrayNames[10] = picEleven;arrayNames[11] = picTwelve;arrayNames[12] = picThirteen;arrayNames[13] = picFourteen;
        arrayNames[14] = picFifteen; arrayNames[15] = picSixteen;arrayNames[16] = picSeventeen;arrayNames[17] = picEigtheen;
        arrayNames[18] = picNineteen;arrayNames[19] = picTwenty;

        rewardedAd = new RewardedAd(this,
                "ca-app-pub-6234689785392855/3823734055");

        RewardedAdLoadCallback adLoadCallback = new RewardedAdLoadCallback() {
            @Override
            public void onRewardedAdLoaded() {
                // Ad successfully loaded.
            }

            @Override
            public void onRewardedAdFailedToLoad(int errorCode) {
                // Ad failed to load.
            }
        };
        rewardedAd.loadAd(new AdRequest.Builder().build(), adLoadCallback);

        gold=myPrefs.getInt("GOLD", 0);
        golden.setText(gold+"");
        // one.getQuestion(1);
        if(cate.equals("levelone")){
            one = new One();
            for (int a=0; a<20;a++){
                arrayNames[a].setImageResource(one.getQuestion(a));
            }
        }
        else if(cate.equals("leveltwo")){
            two = new Two();
            for (int a=0; a<20;a++){
                arrayNames[a].setImageResource(two.getQuestion(a));
            }
        }
        else if(cate.equals("levelthree")){
            three = new Three();
            for (int a=0; a<20;a++){
                arrayNames[a].setImageResource(three.getQuestion(a));
            }
        }
        else if(cate.equals("levelfour")){
            four = new Four();
            for (int a=0; a<20;a++){
                arrayNames[a].setImageResource(four.getQuestion(a));
            }
        }
        else if(cate.equals("levelfive")){
            five = new Five();
            for (int a=0; a<20;a++){
                arrayNames[a].setImageResource(five.getQuestion(a));
            }
        }
        else if(cate.equals("levelsix")){
             six= new Six();
            for (int a=0; a<20;a++){
                arrayNames[a].setImageResource(six.getQuestion(a));
            }
        }
        else if(cate.equals("levelseven")){
            seven = new Seven();
            for (int a=0; a<20;a++){
                arrayNames[a].setImageResource(seven.getQuestion(a));
            }
        }
        else if(cate.equals("leveleight")){
            eight = new Eight();
            for (int a=0; a<20;a++){
                arrayNames[a].setImageResource(eight.getQuestion(a));
            }
        }
        else if(cate.equals("levelnine")){
            nine = new Nine();
            for (int a=0; a<20;a++){
                arrayNames[a].setImageResource(nine.getQuestion(a));
            }
        }
        else if(cate.equals("levelten")){
            ten = new Ten();
            for (int a=0; a<20;a++){
                arrayNames[a].setImageResource(ten.getQuestion(a));
            }
        }
        else if(cate.equals("leveleleven")){
            eleven = new Eleven();
            for (int a=0; a<20;a++){
                arrayNames[a].setImageResource(eleven.getQuestion(a));
            }
        }
        else if(cate.equals("leveltwelve")){
            twelve = new Twelve();
            for (int a=0; a<20;a++){
                arrayNames[a].setImageResource(twelve.getQuestion(a));
            }
        }
        else if(cate.equals("levelthirteen")){
            thirteen = new Thirteen();
            for (int a=0; a<20;a++){
                arrayNames[a].setImageResource(thirteen.getQuestion(a));
            }
        }
        else if(cate.equals("levelfourteen")){
            fourteen = new Fourteen();
            for (int a=0; a<20;a++){
                arrayNames[a].setImageResource(fourteen.getQuestion(a));
            }
        }
        //navmagazine
      //  picOnePic.setVisibility(View.VISIBLE);
        checkIt=myPrefs.getString(cate, "");
        //Toast.makeText(ListItems.this,"hai"+checkIt,Toast.LENGTH_LONG).show();
        assert checkIt != null;
        for (int q = 0; q<checkIt.length(); q++){
           // assert checkIt != null;
           // char qaz=checkIt.charAt(q);
            if (checkIt.charAt(q)=='T'){
                imageArrayNames[q].setVisibility(View.VISIBLE);
            }

        }
//        picOne.setImageResource(one.getQuestion(1));picTwo.setImageResource(one.getQuestion(2));
//        picThree.setImageResource(one.getQuestion(3));picFour.setImageResource(one.getQuestion(4));
//        picFive.setImageResource(one.getQuestion(5));picSix.setImageResource(one.getQuestion(6));
//        picSeven.setImageResource(one.getQuestion(7));picEight.setImageResource(one.getQuestion(8));
//        picSeven.setImageResource(one.getQuestion(9));picEight.setImageResource(one.getQuestion(10));
//        picOne.setImageDrawable(one.getQuestion(11));picOne.setImageDrawable(one.getQuestion(12));
//        picOne.setImageDrawable(one.getQuestion(13));picOne.setImageDrawable(one.getQuestion(14));
//        picOne.setImageDrawable(one.getQuestion(15));picOne.setImageDrawable(one.getQuestion(16));
//        picOne.setImageDrawable(one.getQuestion(17));picOne.setImageDrawable(one.getQuestion(18));
//        picOne.setImageDrawable(one.getQuestion(19));picOne.setImageDrawable(one.getQuestion(20));

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button getCoin;
                myDialog.setContentView(R.layout.add_gold);
                txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
                getCoin = myDialog.findViewById(R.id.getCoin);
                txtclose.setText("X");
                //    btnFollow = (Button) myDialog.findViewById(R.id.btnfollow);
                txtclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });
                getCoin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (rewardedAd.isLoaded()) {
                            Activity activityContext =  ListItems.this;
                            RewardedAdCallback adCallback = new RewardedAdCallback() {
                                @Override
                                public void onRewardedAdOpened() {
                                    // Ad opened.
                                }

                                @Override
                                public void onRewardedAdClosed() {
                                    Toast.makeText(ListItems.this,"View the ad to get reward",Toast.LENGTH_LONG).show();
                                }

                                @Override
                                public void onUserEarnedReward(@NonNull RewardItem reward) {
                                    Toast.makeText(ListItems.this,"You got 50 coins",Toast.LENGTH_LONG).show();
                                    gold=myPrefs.getInt("GOLD", 0);
                                    gold=gold+50;
                                    editor.putInt("GOLD",gold);
                                    editor.apply();
                                    golden.setText(gold+"");
                                }

                                @Override
                                public void onRewardedAdFailedToShow(int errorCode) {
                                    Toast.makeText(ListItems.this,"Something went wrong, check your internet connection",Toast.LENGTH_LONG).show();
                                }
                            };
                            rewardedAd.show(activityContext, adCallback);
                        } else {
                            Toast.makeText(ListItems.this,"Try again",Toast.LENGTH_LONG).show();
                        }
                    }
                });

                Objects.requireNonNull(myDialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                myDialog.show();

            }
        });
        picOneRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 0;
                Intent intent = new Intent(ListItems.this,PlayArea.class);
                intent.putExtra("key",cate);
                intent.putExtra("value",a);
                startActivity(intent);
            }
        });
        picTwoRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 1;
                Intent intent = new Intent(ListItems.this,PlayArea.class);
                intent.putExtra("key",cate);
                intent.putExtra("value",a);
                startActivity(intent);
            }
        });
        picThreeRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 2 ;
                Intent intent = new Intent(ListItems.this,PlayArea.class);
                intent.putExtra("key",cate);
                intent.putExtra("value",a);
                startActivity(intent);

            }
        });
        picFourRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 3;
                Intent intent = new Intent(ListItems.this,PlayArea.class);
                intent.putExtra("key",cate);
                intent.putExtra("value",a);
                startActivity(intent);

            }
        });
        picFiveRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 4;
                Intent intent = new Intent(ListItems.this,PlayArea.class);
                intent.putExtra("key",cate);
                intent.putExtra("value",a);
                startActivity(intent);

            }
        });
        picSixRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 5;
                Intent intent = new Intent(ListItems.this,PlayArea.class);
                intent.putExtra("key",cate);
                intent.putExtra("value",a);
                startActivity(intent);

            }
        });
        picSevenRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 6;
                Intent intent = new Intent(ListItems.this,PlayArea.class);
                intent.putExtra("key",cate);
                intent.putExtra("value",a);
                startActivity(intent);

            }
        });
        picEightRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 7;
                Intent intent = new Intent(ListItems.this,PlayArea.class);
                intent.putExtra("key",cate);
                intent.putExtra("value",a);
                startActivity(intent);

            }
        });
        picNineRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 8;
                Intent intent = new Intent(ListItems.this,PlayArea.class);
                intent.putExtra("key",cate);
                intent.putExtra("value",a);
                startActivity(intent);

            }
        });
        picTenRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 9;
                Intent intent = new Intent(ListItems.this,PlayArea.class);
                intent.putExtra("key",cate);
                intent.putExtra("value",a);
                startActivity(intent);

            }
        });
        picElevenRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 10;
                Intent intent = new Intent(ListItems.this,PlayArea.class);
                intent.putExtra("key",cate);
                intent.putExtra("value",a);
                startActivity(intent);

            }
        });
        picTwelveRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 11;
                Intent intent = new Intent(ListItems.this,PlayArea.class);
                intent.putExtra("key",cate);
                intent.putExtra("value",a);
                startActivity(intent);

            }
        });
        picThirteenRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 12;
                Intent intent = new Intent(ListItems.this,PlayArea.class);
                intent.putExtra("key",cate);
                intent.putExtra("value",a);
                startActivity(intent);

            }
        });
        picFourteenRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 13;
                Intent intent = new Intent(ListItems.this,PlayArea.class);
                intent.putExtra("key",cate);
                intent.putExtra("value",a);
                startActivity(intent);

            }
        });
        picFifteenRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 14;
                Intent intent = new Intent(ListItems.this,PlayArea.class);
                intent.putExtra("key",cate);
                intent.putExtra("value",a);
                startActivity(intent);

            }
        });
        picSixteenRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 15;
                Intent intent = new Intent(ListItems.this,PlayArea.class);
                intent.putExtra("key",cate);
                intent.putExtra("value",a);
                startActivity(intent);

            }
        });
        picSeventeenRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 16;
                Intent intent = new Intent(ListItems.this,PlayArea.class);
                intent.putExtra("key",cate);
                intent.putExtra("value",a);
                startActivity(intent);

            }
        });
        picEigtheenRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 17;
                Intent intent = new Intent(ListItems.this,PlayArea.class);
                intent.putExtra("key",cate);
                intent.putExtra("value",a);
                startActivity(intent);

            }
        });
        picNineteenRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 18;
                Intent intent = new Intent(ListItems.this,PlayArea.class);
                intent.putExtra("key",cate);
                intent.putExtra("value",a);
                startActivity(intent);

            }
        });
        picTwentyRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 19;
                Intent intent = new Intent(ListItems.this,PlayArea.class);
                intent.putExtra("key",cate);
                intent.putExtra("value",a);
                startActivity(intent);

            }
        });

    }

    @Override
    protected void onResume() {
        checkIt=myPrefs.getString(cate, "");
        assert checkIt != null;
        for (int q = 0; q<checkIt.length(); q++){
            // assert checkIt != null;
            // char qaz=checkIt.charAt(q);
            if (checkIt.charAt(q)=='T'){
                imageArrayNames[q].setVisibility(View.VISIBLE);
            }

        }
        gold=myPrefs.getInt("GOLD", 0);
        golden.setText(gold+"");
        super.onResume();
    }
}
