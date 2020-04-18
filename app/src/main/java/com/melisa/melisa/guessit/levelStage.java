package com.melisa.melisa.guessit;

import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class levelStage extends Activity {

    AdView madView;

    LinearLayout levelone,secondLevel,thirdLevel,level4,level5,level6,level7,level8,level9,level10,level11,
    level12,level13,level14,level15,level16,level17,level18,level19,level20,level21,level22,level23,level24,
    level25,level26,level27,level28,level29,level30;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_stage);

        MobileAds.initialize(this,"ca-app-pub-6234689785392855/6944080780");
        madView=findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        madView.loadAd(adRequest);

        levelone=findViewById(R.id.firstLevel);
        secondLevel=findViewById(R.id.secondlevel);
        thirdLevel=findViewById(R.id.thirdlevel);
        level4=findViewById(R.id.level4);
        level5=findViewById(R.id.level5);
        level6=findViewById(R.id.level6);
        level7=findViewById(R.id.level7);
        level8=findViewById(R.id.level8);
        level9=findViewById(R.id.level9);
        level10=findViewById(R.id.level10);
        level11=findViewById(R.id.level11);
        level12=findViewById(R.id.level12);
        level13=findViewById(R.id.level13);
        level14=findViewById(R.id.level14);
        level15=findViewById(R.id.level15);
        level16=findViewById(R.id.level16);
        level17=findViewById(R.id.level17);
        level18=findViewById(R.id.level18);
        level19=findViewById(R.id.level19);
        level20=findViewById(R.id.level20);
        level21=findViewById(R.id.level21);
        level22=findViewById(R.id.level22);
        level23=findViewById(R.id.level23);
        level24=findViewById(R.id.level24);
        level25=findViewById(R.id.level25);
        level26=findViewById(R.id.level26);
        level27=findViewById(R.id.level27);
        level28=findViewById(R.id.level28);
        level29=findViewById(R.id.level29);
        level30=findViewById(R.id.level30);



        //final TextView level1=findViewById(R.id.level1);

        levelone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                String category = "SEA ANIMALS";
                Intent intent= new Intent(levelStage.this,quizActivityOne.class);
                intent.putExtra("category", category);
                //intent.putExtra("SCORE", score);
                startActivity(intent);
            }
        });

        secondLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneTwo.class);
                String category = "FLAGS";
                int categoryLevel = 2;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        thirdLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneTwo.class);
                String category = "BIRDS";
                int categoryLevel = 3;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "FRUITS";
                int categoryLevel = 4;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "SPORTS";
                int categoryLevel = 5;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "VEGETABLES";
                int categoryLevel = 6;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "FLAGS";
                int categoryLevel = 7;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "KITCHEN ITEM";
                int categoryLevel = 8;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "FLOWERS";
                int categoryLevel = 9;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "PLACES";
                int categoryLevel = 10;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "ANIMAL BODY";
                int categoryLevel = 11;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "SHAPES";
                int categoryLevel = 12;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "FLAGS";
                int categoryLevel = 13;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "ANIMALS";
                int categoryLevel = 14;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "SPORTS";
                int categoryLevel = 15;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "BIRDS";
                int categoryLevel = 16;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "INSECTS";
                int categoryLevel = 17;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "FLOWERS";
                int categoryLevel = 18;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "FLAGS";
                int categoryLevel = 19;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "VEGETABLES";
                int categoryLevel = 20;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "KITCHEN";
                int categoryLevel = 21;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "DRY FRUITS";
                int categoryLevel = 22;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "SPORTS";
                int categoryLevel = 23;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "ANIMALS";
                int categoryLevel = 24;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "FLAGS";
                int categoryLevel = 25;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "PLACES";
                int categoryLevel = 26;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "FLOWERS";
                int categoryLevel = 27;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "BIRDS";
                int categoryLevel = 28;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "FRUITS";
                int categoryLevel = 29;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

        level30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //level1.setText("continue");
                Intent intent= new Intent(levelStage.this,questionActivityOneThree.class);
                String category = "FLAGS";
                int categoryLevel = 30;
                intent.putExtra("category", category);
                intent.putExtra("categoryLevel", categoryLevel);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(levelStage.this, MainPlay.class);
        startActivity(intent);
    }
}
