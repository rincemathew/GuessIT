package com.melisa.melisa.guessit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

import java.util.Objects;

public class CategoryList extends AppCompatActivity {

   // SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);


    // SharedPreferences.Editor editor = pref.edit();
    //int abcd=100;
    ImageButton addButton;
    private RewardedAd rewardedAd;
    int gold;
    AdView madView;
    TextView golden;
    String check;
    Dialog myDialog;
    SharedPreferences myPrefs;
    TextView levelOneTxt,levelTwoTxt,levelThreeTxt,levelFourTxt,levelFiveTxt,levelSixTxt,levelSevenTxt,
            levelEightTxt,levelNineTxt,levelTenTxt, levelElevenTxt,levelTwelveTxt,levelThirteenTxt,levelFourteenTxt;

    LinearLayout firstLevel,secondLevel,thirdLevel,fourthLevel,fifthLevel,sixthLevel,seventhLevel,eightLevel,
            ninthLevel,tenthLevel, eleventhLevel, twelveLevel,thirthinthLevel,fourtheenthLevel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list);

        MobileAds.initialize(this,"ca-app-pub-6234689785392855/3934774065");
        madView=findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        madView.loadAd(adRequest);

        Objects.requireNonNull(getSupportActionBar()).hide();
        myPrefs = this.getSharedPreferences("myPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = myPrefs.edit();

        golden=findViewById(R.id.gold);
        firstLevel=findViewById(R.id.firstLevel);
        secondLevel=findViewById(R.id.secondlevel);
        thirdLevel=findViewById(R.id.thirdlevel);
        fourthLevel=findViewById(R.id.level4);
        fifthLevel=findViewById(R.id.level5);
        sixthLevel=findViewById(R.id.level6);
        seventhLevel=findViewById(R.id.level7);
        eightLevel=findViewById(R.id.level8);
        ninthLevel=findViewById(R.id.level9);
        tenthLevel=findViewById(R.id.level10);
        eleventhLevel=findViewById(R.id.level11);
        twelveLevel=findViewById(R.id.level12);
        thirthinthLevel=findViewById(R.id.level13);
        fourtheenthLevel=findViewById(R.id.level14);
        addButton=findViewById(R.id.addButton);
        levelOneTxt=findViewById(R.id.levelOneTxt);
        levelTwoTxt=findViewById(R.id.levelTwoTxt);
        levelThreeTxt=findViewById(R.id.levelThreeTxt);
        levelFourTxt=findViewById(R.id.levelFourTxt);
        levelFiveTxt=findViewById(R.id.levelFiveTxt);
        levelSixTxt=findViewById(R.id.levelSixTxt);
        levelSevenTxt=findViewById(R.id.levelSevenTxt);
        levelEightTxt=findViewById(R.id.levelEightTxt);
        levelNineTxt=findViewById(R.id.levelNineTxt);
        levelTenTxt=findViewById(R.id.levelTenTxt);
        levelElevenTxt=findViewById(R.id.levelElevenTxt);
        levelTwelveTxt=findViewById(R.id.levelTwelveTxt);
        levelThirteenTxt=findViewById(R.id.levelThirteenTxt);
        levelFourteenTxt=findViewById(R.id.levelFourteenTxt);
        myDialog = new Dialog(this);

        rewardedAd = new RewardedAd(this,
                "ca-app-pub-6234689785392855/9542323965");

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


        check=myPrefs.getString("levelone", null);
        if (check == null ) {
            editor.putString("levelone", "FFFFFFFFFFFFFFFFFFFF");
            editor.putString("leveltwo", "FFFFFFFFFFFFFFFFFFFF");
            editor.putString("levelthree", "FFFFFFFFFFFFFFFFFFFF");
            editor.putString("levelfour", "FFFFFFFFFFFFFFFFFFFF");
            editor.putString("levelfive", "FFFFFFFFFFFFFFFFFFFF");
            editor.putString("levelsix", "FFFFFFFFFFFFFFFFFFFF");
            editor.putString("levelseven", "FFFFFFFFFFFFFFFFFFFF");
            editor.putString("leveleight", "FFFFFFFFFFFFFFFFFFFF");
            editor.putString("levelnine", "FFFFFFFFFFFFFFFFFFFF");
            editor.putString("levelten", "FFFFFFFFFFFFFFFFFFFF");
            editor.putString("leveleleven", "FFFFFFFFFFFFFFFFFFFF");
            editor.putString("leveltwelve", "FFFFFFFFFFFFFFFFFFFF");
            editor.putString("levelthirteen", "FFFFFFFFFFFFFFFFFFFF");
            editor.putString("levelfourteen", "FFFFFFFFFFFFFFFFFFFF");
            editor.apply();
        }
        gold=myPrefs.getInt("GOLD", 0);

        if (gold == 0 ) {
        editor.putInt("GOLD", 100);
        editor.apply();
        }
        gold=myPrefs.getInt("GOLD", 0);
        golden.setText(gold+"");


        getTheStatus();

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtclose;
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
                            Activity activityContext =  CategoryList.this;
                            RewardedAdCallback adCallback = new RewardedAdCallback() {
                                @Override
                                public void onRewardedAdOpened() {
                                    // Ad opened.
                                }

                                @Override
                                public void onRewardedAdClosed() {
                                    Toast.makeText(CategoryList.this,"View the ad to get reward",Toast.LENGTH_LONG).show();
                                }

                                @Override
                                public void onUserEarnedReward(@NonNull RewardItem reward) {
                                    Toast.makeText(CategoryList.this,"You got 50 coins",Toast.LENGTH_LONG).show();
                                    gold=myPrefs.getInt("GOLD", 0);
                                    gold=gold+50;
                                    editor.putInt("GOLD",gold);
                                    editor.apply();
                                    golden.setText(gold+"");
                                }

                                @Override
                                public void onRewardedAdFailedToShow(int errorCode) {
                                    Toast.makeText(CategoryList.this,"Something went wrong, check your internet connection",Toast.LENGTH_LONG).show();
                                }
                            };
                            rewardedAd.show(activityContext, adCallback);
                        } else {
                            Toast.makeText(CategoryList.this,"Try again",Toast.LENGTH_LONG).show();
                        }
                    }
                });

                Objects.requireNonNull(myDialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                myDialog.show();

            }
        });

        firstLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value ="levelone";
                Intent intent = new Intent(CategoryList.this,ListItems.class);
                intent.putExtra("key",value);
                startActivity(intent);
            }
        });
        secondLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value ="leveltwo";
                Intent intent = new Intent(CategoryList.this,ListItems.class);
                intent.putExtra("key",value);
                startActivity(intent);
            }
        });
        thirdLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value ="levelthree";
                Intent intent = new Intent(CategoryList.this,ListItems.class);
                intent.putExtra("key",value);
                startActivity(intent);
            }
        });
        fourthLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value ="levelfour";
                Intent intent = new Intent(CategoryList.this,ListItems.class);
                intent.putExtra("key",value);
                startActivity(intent);
            }
        });
        fifthLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value ="levelfive";
                Intent intent = new Intent(CategoryList.this,ListItems.class);
                intent.putExtra("key",value);
                startActivity(intent);
            }
        });
        sixthLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value ="levelsix";
                Intent intent = new Intent(CategoryList.this,ListItems.class);
                intent.putExtra("key",value);
                startActivity(intent);
            }
        });
        seventhLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value ="levelseven";
                Intent intent = new Intent(CategoryList.this,ListItems.class);
                intent.putExtra("key",value);
                startActivity(intent);
            }
        });
        eightLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value ="leveleight";
                Intent intent = new Intent(CategoryList.this,ListItems.class);
                intent.putExtra("key",value);
                startActivity(intent);
            }
        });
        ninthLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value ="levelnine";
                Intent intent = new Intent(CategoryList.this,ListItems.class);
                intent.putExtra("key",value);
                startActivity(intent);
            }
        });
        tenthLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value ="levelten";
                Intent intent = new Intent(CategoryList.this,ListItems.class);
                intent.putExtra("key",value);
                startActivity(intent);
            }
        });
        eleventhLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value ="leveleleven";
                Intent intent = new Intent(CategoryList.this,ListItems.class);
                intent.putExtra("key",value);
                startActivity(intent);
            }
        });
        twelveLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value ="leveltwelve";
                Intent intent = new Intent(CategoryList.this,ListItems.class);
                intent.putExtra("key",value);
                startActivity(intent);
            }
        });
        thirthinthLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value ="levelthirteen";
                Intent intent = new Intent(CategoryList.this,ListItems.class);
                intent.putExtra("key",value);
                startActivity(intent);
            }
        });
        fourtheenthLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value ="levelfourteen";
                Intent intent = new Intent(CategoryList.this,ListItems.class);
                intent.putExtra("key",value);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onResume() {
        gold=myPrefs.getInt("GOLD", 0);
        golden.setText(gold+"");
        reSumeIdeas();
        getTheStatus();
        super.onResume();

    }
    public void getTheStatus(){
        String checkIt=myPrefs.getString("levelone", "");
        int count = checkIt.length() - checkIt.replace("T", "").length();
        levelOneTxt.setText(count+"/20");
        checkIt=myPrefs.getString("leveltwo", "");
        count = checkIt.length() - checkIt.replace("T", "").length();
        levelTwoTxt.setText(count+"/20");
        checkIt=myPrefs.getString("levelthree", "");
        count = checkIt.length() - checkIt.replace("T", "").length();
        levelThreeTxt.setText(count+"/20");
        checkIt=myPrefs.getString("levelfour", "");
        count = checkIt.length() - checkIt.replace("T", "").length();
        levelFourTxt.setText(count+"/20");
        checkIt=myPrefs.getString("levelfive", "");
        count = checkIt.length() - checkIt.replace("T", "").length();
        levelFiveTxt.setText(count+"/20");
        checkIt=myPrefs.getString("levelsix", "");
        count = checkIt.length() - checkIt.replace("T", "").length();
        levelSixTxt.setText(count+"/20");
        checkIt=myPrefs.getString("levelseven", "");
        count = checkIt.length() - checkIt.replace("T", "").length();
        levelSevenTxt.setText(count+"/20");
        checkIt=myPrefs.getString("leveleight", "");
        count = checkIt.length() - checkIt.replace("T", "").length();
        levelEightTxt.setText(count+"/20");
        checkIt=myPrefs.getString("levelnine", "");
        count = checkIt.length() - checkIt.replace("T", "").length();
        levelNineTxt.setText(count+"/20");
        checkIt=myPrefs.getString("levelten", "");
        count = checkIt.length() - checkIt.replace("T", "").length();
        levelTenTxt.setText(count+"/20");
        checkIt=myPrefs.getString("leveleleven", "");
        count = checkIt.length() - checkIt.replace("T", "").length();
        levelElevenTxt.setText(count+"/20");
        checkIt=myPrefs.getString("leveltwelve", "");
        count = checkIt.length() - checkIt.replace("T", "").length();
        levelTwelveTxt.setText(count+"/20");
        checkIt=myPrefs.getString("levelthirteen", "");
        count = checkIt.length() - checkIt.replace("T", "").length();
        levelThirteenTxt.setText(count+"/20");
        checkIt=myPrefs.getString("levelfourteen", "");
        count = checkIt.length() - checkIt.replace("T", "").length();
        levelFourteenTxt.setText(count+"/20");

        gold=myPrefs.getInt("GOLD", 0);
        if (gold<300){
            levelFiveTxt.setText("300 coins to unlock");
            fifthLevel.setClickable(false);
            levelFiveTxt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lock, 0, 0, 0);
        }
        if (gold<500){
            levelSixTxt.setText("500 coins to unlock");
            sixthLevel.setClickable(false);
            levelSixTxt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lock, 0, 0, 0);
        }
        if (gold<600){
            levelSevenTxt.setText("600 coins to unlock");
            seventhLevel.setClickable(false);
            levelSevenTxt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lock, 0, 0, 0);
        }
        if (gold<700){
            levelEightTxt.setText("700 coins to unlock");
            eightLevel.setClickable(false);
            levelEightTxt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lock, 0, 0, 0);
        }
        if (gold<800){
            levelNineTxt.setText("800 coins to unlock");
            ninthLevel.setClickable(false);
            levelNineTxt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lock, 0, 0, 0);
        }
        if (gold<900){
            levelTenTxt.setText("900 coins to unlock");
            tenthLevel.setClickable(false);
            levelTenTxt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lock, 0, 0, 0);
        }
        if (gold<1000){
            levelElevenTxt.setText("1000 coins to unlock");
            eleventhLevel.setClickable(false);
            levelElevenTxt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lock, 0, 0, 0);
        }
        if (gold<1200){
            levelTwelveTxt.setText("1200 coins to unlock");
            twelveLevel.setClickable(false);
            levelTwelveTxt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lock, 0, 0, 0);
        }
        if (gold<2600){
            levelThirteenTxt.setText("2600 coins to unlock");
            thirthinthLevel.setClickable(false);
            levelThirteenTxt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lock, 0, 0, 0);
        }
        if (gold<2800){
            levelFourteenTxt.setText("2800 coins to unlock");
            fourtheenthLevel.setClickable(false);
            levelFourteenTxt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lock, 0, 0, 0);
        }
    }
    public void reSumeIdeas(){
            fifthLevel.setClickable(true);
            levelFiveTxt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.unlock, 0, 0, 0);
            sixthLevel.setClickable(true);
            levelSixTxt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.unlock, 0, 0, 0);
            seventhLevel.setClickable(true);
            levelSevenTxt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.unlock, 0, 0, 0);
            eightLevel.setClickable(true);
            levelEightTxt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.unlock, 0, 0, 0);
            ninthLevel.setClickable(true);
            levelNineTxt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.unlock, 0, 0, 0);
            tenthLevel.setClickable(true);
            levelTenTxt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.unlock, 0, 0, 0);
            eleventhLevel.setClickable(true);
            levelElevenTxt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.unlock, 0, 0, 0);
            twelveLevel.setClickable(true);
            levelTwelveTxt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.unlock, 0, 0, 0);
            thirthinthLevel.setClickable(true);
            levelThirteenTxt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.unlock, 0, 0, 0);
            fourtheenthLevel.setClickable(true);
            levelFourteenTxt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.unlock, 0, 0, 0);

    }
}
